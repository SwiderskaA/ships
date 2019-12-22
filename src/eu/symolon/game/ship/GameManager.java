package eu.symolon.game.ship;

import eu.symolon.Validator;
import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.io.ConsoleIOManager;
import eu.symolon.game.ship.ship.RandomShipGenerator;
import eu.symolon.game.ship.ship.Ship;

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

        consoleIOManager.printChooseTypeGameMenu();
        int userGameTypeValue = consoleIOManager.readIntValue();


        gameBoard = new Board(boardSizeX, boardSizeY);
//print board for test
        gameBoard.printBoard();
        if (userGameTypeValue == 1) {
            prepareRandomBoard(shipAmount);
        } else {
            prepareCustomBoard(shipAmount);
        }

    }

    private void prepareCustomBoard(int shipAmount) {
        for (int i = 0; i < shipAmount; i++) {
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
        consoleIOManager.printMessage("Podaj x statku: "); //0-xBoard
        int shipX = consoleIOManager.readIntValue();

        consoleIOManager.printMessage("Podaj y statku: "); //0-yBoard
        int shipY = consoleIOManager.readIntValue();

        consoleIOManager.printMessage("Podaj kierunek 1 lewo, 2 prawo, 3 gora, 4 dol: ");
        int shipDirection = consoleIOManager.readIntValue();

        if (Validator.validateShipPosition(shipX, shipY, shipDirection, gameBoard)) {
            gameBoard.addShip(ship);
            for (int i = 0; i < ship.getSize(); i++) {

                //ship.getPlacement().add(gameBoard.getCell(sh))
            }
            return true;
        } else {
            return false;
        }


    }

    private void prepareRandomBoard(int shipAmount) {
        for (int i = 0; i < shipAmount; i++) {
            Ship ship = RandomShipGenerator.generateRandomSizeShip();

            //random x

            //random y

            //add to board on random position and update ship placement inside
        }
    }
}
