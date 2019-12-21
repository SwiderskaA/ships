package eu.symolon.game.ship.ship;

import java.util.Random;

public class RandomShipGenerator {
    public static Ship generateRandomSizeShip() {
        return new Ship((new Random()).nextInt(1) + 1);
    }
}
