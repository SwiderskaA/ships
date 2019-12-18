package eu.symolon.game.ship;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.io.ConsoleIOManager;

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


    }
}
