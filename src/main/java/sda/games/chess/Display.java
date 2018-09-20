package sda.games.chess;

public class Display {

//    white chess king     ♔    U+2654
//    white chess queen ♕    U+2655
//    white chess rook     ♖    U+2656
//    white chess bishop         u2657
//    white chess knight ♘    U+2658
//    white chess pawn     ♙    U+2659
//    black chess king     ♚    U+265A
//    black chess queen     ♛    U+265B
//    black chess rook     ♜    U+265C
//    black chess bishop ♝    U+265D
//    black chess knight     ♞    U+265E
//    black chess pawn     ♟    U+265F

    private Board board;
    private Figure figure;

    String[][] addressesOfFiguresAndCorrespondingCharacters;

    private String blackLeftRookAdress;
    private String blackLeftKnightAdress;
    private String blackLeftBishopAdress;
    private String blackQueenAdress;
    private String blackKingAdress;
    private String blackRightBishopAdress;
    private String blackRightKnightAdress;
    private String blackRightRookAdress;
    private String blackPawn1Adress;
    private String blackPawn2Adress;
    private String blackPawn3Adress;
    private String blackPawn4Adress;
    private String blackPawn5Adress;
    private String blackPawn6Adress;
    private String blackPawn7Adress;
    private String blackPawn8Adress;
    private String whitePawn1Adress;
    private String whitePawn2Adress;
    private String whitePawn3Adress;
    private String whitePawn4Adress;
    private String whitePawn5Adress;
    private String whitePawn6Adress;
    private String whitePawn7Adress;
    private String whitePawn8Adress;
    private String whiteLeftRookAdress;
    private String whiteLeftKnightAdress;
    private String whiteLeftBishopAdress;
    private String whiteQueenAdress;
    private String whiteKingAdress;
    private String whiteRightBishopAdress;
    private String whiteRightKnightAdress;
    private String whiteRightRookAdress;

    public void main(Spot[][] spots) {

        setAdresses(spots);
        setCharactertToFigures(spots);

    }

    public void setAdresses(Spot[][] spots) {
        blackLeftRookAdress = spots[1][1].getFigure().toString().substring(21, 29);
        blackLeftKnightAdress = spots[1][2].getFigure().toString().substring(21, 29);
        blackLeftBishopAdress = spots[1][3].getFigure().toString().substring(21, 29);
        blackQueenAdress = spots[1][4].getFigure().toString().substring(21, 29);
        blackKingAdress = spots[1][5].getFigure().toString().substring(21, 29);
        blackRightBishopAdress = spots[1][6].getFigure().toString().substring(21, 29);
        blackRightKnightAdress = spots[1][7].getFigure().toString().substring(21, 29);
        blackRightRookAdress = spots[1][8].getFigure().toString().substring(21, 29);
        blackPawn1Adress = spots[2][1].getFigure().toString().substring(21, 29);
        blackPawn2Adress = spots[2][2].getFigure().toString().substring(21, 29);
        blackPawn3Adress = spots[2][3].getFigure().toString().substring(21, 29);
        blackPawn4Adress = spots[2][4].getFigure().toString().substring(21, 29);
        blackPawn5Adress = spots[2][5].getFigure().toString().substring(21, 29);
        blackPawn6Adress = spots[2][6].getFigure().toString().substring(21, 29);
        blackPawn7Adress = spots[2][7].getFigure().toString().substring(21, 29);
        blackPawn8Adress = spots[2][8].getFigure().toString().substring(21, 29);

        whitePawn1Adress = spots[7][1].getFigure().toString().substring(21, 29);
        whitePawn2Adress = spots[7][2].getFigure().toString().substring(21, 29);
        whitePawn3Adress = spots[7][3].getFigure().toString().substring(21, 29);
        whitePawn4Adress = spots[7][4].getFigure().toString().substring(21, 29);
        whitePawn5Adress = spots[7][5].getFigure().toString().substring(21, 29);
        whitePawn6Adress = spots[7][6].getFigure().toString().substring(21, 29);
        whitePawn7Adress = spots[7][7].getFigure().toString().substring(21, 29);
        whitePawn8Adress = spots[7][8].getFigure().toString().substring(21, 29);
        whiteLeftRookAdress = spots[8][1].getFigure().toString().substring(21, 29);
        whiteLeftKnightAdress = spots[8][2].getFigure().toString().substring(21, 29);
        whiteLeftBishopAdress = spots[8][3].getFigure().toString().substring(21, 29);
        whiteQueenAdress = spots[8][4].getFigure().toString().substring(21, 29);
        whiteKingAdress = spots[8][5].getFigure().toString().substring(21, 29);
        whiteRightBishopAdress = spots[8][6].getFigure().toString().substring(21, 29);
        whiteRightKnightAdress = spots[8][7].getFigure().toString().substring(21, 29);
        whiteRightRookAdress = spots[8][8].getFigure().toString().substring(21, 29);
    }

    public void setCharactertToFigures(Spot[][] spots) {



    }


    public void printDisplay(Spot[][] spots) {

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (i == 1 && j == 5) {
                    figure = spots[i][j].getFigure();
                    System.out.println("spots[" + i + "][" + j + "] = " + figure);
                }
            }
        }
        System.out.println(spots[1][5].getFigure());
        System.out.println("NEW RULE");
        System.out.println(blackKingAdress);
    }




    /////////////////////////////

    public char[][] GenerateEmpltyBoard() {
        char[][] emptyBoard = new char[9][8];
        for (int i = 1; i < 7; i = i + 2) {
            for (int j = 1; j < 7; j = j + 2) {
                emptyBoard[i][j] = '\u25A0';
            }
        }
        return emptyBoard;
    }

    public int[] GenerateUpperBeamOfBoard() {
        int[] uperBeamOfChessboard = new int[9];
        for (int i = 1; i < uperBeamOfChessboard.length; i++) {
            uperBeamOfChessboard[i] = i;
        }
        return uperBeamOfChessboard;
    }

    public char[][] fillEmptyBoardWithFigures(Spot[][] spots, char[][] emptyBoard) {
        Rook blackRook = new Rook();
        blackRook.setColor(Color.BLACK);
        Knight blackKnight = new Knight();
        blackKnight.setColor(Color.BLACK);
        Bishop blackBishop = new Bishop();
        blackBishop.setColor(Color.BLACK);
        for (int i = 0; i < emptyBoard.length; i++) {
            for (int j = 1; j < emptyBoard.length; j++) {
                if (spots[i][j].getFigure() == blackBishop) {
                    emptyBoard[i][j] = '\u2657';
                    System.out.println("blackBishop.znaleziono");
                }
            }
        }
        return emptyBoard;
    }

    public char whichFigureIsIt(Figure figure) {

        char c = 'X';
//        if (figure == bishop) {
//            c = '\u2657';
//        }
        return c;
    }
}
