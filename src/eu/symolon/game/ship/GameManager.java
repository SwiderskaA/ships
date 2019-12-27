package eu.symolon.game.ship;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.board.CellState;
import eu.symolon.game.ship.io.ConsoleIOManager;
import eu.symolon.game.ship.ship.RandomShipGenerator;
import eu.symolon.game.ship.ship.Ship;

import java.util.Random;

public class GameManager {

    private final ConsoleIOManager consoleIOManager;
    private Board gameBoard;


    private GameManager() {
        consoleIOManager = new ConsoleIOManager();
    }

    public static GameManager getInstance() {
        return new GameManager();
    }


    public void start() {
        consoleIOManager.printMainMenu();
        //check exception if not number
        int mainMenuValue = consoleIOManager.readIntValue();
        switch (mainMenuValue) {
            case 1:
                handleGame();
                break;
            case 2:
                System.exit(0);
                break;
        }

    }

    private void handleGame() {
        int boardSizeX = consoleIOManager.readBoardSizeX();

        int boardSizeY = consoleIOManager.readBoardSizeY();

        int shipAmount = consoleIOManager.readShipAmount();

        int userGameTypeValue = consoleIOManager.readGameType();


        gameBoard = new Board(boardSizeX, boardSizeY);
//print board for test
        gameBoard.printBoard();
        if (userGameTypeValue == 1) {
            prepareRandomBoard(shipAmount);
        } else {
            prepareCustomBoard(shipAmount);
        }
        System.out.println("Przygotowana plansza");
        gameBoard.printBoard();

        Game.getInstance().play(gameBoard);


    }

    private void prepareCustomBoard(int shipAmount) {
        for (int i = 0; i < shipAmount; i++) {
            gameBoard.printBoard();
            int shipSize = consoleIOManager.readShipSize();
            Ship ship = new Ship(shipSize);

            boolean added = putShipOnBoard(ship);
            while (!added) {
                consoleIOManager.printMessage("Błędna pozytacja. Spróbuj jeszcze raz: ");
                added = putShipOnBoard(ship);
            }

        }

    }

    private boolean putShipOnBoard(Ship ship) {

        int shipX = consoleIOManager.readValueFromRange(0,gameBoard.getXDimension()-1,"Podaj x statku: ");

        int shipY = consoleIOManager.readValueFromRange(0,gameBoard.getYDimension()-1,"Podaj y statku: ");

        int shipDirection = consoleIOManager.readValueFromRange(1,2,"Podaj kierunek 1 - prawo, 2 - dół: ");

        if (Validator.validateShipPosition(shipX, shipY, shipDirection, ship.getSize(), gameBoard)) {

            if(shipDirection == 1) {
                for (int i = shipX; i < shipX + ship.getSize(); i++) {
                    ship.addReservedCell(new Cell(shipY, i, CellState.OCCUPIED, ship));
                }
            } else {
                for (int i = shipY; i < shipY + ship.getSize(); i++) {
                    ship.addReservedCell(new Cell(i, shipX, CellState.OCCUPIED, ship));
                }
            }
            gameBoard.addShip(ship);
            return true;
        } else {
            return false;
        }


    }

    private void prepareRandomBoard(int shipAmount) {
        for (int i = 0; i < shipAmount; i++) {
            Ship ship = RandomShipGenerator.generateRandomSizeShip();

            int rows = gameBoard.getYDimension();
            int columns = gameBoard.getXDimension();

            boolean rowIsFree = false;
            int generatedRow = 0;
            do {
                generatedRow = (new Random()).nextInt(rows);
                rowIsFree = checkIfRowFree(gameBoard, generatedRow);
            } while (!rowIsFree);

            int generatedColl = (new Random()).nextInt(columns - ship.getSize()) + 1;

            for (int j = generatedColl; j < generatedColl + ship.getSize(); j++) {
                ship.addReservedCell(new Cell(generatedRow, j, CellState.OCCUPIED, ship));
            }

            gameBoard.addShip(ship);


        }
    }

    private boolean checkIfRowFree(Board gameBoard, int generatedRow) {
        Cell[][] cells = gameBoard.getCells();
        boolean isRowFree = true;
        for (int i = 0; i < gameBoard.getXDimension(); i++) {
            if (cells[generatedRow][i].getCellState() != CellState.EMPTY) {
                isRowFree = false;
                break;
            }

        }

        return isRowFree;
    }
}
