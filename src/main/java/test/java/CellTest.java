package test.java;

import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.board.CellState;
import eu.symolon.game.ship.ship.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {
    @Test
    void setCellState() {
        CellState testState= CellState.EMPTY;
        assertEquals(".",testState.getSign());
        testState= CellState.OCCUPIED;
        assertEquals("o",testState.getSign());
        testState=CellState.HIT;
        assertEquals("x",testState.getSign());
        testState=CellState.MISSED;
        assertEquals("m",testState.getSign());
        testState=CellState.DESTROYED;
        assertEquals("D",testState.getSign());
    }

    @Test
    void setShip() {
        Ship ship = new Ship(5);
        Cell cell = new Cell(1, 2, CellState.OCCUPIED, ship);
        cell.setShip(ship);
        assertEquals(ship,cell.getShip());
    }
    @Test
    void getxCoordinate() {
        Cell cell = new Cell(1,1);
        assertEquals(1,cell.getxCoordinate());
    }

    @Test
    void getyCoordinate() {
        Cell cell = new Cell(2,2);
        assertEquals(2,cell.getyCoordinate());
    }

    @Test
    void getCellState() {
        Cell cell = new Cell(5,5);
        assertEquals(CellState.EMPTY,cell.getCellState());
    }

}