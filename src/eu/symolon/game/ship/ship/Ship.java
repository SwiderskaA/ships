package eu.symolon.game.ship.ship;

import eu.symolon.game.ship.board.Cell;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Cell> placement = new ArrayList<Cell>();
    private int size;
    private int hits = 0;

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

    public void hit() {
        hits++;
    }

    public boolean isDestroyed() {
        return placement.size() == hits;
    }
}
