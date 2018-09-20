package sda.games.chess;

import static sda.games.chess.Color.Black;
import static sda.games.chess.Color.White;

public class Pawn extends Figure {

    @Override
    public boolean isMoveValid(Move move) {

        Player player1 = new Player();
        Player player2 = new Player();


        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();


        if(currentPlayer == Player1){
            if (toY - fromY != 1 || (toY - fromY != 1 && toX - fromY != 1) && fromX - toX != 1) {
                return false;
            }

            return true;
        }
    }
}


