package sda.games.chess;

import java.util.Scanner;

public class ChessGame {

    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Board board;
    private Spot[][] spots;


    public void play(){

        Player player1 = new Player();
        Player player2 = new Player();
        player1.setColor(Color.WHITE);
        player2.setColor(Color.BLACK);
        currentPlayer = player1;

        BoardGenerator boardGenerator = new BoardGenerator();
        spots = boardGenerator.generateBoard();

        Scanner scanner = new Scanner(System.in);

        Display display = new Display();

        do {
            display.printDisplay(spots);

            Move move = currentPlayer.getMove();
            board.makeAMove(move);
        } while (board.getGameState().equals(GameState.INPROGRESS));
    }

    public Player changeCurrentPlayer(Player currentPlayer) {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        return currentPlayer;
    }

}
