package sda.games.chess;

import java.util.Scanner;

public class Player {

    private Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Move getMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ruch wpisujac pole startowe i pole docelowe oddzielajac je znakiem \">\" \nNp:"
                + "A1>H8");
        System.out.print("Ruch :");

        String userCordinatesInput = scanner.nextLine();
        return new Move(userCordinatesInput);
    }

    public void setColor(Color color) {
    }

    public Color getColor(){
        return this.color;

    }

}