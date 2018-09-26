package sda.games.chess;

import javafx.application.Platform;

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

//        BoardGenerator boardGenerator = new BoardGenerator();
//        spots = boardGenerator.generateBoard();

        Scanner scanner = new Scanner(System.in);

        Display display = new Display();
        display.main(board.spots);

        do {
            display.printDisplay(board.spots);


            Move move = currentPlayer.getMove();
           if(board.makeAMove(move, currentPlayer)==false){
               System.out.println("NIEPOPRAWNIE WPROWADZONY RUCH, SPRÓBUJ JESZCZE RAZ!");
           } else {
               System.out.println("");
               changeCurrentPlayer(currentPlayer);
               if (currentPlayer.equals(player2)){
                   System.out.println("RUCH GRACZA: PLAYER 1(BIAŁE)");
               } else {
                   System.out.println("RUCH GRACZA: PLAYER 2(CZARNE)");


               }
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
