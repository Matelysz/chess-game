package sda.games.chess;

public class Knight extends Figure {

    @Override
    public boolean isMoveValid(Move move) {

        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if (toY - fromY == 2 && toX - fromX == 1) {
            if (toY - fromY == 2 && toX - fromX == -1) {
                if (toY - fromY == -2 && toX - fromX == 1) {
                    if (toY - fromY == -2 && toX - fromX == -1) {
                        return false;

                    }
                    return false;
                }
                return false;
            }
            return false;
        } else {
            return true;


        }
    }
}
