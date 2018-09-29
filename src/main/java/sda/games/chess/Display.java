
package sda.games.chess;

public class Display {

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


    public void printDisplay(Spot[][] spots) {

        String[][] displayBoard = getDisplayBoard(spots);
        System.out.print("\t" + "A\t" + "B\t" + "C \t" + "D\t" + "E\t" + "F\t" + "G\t" + "H\n");
        for (int i = 1; i < displayBoard.length; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j < displayBoard[0].length; j++) {
                System.out.print(displayBoard[j][i] + "\t");
            }
            System.out.print("\n");
        }
    }

    private String[][] getDisplayBoard(Spot[][] spots) {
        String[][] displayBoard = new String[spots.length][spots[0].length];
        for (int i = 1; i < spots.length; i++) {
            for (int j = 1; j < spots[0].length; j++) {
                displayBoard[j][i] = getVisualRepresentation(spots[j][i]);
            }

        }
        return displayBoard;
    }

    private String getVisualRepresentation(Spot spot) {
        if (spot.isEmpty()) {
            return "\u25AC";
        }
        if (spot.getFigure() instanceof King)
        {
            if (spot.getFigure().getColor().equals(Color.WHITE))
            {
                return "\u265A";
            } else {
                return "\u2654";
            }
        }

        if (spot.getFigure() instanceof Bishop)
        {
            if (spot.getFigure().getColor().equals(Color.WHITE))
            {
                return "\u265D";
            } else {
                return "\u2657";
            }
        }

        if (spot.getFigure() instanceof Knight)
        {
            if (spot.getFigure().getColor().equals(Color.WHITE))
            {
                return "\u265E";
            } else {
                return "\u2658";
            }
        }

        if (spot.getFigure() instanceof Pawn)
        {
            if (spot.getFigure().getColor().equals(Color.WHITE))
            {
                return "\u265F";
            } else {
                return "\u2659";
            }
        }

        if (spot.getFigure() instanceof Queen)
        {
            if (spot.getFigure().getColor().equals(Color.WHITE))
            {
                return "\u265B";
            } else {
                return "\u2655";
            }
        }

        if (spot.getFigure() instanceof Rook)
        {
            if (spot.getFigure().getColor().equals(Color.WHITE))
            {
                return "\u265C";
            } else {
                return "\u2656";
            }
        }

        return "\u25AC";
    }

}
