package sda.games.chess;

import java.util.Scanner;

public class Player {

    private Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Move getMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WPROWADŹ SWÓJ RUCH POPRZEZ PODANIE POLA, Z KTÓREGO CHCESZ PRZESUNĄC FIGURĘ,");
        System.out.println("A NASTĘPNIE POLA NA KTÓRYM FIGURA MA SIĘ POJAWIC, WSTAWIAJĄC POMIĘDZY WYBRANE POLA ZNAK \">\". (PRZYKŁAD: A1>H8)");
        System.out.println("(W CELU ZAPOZNANIA SIĘ Z INSTRUKCJĄ GRY WEJDŹ NA STRONĘ WWW.NAJLEPSZESZACHYEVER.PL)");
        System.out.println("");
        System.out.print("WPROWADŹ RUCH: ");
        String userCordinatesInput = scanner.nextLine();


        return new Move(userCordinatesInput);
    }

    public void setColor(Color color) {
    }

    public Color getColor(){
        return this.color;

    }

}