package sda.games.chess;

public class BoardGenerator {

    public Spot[][] generateBoard(){

        Spot[][] spots = new Spot[9][9];
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots[i].length; j++) {
                spots[i][j] = new Spot();
            }
        }

        King whiteKing = new King();
        King blackKing = new King();
        whiteKing.setColor(Color.WHITE);
        blackKing.setColor(Color.BLACK);
        Queen whiteQueen = new Queen();
        Queen blackQueen = new Queen();
        whiteQueen.setColor(Color.WHITE);
        blackQueen.setColor(Color.BLACK);
        Rook whiteRook = new Rook();
        Rook blackRook = new Rook();
        whiteRook.setColor(Color.WHITE);
        blackRook.setColor(Color.BLACK);
        Bishop whiteBishop = new Bishop();
        Bishop blackBishop = new Bishop();
        whiteBishop.setColor(Color.WHITE);
        blackBishop.setColor(Color.BLACK);
        Knight whiteKnight = new Knight();
        Knight blackKnight = new Knight();
        whiteKnight.setColor(Color.WHITE);
        blackKnight.setColor(Color.BLACK);
        Pawn whitePawn = new Pawn();
        Pawn blackPawn = new Pawn();
        whitePawn.setColor(Color.WHITE);
        blackPawn.setColor(Color.BLACK);

        //black
        spots[1][1].setFigure(blackRook);
        spots[1][2].setFigure(blackKnight);
        spots[1][3].setFigure(blackBishop);
        spots[1][4].setFigure(blackQueen);
        spots[1][5].setFigure(blackKing);
        spots[1][6].setFigure(blackBishop);
        spots[1][7].setFigure(blackKnight);
        spots[1][8].setFigure(blackRook);
        for (int i = 1; i < 8; i++) {
            spots[2][i].setFigure(blackPawn);
        }

        //emptySlots
        for (int i = 3; i < 6; i++) {
            for (int j = 1; j < 8; j++) {
                spots[i][j].isEmpty();
            }
        }

        //white
        for (int i = 1; i < 8; i++) {
            spots[7][i].setFigure(whitePawn);
        }
        spots[8][1].setFigure(whiteRook);
        spots[8][2].setFigure(whiteKnight);
        spots[8][3].setFigure(whiteBishop);
        spots[8][4].setFigure(whiteQueen);
        spots[8][5].setFigure(whiteKing);
        spots[8][6].setFigure(whiteBishop);
        spots[8][7].setFigure(whiteKnight);
        spots[8][8].setFigure(whiteRook);

        return spots;

    }
}



