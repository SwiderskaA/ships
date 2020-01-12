package test.java;

import eu.symolon.game.ship.ship.RandomShipGenerator;
import eu.symolon.game.ship.ship.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomShipGeneratorTest {
    @Test
    void generateRandomSizeShip() {
        assertEquals(RandomShipGenerator.generateRandomSizeShip(),RandomShipGenerator.generateRandomSizeShip());
    }

}