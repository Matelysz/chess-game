package sda.games.chess;


import java.util.Scanner;

import static sda.games.chess.Color.BLACK;
import static sda.games.chess.Color.WHITE;

public class ChessGame {


    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Board board;
    //private Spot[][] spots;


    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void play(){

        player1 = new Player(WHITE);
        player2 = new Player(BLACK);
        currentPlayer = player1;
        Board board = new Board();

        Scanner scanner = new Scanner(System.in);

        Display display = new Display();
        System.out.println("WPROWADŹ SWÓJ RUCH POPRZEZ PODANIE POLA, Z KTÓREGO CHCESZ PRZESUNĄC FIGURĘ,");
        System.out.println("A NASTĘPNIE POLA NA KTÓRYM FIGURA MA SIĘ POJAWIC, WSTAWIAJĄC POMIĘDZY WYBRANE POLA ZNAK \">\". (PRZYKŁAD: A1>H8)");
        System.out.println("(W CELU ZAPOZNANIA SIĘ Z INSTRUKCJĄ GRY WEJDŹ NA STRONĘ WWW.NAJLEPSZESZACHYEVER.PL)");
        System.out.println("");

        do {
            display.printDisplay(board.getSpots());


            if (currentPlayer.equals(player2)){
                System.out.println("RUCH GRACZA: PLAYER 2(CZARNE)");
            } else {
                System.out.println("RUCH GRACZA: PLAYER 1(BIAŁE)");
            }
            System.out.print("WPROWADŹ RUCH: ");

            Move move = currentPlayer.getMove();
           if(board.makeAMove(move, currentPlayer)==false){
               System.out.println("NIEPOPRAWNIE WPROWADZONY RUCH, SPRÓBUJ JESZCZE RAZ!");
           } else {
               System.out.println("");
//               display.printDisplay(board.getSpots());
               //display2.updateChessBoardDisplayAfterMove(display2.chessBoardDisplay,move);
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
