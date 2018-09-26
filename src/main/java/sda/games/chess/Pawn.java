package sda.games.chess;

import static sda.games.chess.Color.BLACK;
import static sda.games.chess.Color.WHITE;

public class Pawn extends Figure {

    private Player currentPlayer;
    private Player player1;
    private Player player2;

    public Pawn(Color color) {
        super(color);
    }

    public Spot[][] spots;

    @Override
    public boolean isMoveValid(Move move) {

        player1 = new Player(WHITE);
        player2 = new Player(BLACK);
        currentPlayer = player1;

        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if (currentPlayer.equals(BLACK)) {
            if (toY - fromY != 1) {
                return false;
            }
            if (toY - fromY != 1 && toX - fromX != 1) {
                return false;
            }
            if (toY - fromY != 1 && toX - fromX != -1) {
                return false;
            }
            return true;
        } else if(currentPlayer.equals(WHITE)){
            if (toY - fromY != -1) {
                return false;
            }
            if (toY - fromY != -1 && toX - fromX != 1) {
                return false;
            }
            if (toY - fromY != -1 && toX - fromX != -1) {
                return false;
            }

        }
        return true;
    }
}
