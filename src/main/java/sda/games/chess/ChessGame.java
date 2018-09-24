package sda.games.chess;

import java.util.Scanner;

import static sda.games.chess.Color.BLACK;
import static sda.games.chess.Color.WHITE;

public class ChessGame {

    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Board board;
    private Spot[][] spots;


    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void play(){

        Player player1 = new Player(WHITE);
        Player player2 = new Player(BLACK);
        currentPlayer = player1;
        Board board = new Board();

//        BoardGenerator boardGenerator = new BoardGenerator();
//        spots = boardGenerator.generateBoard();

        Scanner scanner = new Scanner(System.in);

        Display display = new Display();

        do {
            display.printDisplay(board.spots);


            Move move = currentPlayer.getMove();
           if(board.makeAMove(move, currentPlayer)==false){
               System.out.println("RUCH Z DUPY, SPRÓBUJ JESZCZE RAZ");
           }
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
