package sda.games.chess;

public class Board {
    private Spot[][] spots;
    private GameState gameState;
    private MoveHistory moveHistory;




    public boolean makeAMove(Move move, Player currentPlayer) {
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        int distanceX = toX - fromX;
        int distanceY = toY - fromY;

        moveHistory.countPiecesBeforeMOve();
        if (!spots[fromX][fromY].isEmpty()) {// czy nie ruszam z pustego pola
            if(spots[fromX][fromY].getFigure().getColor()==currentPlayer.getColor()){//czy ruszam swoim
            if (spots[fromX][fromY].getFigure().isMoveValid(move)) { // czy ruch jest w zakresie ruchów figury
                if ((spots[toX][toY].isEmpty()) || (spots[toX][toY].getFigure().getColor() != currentPlayer.getColor())){
                    // czy miejsce docelowe jest puste lub ruszam na zajęte ale tylko przez wroga miejsce
                    if (checkIfSpotsInAWayAreEmpty(fromX, fromY, distanceX, distanceY)) { // czy nie ma nic po drodze
                        spots[toX][toY].setFigure(spots[fromX][fromY].getFigure());//ustawiam na docelowym miejscu figurę
                        spots[toX][toY].setEmpty(false);//teraz to pole nie jest empty
                        spots[fromX][fromY].setEmpty(true);// zeruje jej poprzednie miejsce na empty
                        spots[fromX][fromY].setFigure(null);//i zeruje figure na nulla
                        moveHistory.countPiecesAfterMove();
                        checkEndgameCondition();
                        return true;  // poprawnie wykonany ruch zwraca true
                    }
                }
                }
            }
        }
        return false;
    }

    private void checkEndgameCondition() {
        if (isCheckmate()) {
            this.gameState = GameState.ENDED;
        } else if (isDraw()) {
            this.gameState = GameState.DRAW;
        }
    }

    private boolean isDraw() {
        int numberOfPawns = 0;
        int numberOfRooks = 0;
        int numberOfKnights = 0;
        int numberOfBishops = 0;
        int numberOfQueens = 0;
        int numberOfKings = 0;
        int totalNumberOfPieces = 0;

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (spots[i][j].getFigure() instanceof Pawn) {numberOfPawns++; totalNumberOfPieces++;}
                else if (spots[i][j].getFigure() instanceof Rook) {numberOfRooks++; totalNumberOfPieces++;}
                else if (spots[i][j].getFigure() instanceof Knight) {numberOfKnights++; totalNumberOfPieces++;}
                else if (spots[i][j].getFigure() instanceof Queen) {numberOfQueens++; totalNumberOfPieces++;}
                else if (spots[i][j].getFigure() instanceof King) {numberOfKings++; totalNumberOfPieces++;}
                else if (spots[i][j].getFigure() instanceof Bishop) {numberOfBishops++; totalNumberOfPieces++;}
            }
        }

        if (totalNumberOfPieces==2 && numberOfKings==2) return true;
        if (totalNumberOfPieces==3 && numberOfKings==2 && numberOfBishops==1) return true;
        if (totalNumberOfPieces==3 && numberOfKings==2 && numberOfKnights==1) return true;
        if (moveHistory.checkRule50()) return true;
        return false;
    }

    private boolean isCheckmate() {
    return false;
    }


    private boolean checkIfSpotsInAWayAreEmpty(int fromX, int fromY, int distanceX, int distanceY) {
        boolean empty = false;

        int absDistanceX = Math.abs(distanceX);
        int absDistanceY = Math.abs(distanceY);

        if(spots[fromX][fromY].getFigure() instanceof Knight){
            empty=true;
        }
        if (absDistanceY == absDistanceX) {  // jesli ten warunek spełniony to figura idzie po skosie

            for (int i = 0; i <= absDistanceX; i++) {

                if (distanceX > 0 && distanceY > 0) {
                    fromX++;
                    fromY++;

                    if (spots[fromX][fromY].isEmpty()) {
                        empty = true;

                    }
                } else if (distanceX < 0 && distanceY > 0) {
                    fromX--;
                    fromY++;

                    if (spots[fromX][fromY].isEmpty()) {
                        empty = true;


                    }
                } else if (distanceX < 0 && distanceY < 0) {
                    fromX--;
                    fromY--;
                    if (spots[fromX][fromY].isEmpty()) {
                        empty = true;

                    }

                } else if (distanceX > 0 && distanceY < 0) {
                    fromX++;
                    fromY--;

                    if (spots[fromX][fromY].isEmpty()) {
                        empty = true;


                    }
                }

            }


        }

        if (absDistanceY > 0 && absDistanceX == 0) { // jeśli ten warunek spoeniony to figura idzie góra dół
            for (int i = 0; i <= absDistanceY; i++) {

                if (distanceY < 0) { // jeśli idzie w dół
                    fromY--;
                    if (spots[fromX][fromY].isEmpty()) {
                        empty = true;

                    }
                } else if (distanceY > 0) { // jeśli idzie w góre
                    fromY++;
                    if (spots[fromX][fromY].isEmpty()) {
                        empty = true;
                    }


                }
            }
        }

        if (absDistanceX > 0 && absDistanceY == 0) { // jeśli ten warunek spełniony to figura idzie na boki
            for (int i = 0; i <= absDistanceX; i++) {

                if (distanceX > 0) {
                    fromX++;
                    if (spots[fromX][fromY].isEmpty()) { // idzie w prawo
                        empty = true;

                    }
                } else if (distanceX < 0) {
                    fromX--;
                    if (spots[fromX][fromY].isEmpty()) { // idzie w lewo
                            empty = true;

                        }

                }
            }
        }
        return empty;
    }

//
//
//        //sprawdzić czy dane pole nie jest puste
//        // jak coś stoi, to czy ruch ktory chce wykonać jest valid z punktu widzenia figury
//        //jak jest ok, to - nie może wykraczać poza plansze
//        // - nie może mieć nic po drodze
//        // - sprawdzić czy pole jest wolne na ktore chce isć
//        // - jak wolne to super, staje tam i nara
//        //- jak zajęte to bije (skoro ruch jest valid to mogę, innym przypadkiem jest pionek)
//        // - jak pionek  to w pionku musi być implementacja że ruch po skosie jest valid tylko gdy coś na nim stoi == chce bić
//        // - wszystko to jescze opakować w warunek że mogę ruszyć tylko swoją figurą
//        // - no i bic nie mogę swoich figur
//
//
//    }

    public Board() {
        BoardGenerator boardGenerator = new BoardGenerator();
        this.spots = boardGenerator.generateBoard();
        this.gameState = GameState.INPROGRESS;
    }

    public GameState getGameState() {
        return gameState;
    }

}
