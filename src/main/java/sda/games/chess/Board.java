package sda.games.chess;

public class Board {
   public Spot[][] spots;
    private boolean isCheckmate;
    private boolean isDraw;
    private GameState gameState;


    public void makeAMove (Move move){

    }

    public Board() {
        BoardGenerator boardGenerator = new BoardGenerator();
        this.gameState = GameState.INPROGRESS;
        this.spots = boardGenerator.generateBoard();
    }

    public GameState getGameState() {
        return gameState;
    }

}
