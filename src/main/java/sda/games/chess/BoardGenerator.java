package sda.games.chess;

public class BoardGenerator {


   public Spot[][] generateBoard(){
        Spot[][] spots = new Spot[9][9];
       for (int i = 0; i < spots.length; i++) {
           for (int j = 0; j < spots[i].length; j++) {
               spots[i][j] = new Spot();
           }
       }
       //black
       spots[1][1].setFigure(new Rook());
       spots[1][2].setFigure(new Knight());
       spots[1][3].setFigure(new Bishop());
       spots[1][4].setFigure(new Queen());
       spots[1][5].setFigure(new King());
       spots[1][6].setFigure(new Bishop());
       spots[1][7].setFigure(new Knight());
       spots[1][8].setFigure(new Rook());
       spots[2][1].setFigure(new Pawn());
       spots[2][2].setFigure(new Pawn());
       spots[2][3].setFigure(new Pawn());
       spots[2][4].setFigure(new Pawn());
       spots[2][5].setFigure(new Pawn());
       spots[2][6].setFigure(new Pawn());
       spots[2][7].setFigure(new Pawn());
       spots[2][8].setFigure(new Pawn());
        //white
       spots[7][1].setFigure(new Rook());
       spots[7][2].setFigure(new Knight());
       spots[7][3].setFigure(new Bishop());
       spots[7][4].setFigure(new Queen());
       spots[7][5].setFigure(new King());
       spots[7][6].setFigure(new Bishop());
       spots[7][7].setFigure(new Knight());
       spots[7][8].setFigure(new Rook());
       spots[8][1].setFigure(new Pawn());
       spots[8][2].setFigure(new Pawn());
       spots[8][3].setFigure(new Pawn());
       spots[8][4].setFigure(new Pawn());
       spots[8][5].setFigure(new Pawn());
       spots[8][6].setFigure(new Pawn());
       spots[8][7].setFigure(new Pawn());
       spots[8][8].setFigure(new Pawn());
        return spots;
    }
}
