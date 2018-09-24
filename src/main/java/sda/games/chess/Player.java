package sda.games.chess;

import java.util.Scanner;

public class Player {

    private Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Move getMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ruch wpisujac pole z ktorego chcesz przeunac pionek na pole na ktore chcesz "
                + "na pole na ktorre chcesz przesunac wstawiajac pomiedzy swoj wybor znak \">\", np:\n"
                + "A1>H8");

        System.out.print("Ruch: ");
        String userCordinatesInput = scanner.nextLine();


        return new Move(userCordinatesInput);
    }

    public void setColor(Color color) {
    }

    public Color getColor(){
        return this.color;

    }

}