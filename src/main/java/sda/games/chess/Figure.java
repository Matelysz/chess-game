package sda.games.chess;

public abstract class Figure  {

    public abstract boolean isMoveValid(Move move);

    public Color setColor(Color color) {
        return color;
    }

}