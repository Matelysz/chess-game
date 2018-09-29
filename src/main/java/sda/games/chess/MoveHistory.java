package sda.games.chess;

import java.util.PriorityQueue;

public class MoveHistory {
    private Board board;
    private Spot[][] spots;
    private int totalNumberOfPiecesBeforeMove;
    private int totalNumberOfPiecesAfterMove;
    private int rule50;

    public int countPiecesBeforeMOve(){
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (!spots[i][j].isEmpty()) totalNumberOfPiecesBeforeMove++;
            }
        }
        return totalNumberOfPiecesBeforeMove;
    }

    public int countPiecesAfterMove(){
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (!spots[i][j].isEmpty()) totalNumberOfPiecesAfterMove++;
            }
        }
        return totalNumberOfPiecesAfterMove;
    }

    public boolean checkRule50() {
        if (totalNumberOfPiecesBeforeMove==totalNumberOfPiecesAfterMove) rule50++;
        else rule50=0;

        if (rule50==50) return true;
        else return false;
    }
}
