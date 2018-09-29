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

//        BoardGenerator boardGenerator = new BoardGenerator();
//        spots = boardGenerator.generateBoard();

        Scanner scanner = new Scanner(System.in);

        Display display = new Display();
        Display2 display2 = new Display2();
        //display.main(board.spots);
        do {
            //display.printDisplay(board.spots);
            display2.printDisplay();

            Move move = currentPlayer.getMove();
           if(board.makeAMove(move, currentPlayer)==false){
               System.out.println("RUCH Z DUPY, SPRÓBUJ JESZCZE RAZ");
           } else {
               System.out.println("BOSKI RUCH");
               display2.updateChessBoardDisplayAfterMove(display2.chessBoardDisplay,move);
               changeCurrentPlayer(currentPlayer);
               if (currentPlayer.equals(WHITE)){
                   System.out.println("Ruch białego gracza");
               } else
               {
                   System.out.println("Ruch czarnego gracza");
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
