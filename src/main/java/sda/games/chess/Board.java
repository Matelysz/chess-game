package sda.games.chess;

public class Board {
   public Spot[][] spots;
    private boolean isCheckmate;
    private boolean isDraw;
    private GameState gameState;




    public boolean makeAMove(Move move, Player currentPlayer) {
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        int distanceX = toX - fromX;
        int distanceY = toY - fromY;

        if (!spots[fromX][fromY].isEmpty()) {// czy nie ruszam z pustego pola
            if(spots[fromX][fromY].getFigure().getColor()==currentPlayer.getColor()){//czy ruszam swoim
            if (spots[fromX][fromY].getFigure().isMoveValid(move)) { // czy ruch jest w zakresie ruchów figury
                if ((spots[toX][toY].isEmpty()) || (spots[toX][toY].getFigure().getColor() != currentPlayer.getColor())){
                    // czy miejsce docelowe jest puste lub ruszam na zajęte ale tylko przez wroga miejsce
                    if (checkIfSpotsInAWayAreEmpty(fromX, fromY, distanceX, distanceY)) { // czy nie ma nic po drodze
                        spots[toX][toY].setFigure(spots[fromX][fromY].getFigure());//ustawiam na docelowym miejscu figurę
                        spots[fromX][fromY].setEmpty(true);// zeruje jej poprzednie miejsce na empty
                        return true;  // poprawnie wykonany ruch zwraca true
                    }


                }
                }
            }


        }
        return false;
    }

    private boolean checkIfSpotsInAWayAreEmpty(int fromX, int fromY, int distanceX, int distanceY) {
        boolean empty = false;
        if (Math.abs(distanceY) == Math.abs(distanceX)){  // jesli ten warunek spełniony to figura idzie po skosie

            for (int i = fromX; i < Math.abs(distanceX); ) {
                int j = fromY;
                if (distanceX > 0 && distanceY > 0) {
                    i++;
                    j++;

                    if (spots[i][j].isEmpty()) {
                        empty = true;

                    }
                } else if (distanceX < 0 && distanceY > 0) {
                    i--;
                    j++;

                    if (spots[i][j].isEmpty()) {
                        empty = true;


                    }
                } else if (distanceX < 0 && distanceY < 0) {
                    i--;
                    j--;
                    if (spots[i][j].isEmpty()) {
                        empty = true;

                    }

                } else if (distanceX > 0 && distanceY < 0) {
                    i++;
                    j--;

                    if (spots[i][j].isEmpty()) {
                        empty = true;


                    }
                }

            }


        }

        if (Math.abs(distanceY) > 0 && Math.abs(distanceX) == 0) { // jeśli ten warunek spoeniony to figura idzie góra dół
            for (int i = fromY; i < Math.abs(distanceY); ) {
                int j = fromX;
                if (distanceY > 0) { // jeśli idzie w góre
                    i++;
                    if (spots[j][i].isEmpty()) {
                        empty = true;

                    } else if (distanceY < 0) { // jeśli idzie w dół
                        i--;
                        if (spots[j][i].isEmpty()) {
                            empty = true;

                        }
                    }
                }
            }
        }

        if (Math.abs(distanceX) > 0 && Math.abs(distanceY) == 0) { // jeśli ten warunek spełniony to figura idzie na boki
            for (int i = fromX; i < Math.abs(distanceX); ) {
                int j = fromY;
                if (distanceX > 0) {
                    i++;
                    if (spots[i][j].isEmpty()) { // idzie w prawo
                        empty = true;

                    } else if (distanceX < 0) {
                        i--;
                        if (spots[i][j].isEmpty()) { // idzie w lewo
                            empty = true;

                        }
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
