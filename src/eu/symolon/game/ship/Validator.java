package eu.symolon.game.ship;

import eu.symolon.game.ship.board.Board;

public class Validator {

    public static boolean validateShipPosition(int shipX, int shipY, int shipDirection, Board gameBoard) {
        return true;
    }

    public static boolean validateInRange(int size, int min, int max) {
        return size >= min && size <= max;
    }


    public static boolean validateNotInRange(int size, int min, int max) {
        return !validateInRange(size, min, max);
    }
}
