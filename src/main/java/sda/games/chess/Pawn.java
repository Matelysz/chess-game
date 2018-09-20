package sda.games.chess;

public class Pawn extends Figure {

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(Move move) {
        return false;
    }
}