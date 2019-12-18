package eu.symolon.game.ship;

import eu.symolon.game.ship.io.ConsoleIOManager;

public class GameManager {

    private ConsoleIOManager consoleIOManager;



    GameManager() {
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
        consoleIOManager.printMessage("Podaj rozmiar planszy: ");
        int boardSize = consoleIOManager.readIntValue();

    }
}
