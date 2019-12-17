package eu.symolon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static Board board;

    public static void startGame(){
        System.out.println("Rozpoczynamy grę w STATKI !");
        System.out.println("Użytkowniku A - rozmieść proszę statki: "+
                " 1 jednomasztowy oraz 1 dwumasztowy");
        board=new Board(5);
    }

    /*public static Board createBoard(){
        int size=5;
        Board board=new Board(size);
        return board;
    }*/

    public static void createSingleMastShip(){
        SingleMastShip ship=new SingleMastShip();
    }

    public static void createMultiMastShip(int size){
        MultiMastShip ship=new MultiMastShip(size);
    }

    public static int[] askUserForShipCoordinates(){
        int row,column;
        int[] shipCoordinates=new int[2];
        System.out.println("Podaj wiersz: ");
        row=scan.nextInt();
        System.out.println("Podaj kolumnę: ");
        column=scan.nextInt();
        shipCoordinates[0]=row;
        shipCoordinates[1]=column;
        return shipCoordinates;
    }

    public static void setCoordinatesForShip(Ship ship){
        int sizeOfShip=ship.getSize();
        for(int i=0;i<sizeOfShip;i++) {
            int[] cellCoordinates = askUserForShipCoordinates();
            int row = cellCoordinates[0];
            int column = cellCoordinates[1];
            //ship.addReservedCell(new Cell(row, column));
            board.getCells()[row][column]=new OccupiedCell(ship);
        }
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
