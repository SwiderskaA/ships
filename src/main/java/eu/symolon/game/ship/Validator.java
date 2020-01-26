package eu.symolon.game.ship;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.board.CellState;

public class Validator {

    public static boolean validateShipPosition(int shipX, int shipY, int shipDirection, int shipSize, Board gameBoard) {

        if (shipDirection == 1 && validateInRange(shipX + shipSize - 1, 0, gameBoard.getXDimension() - 1)) {

            for (int i = shipX; i < shipX + shipSize; i++) {
                if (gameBoard.getCellState(i, shipY) != CellState.EMPTY) {
                    return false;
                }
            }
            return true;
        } else if (shipDirection == 2 && validateInRange(shipY + shipSize - 1, 0, gameBoard.getYDimension() - 1)) {
            for (int i = shipY; i < shipY + shipSize; i++) {
                if (gameBoard.getCellState(shipX, i) != CellState.EMPTY) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static boolean validateInRange(int size, int min, int max) {
        return size >= min && size <= max;
    }


    public static boolean validateNotInRange(int size, int min, int max) {
        return !validateInRange(size, min, max);
    }

    public static boolean checkIfRowFree(Board gameBoard, int generatedRow) {
        Cell[][] cells = gameBoard.getCells();
        boolean isRowFree = true;
        for (int i = 0; i < gameBoard.getXDimension(); i++) {
            if (cells[generatedRow][i].getCellState() != CellState.EMPTY) {
                isRowFree = false;
                break;
            }

        }

        return isRowFree;
    }
}
