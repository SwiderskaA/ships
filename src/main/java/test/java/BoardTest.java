package test.java;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.board.CellState;
import eu.symolon.game.ship.ship.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void getAllShips() {
        Board board = new Board(100,100);
        assertEquals(0,board.getAllShips().size());
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
    void getXDimension() {
        Board board = new Board(10,20);
        assertEquals(10,board.getXDimension());
    }

    @Test
    void getYDimension() {
        Board board = new Board(10,20);
        assertEquals(20,board.getYDimension());
    }

    @Test
    void getCellState() {
        Board board = new Board(10,10);
        assertEquals(CellState.EMPTY,board.getCellState(1,2));
    }

    @Test
    void getCell() {
        Board board = new Board(40,40);
        board.setCellState(31,28,CellState.OCCUPIED);
        assertEquals(CellState.OCCUPIED,board.getCell(31,28).getCellState());
    }

    @Test
    void addShip() {
        Ship ship = new Ship(3);
        Board board = new Board(10,10);
        board.addShip(ship);
        assertEquals(ship,board.getAllShips().get(0));
    }

    @Test
    void setCellState() {
        Board board = new Board(20,20);
        board.setCellState(1,1,CellState.HIT);
        assertEquals(CellState.HIT,board.getCellState(1,1));
    }

}