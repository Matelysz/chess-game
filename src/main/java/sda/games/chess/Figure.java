package sda.games.chess;

public abstract class Figure  {

    private Color color;
    private Spot[][] spots;


    public Figure(Color color) {
        this.color = color;
    }

    public abstract boolean isMoveValid(Move move);

    public void setColor(Color color) {
    }

    public Color getColor(){

        return this.color;

    }

}