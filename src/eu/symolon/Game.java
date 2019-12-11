package eu.symolon;

import java.util.Scanner;

public class Game {

    public static Board askUserForCreatingBoard(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy (nie mniejszy niz 5) :");
        int boardSize=Integer.parseInt(scan.nextLine());
        return new Board(boardSize);
    }
}
