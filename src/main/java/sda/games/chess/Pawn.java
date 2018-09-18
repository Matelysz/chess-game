package sda.games.chess;

public class Pawn extends Figure{

    @Override
    public boolean isMoveValid(Move move){

        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if(toX - fromX == 0 && toY - fromY ==1) {
            if(fromX - toX == 0 && fromY - toY == 1) {
                return false;
            }
           return false;
        }
        return true;
    }
}
