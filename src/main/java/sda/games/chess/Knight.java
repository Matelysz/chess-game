package sda.games.chess;

public class Knight extends Figure {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(Move move) {

        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();


        if (toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2 || toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1) {
            return false;
        }
            return true;
        }
    }

