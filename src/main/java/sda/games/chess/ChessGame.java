package sda.games.chess;

public class ChessGame {

    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Board board;

    public void play(){

        Player player1 = new Player();
        Player player2 = new Player();
        currentPlayer = player1;

        do {



        } while (board.getGameState().equals(GameState.INPROGRESS));

    }

    public Player changeCurrentPlayer(Player currentPlayer) {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player2;
        }
        return currentPlayer;
    }

}
