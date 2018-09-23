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

        player1 = new Player(WHITE);
        player2 = new Player(BLACK);
        currentPlayer = player1;
        Board board = new Board();

        Display display = new Display();
        display.main(board.spots); // to tutaj musi być, żeby Display wgl działał


        do {
            display.printDisplay(board.spots);


            Move move = currentPlayer.getMove();
           if(board.makeAMove(move, currentPlayer)==false){
               System.out.println("RUCH Z DUPY, SPRÓBUJ JESZCZE RAZ");
           } else {
               System.out.println("BOSKI RUCH, kolejny gracz");
               changeCurrentPlayer(currentPlayer);
           }
        } while (board.getGameState().equals(GameState.INPROGRESS));
    }

    public Player changeCurrentPlayer(Player playerWhoMadeAMove) {
        if (playerWhoMadeAMove.equals(player1)) {
            currentPlayer = player2;
        } else {
           currentPlayer = player1;
        }
        return currentPlayer;
    }

}
