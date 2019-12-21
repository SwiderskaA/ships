package eu.symolon.game.ship.ship;

import eu.symolon.game.ship.board.Cell;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    public List<Cell> placement = new ArrayList<Cell>();
    public int size;

    public List<Cell> getPlacement() {
        return placement;
    }

    public int getSize() {
        return size;
    }

    public Ship() {
        size = 1;
    }

    public Ship(int size) {
        this.size = size;
    }

    public void addReservedCell(Cell reservedCell) {
        placement.add(reservedCell);
    }
}