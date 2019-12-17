package eu.symolon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static List<Ship> allShips=new ArrayList<>();


    public static void startGame(){
        System.out.println("Rozpoczynamy grę w STATKI !");
        System.out.println("Użytkowniku A - rozmieść proszę statki: "+
                " 1 jednomasztowy oraz 1 dwumasztowy");
    }

    public static Board createBoard(){
        int size=5;
        Board board=new Board(size);
        return board;
    }

    public static void createSingleMastShip(){
        SingleMastShip ship=new SingleMastShip();
        allShips.add(ship);
    }

    public static void createMultiMastShip(int size){
        MultiMastShip ship=new MultiMastShip(size);
    }
    public static void askUserForCreateShip(){
        String row,column,size;
        do {
            System.out.println("Podaj wiersz X : ");
            row =scan.nextLine();
        }while(!Validator.checkIfIsDigit(row));

        do {
            System.out.println("Podaj kolumnę Y : ");
            column =scan.nextLine();
        }while(!Validator.checkIfIsDigit(column));

        do {
            System.out.println("Podaj rozmiar statku : ");
            size=scan.nextLine();
        }while(!Validator.checkIfIsDigit(size));


    }

    public static int guessShipRowCoordinate(){
        String row;
        do {
            System.out.println("Podaj wiersz X : ");
            row =scan.nextLine();
        }while(!Validator.checkIfIsDigit(row));
        return Integer.parseInt(row);
    }

    public static int guessShipColumnCoordinate(){
        String column;
        do {
            System.out.println("Podaj kolumnę Y: ");
            column = scan.nextLine();
        }while(!Validator.checkIfIsDigit(column));
        return Integer.parseInt(column);
    }

    public static boolean compareCoordinates(int xShip,int yShip,int guessedX,int guessedY){
        if(xShip==guessedX && yShip==guessedY){
            return true;
        }
        return false;
    }

}
