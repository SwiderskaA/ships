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
        consoleIOManager.printMessage("Podaj rozmiar planszy x: ");
        int boardSizeX = consoleIOManager.readIntValue();
        consoleIOManager.printMessage("Podaj rozmiar planszy y: ");
        int boardSizeY = consoleIOManager.readIntValue();

        consoleIOManager.printMessage("Podaj ilość statków: ");
        int shipAmount = consoleIOManager.readIntValue();

        consoleIOManager.printChooseTypeGameMenu();
        int userGameTypeValue = consoleIOManager.readIntValue();


        gameBoard = new Board(boardSizeX,boardSizeY);

        if(userGameTypeValue == 1) {
            prepareRandomBoard(shipAmount);
        } else {
            prepareCustomBoard(shipAmount);
        }

    }

    private void prepareCustomBoard(int shipAmount) {
        for(int i =0; i < shipAmount;i++) {
            consoleIOManager.printMessage("Podaj wielkosc statku: ");
            int shipSize = consoleIOManager.readIntValue();
            Ship ship = new Ship(shipSize);

            boolean added = putShipOnBoard(ship);
            while (!added) {
                consoleIOManager.printMessage("Błędna pozytacja. Spróbuj jeszcze raz: ");
                added = putShipOnBoard(ship);
            }

            //random x

            //random y

            //add to board on random position and update ship placement inside
        }
    }

    private boolean putShipOnBoard(Ship ship) {
        consoleIOManager.printMessage("Podaj x statku: ");
        int shipX = consoleIOManager.readIntValue();

        consoleIOManager.printMessage("Podaj y statku: ");
        int shipY = consoleIOManager.readIntValue();

        consoleIOManager.printMessage("Podaj kierunek 1 lewo, 2 prawo, 3 gora, 4 dol: ");
        int shipDirection = consoleIOManager.readIntValue();

        if(Validator.validateShipPosition(shipX, shipY, shipDirection, gameBoard)) {
            gameBoard.addShip(ship);
            //set placement
            return true;
        } else {
            return false;
        }




    }

    private void prepareRandomBoard(int shipAmount) {
        for(int i =0; i < shipAmount;i++) {
            Ship ship = RandomShipGenerator.generateRandomSizeShip();

            //random x

            //random y

            //add to board on random position and update ship placement inside
        }
    }
}
