package eu.symolon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static Board board;

    public static void startGame(){
        Statistics.cleanStatistics();
        System.out.println("Rozpoczynamy grę w STATKI !");
        System.out.println("Użytkowniku A - rozmieść proszę statki: "+
                " 1 jednomasztowy oraz 1 dwumasztowy");
        board=new Board(5);
        System.out.println("Użytkowniku B - zgaduj przy pomocy położenia X,Y rozmieszczenia statków,"
                +" łącznie do odgadnięcia 3 pola na planszy");
        Statistics.printStatistics();

    }

     //user B
     public static boolean checkIfHit(int[]shipCoordinates,int[] guessedCoordinates){
        Statistics.addHit();
        if(shipCoordinates[0]==guessedCoordinates[0] && shipCoordinates[1]==guessedCoordinates[1]){
            int row,column;
            row=shipCoordinates[0];
            column=shipCoordinates[1];
            Statistics.addSuccessHit();
            board.getCells()[row][column]=new HitCell();
            return true;
        }
         return false;
     }



  //

    public static boolean checkIfAllShipsAreHit(){
        List<Ship> ships=board.getAllShips();
        int numberOfCellsToHit=0;
        int numberOfHitCells=0;
        for(Ship ship:ships){
            numberOfCellsToHit+=ship.getSize();
        }

        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                if(board.getCells()[i][j].getClass().toString().equals("HitCell")){
                    numberOfHitCells+=1;
                }
            }
        }

        if(numberOfCellsToHit==numberOfHitCells){
            return true;
        }
        return false;
    }

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
            //TODO think, if we can export is as another one function
            board.getCells()[row][column]=new OccupiedCell(ship);
        }
    }




}
