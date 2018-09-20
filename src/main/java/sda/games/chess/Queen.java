package sda.games.chess;

public class Queen extends Figure {

    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(Move move) {
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if ((fromX - toX == fromY - toY || fromX - toX == -(fromY - toY)) || (fromX - toX != 0 && fromY - toY == 0) || (fromX - toX == 0 && fromY - toY != 0)) {
            return true;
        } else return false;

    }
}
