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



    public void startGame() {

    }
}
