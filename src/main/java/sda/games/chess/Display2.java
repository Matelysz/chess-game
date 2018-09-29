package sda.games.chess;

public class Display2 {

//    BLACK
//    king   ♔ u2654
//    queen  ♕ u2655
//    rook   ♖ u2656
//    bishop    u2657
//    knight ♘ u2658
//    pawn   ♙ u2659
//    WHITE
//    king   ♚ u265A
//    queen  ♛ u265B
//    rook   ♜ u265C
//    bishop ♝ u265D
//    knight ♞ u265E
//    pawn   ♟ u265F
String[][] chessBoardDisplay = {{"  ","A"," B ","  C "," D ","  E ","  F "," G ","  H "},
                                {"1","\u2656","\u2658","\u2657","\u2654","\u2655","\u2657","\u2658","\u2656"},
                                {"2","\u2659","\u2659","\u2659","\u2659","\u2659","\u2659","\u2659","\u2659"},
                                {"3","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC"},
                                {"4","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC"},
                                {"5","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC"},
                                {"6","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC","\u25AC"},
                                {"7","\u265F","\u265F","\u265F","\u265F","\u265F","\u265F","\u265F","\u265F"},
                                {"8","\u265C","\u265E","\u265D","\u265A","\u265B","\u265D","\u265E","\u265C"}};

    public void printDisplay(){
        for (int i = 0; i <= 8; i ++) {
            for (int j = 0; j <= 8; j++) {
                System.out.printf("%-3s",chessBoardDisplay[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public void updateChessBoardDisplayAfterMove(String[][] chessBoardDisplay, Move move){
        chessBoardDisplay[move.getToY()][move.getToX()] = chessBoardDisplay[move.getFromY()][move.getFromX()];
        chessBoardDisplay[move.getFromY()][move.getFromX()] = "\u25AC";
    }
}
