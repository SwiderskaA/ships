package eu.symolon;

import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);

    public static void startGame(){
        System.out.println("Rozpoczynamy grę w STATKI !");
        System.out.println("Użytkowniku A - rozmieść proszę statki: "+
                " 1 jednomasztowy oraz 1 dwumasztowy");
    }

    public static Board askUserForCreatingBoard(){
        String boardSize;
        do{
            System.out.println("Podaj rozmiar tablicy gry , nie mniejszy niż 5 !");
            boardSize=scan.nextLine();
        }while(!Validator.checkIfIsDigit(boardSize) && !Validator.checkBoardSize(Integer.parseInt(boardSize)));
        return new Board(Integer.parseInt(boardSize));
    }

    public static int askUserForCountOfShips(){
        System.out.println("Podaj ilość statków !");
        String countOfShips;
        do{
            countOfShips=scan.nextLine();
        }while(!Validator.checkIfIsDigit(countOfShips) && !Validator.checkCountOfShips(Integer.parseInt(countOfShips)));
        return Integer.parseInt(countOfShips);
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
