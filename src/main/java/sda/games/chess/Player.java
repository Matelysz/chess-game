package sda.games.chess;

import java.util.Scanner;

public class Player {

    public Move getMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ruch wpisujac pole z ktorego chcesz przeunac pionek na pole na ktore chcesz "
                            + "na pole na ktorre chcesz przesunac wstawiajac pomiedzy swoj wybor znak \">\", np:\n"
                            + "A1>H8");
        System.out.print("Ruch: ");
        String userCordinatesInput = scanner.nextLine();

        return new Move(userCordinatesInput);
    }

}
