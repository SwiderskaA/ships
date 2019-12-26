package eu.symolon.game.ship.ship;

import java.util.Random;

public class RandomShipGenerator {
    private static Random random = new Random();
    public static Ship generateRandomSizeShip() {
        return new Ship(random.nextInt(3) + 1);
    }
}
