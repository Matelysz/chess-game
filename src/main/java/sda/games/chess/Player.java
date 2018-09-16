package sda.games.chess;

import java.util.Scanner;

public class Player {

    public void getMove() {

        String inputMove = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ruch wpisujac pole z ktorego chcesz przeunac pionek na pole na ktore chcesz "
                            + "na pole na ktorre chcesz przesunac wstawiajac pomiedzy swoj wybor znak \">\", np:\n"
                            + "A1>H8");
        System.out.print("Ruch: " + inputMove);
        inputMove = scanner.nextLine();
        int fromX = Integer.parseInt(charToInt(inputMove.toUpperCase().charAt(0)));
        int fromY = Integer.parseInt(inputMove.substring(1, 2)) - 1;
        int toX  = Integer.parseInt(charToInt(inputMove.toUpperCase().charAt(4)));
        int toY = Integer.parseInt(inputMove.substring(5)) - 1;
        
        Move move = new Move(fromX, fromY, toX, toY);

    }

    public String charToInt(char c) {
        String number = "-1";
        switch (c) {
            case 'A':
                number = "0";
                break;
            case 'B':
                number = "1";
                break;
            case 'C':
                number = "2";
                break;
            case 'D':
                number = "3";
                break;
            case 'E':
                number = "4";
                break;
            case 'F':
                number = "5";
                break;
            case 'G':
                number = "6";
                break;
            case 'H':
                number = "7";
                break;
            default:
                break;
        }
        return number;
    }

}
