package test.java;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void getAllShips() {
    }

    @Test
    void getCells() {
        Cell[][] testCells = new Cell[10][10] ;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                testCells[i][j] = new Cell(i, j);
            }
        }
        Board boardA = new Board(10,10);

        assertEquals(testCells.length,boardA.getCells().length);
    }

    @Test
    void printBoard() {
    }

    @Test
    void printPlayerBoard() {
    }

    @Test
    void getXDimension() {
    }

    @Test
    void getYDimension() {
    }

    @Test
    void getCellState() {
    }

    @Test
    void getCell() {
    }

    @Test
    void addShip() {

    }

    @Test
    void setCellState() {

    }

}