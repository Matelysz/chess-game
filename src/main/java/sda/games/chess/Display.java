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

    String[][] addressesOfFiguresAndCorrespondingCharacters = new String[4][16];

    public void main(Spot[][] spots) {

        fillArraywithAddressesOfFiguresAndCorrespondingCharactersLONGVERSION(spots);

    }

    public void printDisplay(Spot[][] spots) {

        char[][] chessboard = generateEmpltyBoardToPrint();
        char[][] setOfFigures = getSetOfFigures(spots);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (setOfFigures[i][j] != 'X') {
                   chessboard[i][j] = setOfFigures[i][j];
                }
            }
        }

        System.out.println(print(chessboard));

    }

    public void fillArraywithAddressesOfFiguresAndCorrespondingCharactersLONGVERSION(Spot[][] spots) {

        addressesOfFiguresAndCorrespondingCharacters[0][0] = spots[1][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][1] = spots[2][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][2] = spots[3][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][3] = spots[4][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][4] = spots[5][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][5] = spots[6][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][6] = spots[7][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][7] = spots[8][1].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][8] = spots[1][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][9] = spots[2][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][10] = spots[3][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][11] = spots[4][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][12] = spots[5][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][13] = spots[6][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][14] = spots[7][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[0][15] = spots[8][2].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][0] = spots[1][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][1] = spots[2][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][2] = spots[3][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][3] = spots[4][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][4] = spots[5][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][5] = spots[6][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][6] = spots[7][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][7] = spots[8][7].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][8] = spots[1][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][9] = spots[2][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][10] = spots[3][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][11] = spots[4][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][12] = spots[5][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][13] = spots[6][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][14] = spots[7][8].getFigure().toString().substring(20, 28);
        addressesOfFiguresAndCorrespondingCharacters[1][15] = spots[8][8].getFigure().toString().substring(20, 28);

        addressesOfFiguresAndCorrespondingCharacters[2][0] = "\u2656";
        addressesOfFiguresAndCorrespondingCharacters[2][1] = "\u2658";
        addressesOfFiguresAndCorrespondingCharacters[2][2] = "\u2657";
        addressesOfFiguresAndCorrespondingCharacters[2][3] = "\u2655";
        addressesOfFiguresAndCorrespondingCharacters[2][4] = "\u2654";
        addressesOfFiguresAndCorrespondingCharacters[2][5] = "\u2657";
        addressesOfFiguresAndCorrespondingCharacters[2][6] = "\u2658";
        addressesOfFiguresAndCorrespondingCharacters[2][7] = "\u2656";
        addressesOfFiguresAndCorrespondingCharacters[2][8] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][9] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][10] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][11] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][12] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][13] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][14] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[2][15] = "\u2659";
        addressesOfFiguresAndCorrespondingCharacters[3][0] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][1] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][2] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][3] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][4] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][5] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][6] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][7] = "\u265F";
        addressesOfFiguresAndCorrespondingCharacters[3][8] = "\u265C";
        addressesOfFiguresAndCorrespondingCharacters[3][9] = "\u265E";
        addressesOfFiguresAndCorrespondingCharacters[3][10] = "\u265D";
        addressesOfFiguresAndCorrespondingCharacters[3][11] = "\u265B";
        addressesOfFiguresAndCorrespondingCharacters[3][12] = "\u265A";
        addressesOfFiguresAndCorrespondingCharacters[3][13] = "\u265D";
        addressesOfFiguresAndCorrespondingCharacters[3][14] = "\u265E";
        addressesOfFiguresAndCorrespondingCharacters[3][15] = "\u265C";

    }

    public char[][] generateEmpltyBoardToPrint() {
        //white square - ■ u25A0
        char[][] emptyBoard = new char[9][9];
        for (int i = 1; i < 9; i = i + 2) {
            for (int j = 1; j < 9; j = j + 2) {
                emptyBoard[i][j] = '\u25A0';
                emptyBoard[i - 1][j] = ' ';
                emptyBoard[i - 1][j - 1] = '\u25A0';
                emptyBoard[i][j - 1] = ' ';
            }
        }
        return emptyBoard;
    }

    public char[][] getSetOfFigures(Spot[][] spots) {
        char[][] setOfFigures = new char[9][9];
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 15; l++) {
                        try {
                            if (spots[i][j].getFigure().toString().substring(20, 28)
                                    .equals(addressesOfFiguresAndCorrespondingCharacters[k][l]) == true) {
                                setOfFigures[i][j] = whichFigureItIs(spots[i][j].getFigure().toString().substring(20, 28));
                            }
                        } catch (NullPointerException e) {
                            setOfFigures[i][j] = 'X';
                        }
                    }
                }
            }
        }
        return setOfFigures;
    }

    public char whichFigureItIs(String str) {
        char figure = 'X';
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 15; j++) {
                if(addressesOfFiguresAndCorrespondingCharacters[i][j].equals(str) == true) {
                    figure = addressesOfFiguresAndCorrespondingCharacters[i + 2][j].charAt(0);
                }
            }
        }
        return figure;
    }

    public String print(char[][] chessboard) {

        String chessboardToString = "";
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                chessboardToString = chessboardToString + chessboard[j][i];
            }
            chessboardToString = chessboardToString + "\n" + (i + 1);
        }
        chessboardToString = " A B C D E F G H" + chessboardToString;

        return chessboardToString.substring(0, chessboardToString.length() - 1);
    }

}



