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
        spots[2][1].setFigure(blackKnight);
        spots[3][1].setFigure(blackBishop);
        spots[4][1].setFigure(blackQueen);
        spots[5][1].setFigure(blackKing);
        spots[6][1].setFigure(blackBishop);
        spots[7][1].setFigure(blackKnight);
        spots[8][1].setFigure(blackRook);
        for (int i = 1; i <= 8; i++) {
            spots[i][2].setFigure(blackPawn);
        }


        //white
        for (int i = 1; i < 9; i++) {
            spots[i][7].setFigure(whitePawn);
        }
        spots[1][8].setFigure(whiteRook);
        spots[2][8].setFigure(whiteKnight);
        spots[3][8].setFigure(whiteBishop);
        spots[4][8].setFigure(whiteQueen);
        spots[5][8].setFigure(whiteKing);
        spots[6][8].setFigure(whiteBishop);
        spots[7][8].setFigure(whiteKnight);
        spots[8][8].setFigure(whiteRook);

        //emptySlots
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (spots[i][j].getFigure()==null) {
                    spots[i][j].setEmpty(true);
                }
            }
        }

        return spots;

    }
}

