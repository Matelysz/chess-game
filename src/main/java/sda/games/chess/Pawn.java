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

    @Override
    public boolean isMoveValid(Move move) {

        player1 = new Player(WHITE);
        player2 = new Player(BLACK);
        currentPlayer = player1;


        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        if(getColor().equals(BLACK)) {
            if (toY - fromY != 1) {
                return false;
            } else {
                if (toY - fromY != 1 && (toX- fromX != 1 || toX - fromX != -1)) {
                    return true;
                }
            }
            return true;
        } else if (getColor().equals(WHITE)) {
            if (toY - fromY != -1) {
                return false;
            } else {
                if (toY - fromY != -1 && (toX - fromX != 1 || toX - fromX != -1)) {
                    return true;
                }
            }
            return true;

        }
        return false;
    }
}



