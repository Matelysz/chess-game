package sda.games.chess;

public class Bishop extends Figure{

    @Override
    public boolean isMoveValid(Move move){
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if (fromX-toX == fromY-toY || fromX-toX==-(fromY-toY) ){
            return true;

        } else
            return false;


    }
}
