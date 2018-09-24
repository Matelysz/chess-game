package sda.games.chess;
public class Pawn extends Figure {
    public Pawn(Color color) {
        super(color);
    }
    public Spot[][] spots;
    @Override
    public boolean isMoveValid(Move move) {
//        Pawn pawnW = new Pawn(Color.WHITE);
//        Pawn pawnB = new Pawn(Color.BLACK);
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();
        if (toY - fromY != 1 && toY - fromY != -1) {
            return false;
        }
        if ((toY - fromY != 1 && toY - fromY != -1) && toX - fromX != 1) {
            return false;
        }
        if ((toY - fromY != 1 && toY - fromY != -1) && toX - fromX != -1) {
            return false;
        }
        return true;
    }
}