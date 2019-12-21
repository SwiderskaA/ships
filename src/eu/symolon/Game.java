package eu.symolon;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.board.HitCell;
import eu.symolon.game.ship.board.OccupiedCell;
import eu.symolon.game.ship.ship.Ship;

import java.util.List;
import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static Board board;
    static int numberOfHitCells=0;

    public static void startGame(){
        Statistics.cleanStatistics();
        System.out.println("Rozpoczynamy grę w STATKI !");
        System.out.println("Użytkowniku A - rozmieść proszę statki: "+
                " 1 jednomasztowy oraz 1 dwumasztowy");
        board=new Board(5);
        createSingleMastShip();
        createMultiMastShip(2);
        askForGuessingShips();
        Statistics.printStatistics();
    }

     //user B

    public static void askForGuessingShips(){
        System.out.println("Użytkowniku B - zgaduj przy pomocy położenia X,Y rozmieszczenia statków,"
                +" łącznie do odgadnięcia 3 pola na planszy");
        while(!checkIfAllShipsAreHit()){
            int[] guessedCoordinates=askUserForShipCoordinates();
            for(Ship ship:board.getAllShips()){
                for(Cell cell:ship.getPlacement()){
                    int[] oneCellOfShipCoodrinates=new int[2];
                    oneCellOfShipCoodrinates[0]=cell.getxCoordinate();
                    oneCellOfShipCoodrinates[1]=cell.getColumnCoordinate();
                    checkIfHit(oneCellOfShipCoodrinates,guessedCoordinates);
                }
            }
        }
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

     public static boolean checkIfHit(int[]shipCoordinates,int[] guessedCoordinates){
        Statistics.addHit();
        if(shipCoordinates[0]==guessedCoordinates[0] && shipCoordinates[1]==guessedCoordinates[1]){
            int row,column;
            row=shipCoordinates[0];
            column=shipCoordinates[1];
            Statistics.addSuccessHit();
            board.getCells()[row][column]=new HitCell();
            System.out.println("Gratulacje ! Trafiona pozycja !");
            return true;
        }
        System.out.println("Próbuj dalej - pozycja chybiona !");
         return false;
     }


    public static boolean checkIfAllShipsAreHit(){
        List<Ship> ships=board.getAllShips();
        int numberOfCellsToHit=0;

        for(Ship ship:ships){
            numberOfCellsToHit+=ship.getSize();
        }

        System.out.println("Size ddddd"+board.getSize());
        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                if(board.getCells()[i][j].getClass().getName().contains("HitCell")){
                    numberOfHitCells+=1;
                }
            }
        }

        System.out.println(numberOfCellsToHit);
        System.out.println(numberOfHitCells);
        if(numberOfCellsToHit==numberOfHitCells){
            System.out.println("Gratulacje trafiłeś wszystkie statki !");
            return true;
        }
        return false;
    }

    public static void createSingleMastShip(){
        SingleMastShip ship=new SingleMastShip();
        board.addShip(ship);
        setCoordinatesForShip(ship);
        System.out.println("Utworzono statek jednomasztowy !");
    }

    public static void createMultiMastShip(int size){
        MultiMastShip ship=new MultiMastShip(size);
        board.addShip(ship);
        setCoordinatesForShip(ship);
        System.out.println("Utworzono statek dwumasztowy !");
    }


    public static void setCoordinatesForShip(Ship ship){
        int sizeOfShip=ship.getSize();
        for(int i=0;i<sizeOfShip;i++) {
            int[] cellCoordinates = askUserForShipCoordinates();
            int row = cellCoordinates[0];
            int column = cellCoordinates[1];
            ship.addReservedCell(new Cell(row, column));
            //TODO think, if we can export is as another one function
             board.getCells()[row][column]=new OccupiedCell(ship);
        }
    }



}
