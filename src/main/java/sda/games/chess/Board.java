package sda.games.chess;
public class Board {
    private Spot[][] spots;
    private GameState gameState;
    public boolean makeAMove(Move move, Player currentPlayer) {
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();
        int distanceX = toX - fromX;
        int distanceY = toY - fromY;
        if (moveNotFromEmptySpot(spots[fromX][fromY])) {
            if(playerMovesHisOwnFigure(spots[fromX][fromY], currentPlayer)){
                if (spots[fromX][fromY].getFigure().isMoveValid(move)) {
                    if (isMoveToSpotAllowed(spots [fromX][fromY],spots[toX][toY], currentPlayer, distanceX,distanceY)){
                        if (checkIfSpotsInAWayAreEmpty(fromX, fromY, distanceX, distanceY)) {
                            spots[toX][toY].setFigure(spots[fromX][fromY].getFigure());
                            spots[toX][toY].setEmpty(false);//teraz to pole nie jest empty
                            spots[fromX][fromY].setEmpty(true);// zeruje jej poprzednie miejsce na empty
                            spots[fromX][fromY].setFigure(null);//i zeruje figure na nulla
                            checkEndgameCondition();
                            return true;  // poprawnie wykonany ruch zwraca true
                        }
                    }
                }
            }
        }
        return false;
    }
    private boolean isMoveToSpotAllowed(Spot from, Spot destination, Player currentPlayer,int distanceX, int distanceY) {
        // czy miejsce docelowe jest puste lub ruszam na zajęte ale tylko przez wroga miejsce
        return (additionalFigureRelatedConditionsAreFulfiled(from, destination, distanceX,distanceY, currentPlayer)) && ((destination.isEmpty()) || (destination.getFigure().getColor() != currentPlayer.getColor()));
    }
    private boolean additionalFigureRelatedConditionsAreFulfiled(Spot from, Spot destination, int distanceX, int distanceY, Player currentPlayer) {
        if (from.getFigure() instanceof Pawn) {
            if (destination.isEmpty()) {
                if (distanceX != 0 && distanceY != 0) {
                    return false;
                }
            } else if (destination.getFigure().getColor() != currentPlayer.getColor()) {
                if (distanceY != 0 && distanceX == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean playerMovesHisOwnFigure(Spot spot, Player currentPlayer) {
        return spot.getFigure().getColor()==currentPlayer.getColor();
    }
    private boolean moveNotFromEmptySpot(Spot spot) {
        return !spot.isEmpty();
    }
    private void checkEndgameCondition() {
        if (isCheckmate()) {
            this.gameState = GameState.ENDED;
        } else if (isDraw()) {
            this.gameState = GameState.DRAW;
        }
    }
    private boolean isDraw() {
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
            for (int i = 0; i < absDistanceX; i++) {
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
            if (absDistanceX ==1){
                empty= true;
            }
        }
        if (absDistanceY > 0 && absDistanceX == 0) {// jeśli ten warunek spoeniony to figura idzie góra dół
            for (int i = 0; i < absDistanceY; i++) {
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
            if (absDistanceY == 1){
                empty= true;
            }
        }
        if (absDistanceX > 0 && absDistanceY == 0) { // jeśli ten warunek spełniony to figura idzie na boki
            for (int i = 0; i < absDistanceX; i++) {
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
            if (absDistanceX==1){
                empty = true;
            }
        }
        return empty;
    }
    public Board() {
        BoardGenerator boardGenerator = new BoardGenerator();
        this.spots = boardGenerator.generateBoard();
        this.gameState = GameState.INPROGRESS;
    }
    public GameState getGameState() {
        return gameState;
    }

    public Spot[][] getSpots() {
        return spots;
    }
}