package sda.games.chess;

public class King extends Figure {

    @Override
    public boolean isMoveValid(Move move) {
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if (fromX - toX <= 1 && fromX - toX >= -1) {
            if (fromY - toY <= 1 && fromY - toY >= -1) {
                if (fromX - toX == 0 && fromY - toY == 0) {
                    return false;
                }
                return true;
            } else return false;
        } else return false;


    }

}
