package sda.games.chess;

import static sda.games.chess.Color.BLACK;
import static sda.games.chess.Color.WHITE;

public class BoardGenerator {

    public Spot[][] generateBoard(){

        Spot[][] spots = new Spot[9][9];
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots[i].length; j++) {
                spots[i][j] = new Spot();
            }
        }

        King whiteKing = new King(WHITE);
        King blackKing = new King(BLACK);
        Queen whiteQueen = new Queen(WHITE);
        Queen blackQueen = new Queen(BLACK);
        Rook whiteRook = new Rook(WHITE);
        Rook blackRook = new Rook(BLACK);
        Bishop whiteBishop = new Bishop(WHITE);
        Bishop blackBishop = new Bishop(BLACK);
        Knight whiteKnight = new Knight(WHITE);
        Knight blackKnight = new Knight(BLACK);
        Pawn whitePawn = new Pawn(WHITE);
        Pawn blackPawn = new Pawn(BLACK);


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
                spots[i][j].setEmpty(true);
            }
        }

        spots[6][1].setEmpty(true);

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



