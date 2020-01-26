package test.java;

import eu.symolon.game.ship.Validator;
import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.ship.RandomShipGenerator;
import eu.symolon.game.ship.ship.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {



    @Test
    void validateShipPosition() {

    }

    @Test
    void validateInRange() {
        assertTrue(Validator.validateInRange(0,0,0));
    }

    @Test
    void validateNotInRange() {
        assertTrue(Validator.validateNotInRange(0,0,0));
    }

    @Test
    void checkIfRowFree() {
        Board testBoard = new Board(1,1);
        assertTrue(Validator.checkIfRowFree(testBoard,0));
    }

}