package sda.games.chess;

public class Rook extends Figure {

    @Override
    public boolean isMoveValid(Move move){
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if (fromX-toX!=0 && fromY-toY==0){
                return true;
            } else if (fromX-toX==0 && fromY-toY!=0){
            return  true;
        } else return false;




    }
}
