package eu.symolon.game.ship.board;

import eu.symolon.game.ship.ship.Ship;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final int xDimension;
    private final int yDimension;


    private Cell[][] cells;

    public List<Ship> allShips = new ArrayList<>();

    public Board(int x, int y) {
        this.xDimension = x;
        this.yDimension = y;

        this.cells = new Cell[xDimension][yDimension];
        for (int i = 0; i < xDimension; i++) {
            for (int j = 0; j < yDimension; j++) {
                this.cells[i][j] = new Cell(i,j);
            }
        }

    }

    public List<Ship> getAllShips() {
        return allShips;
    }

    //TODO: think about changing this name of function !
    public void addShip(Ship ship) {
        allShips.add(ship);
    }


    public Cell[][] getCells() {
        return cells;
    }


    public void printBoard() {
        //TODO:implement printing board based on print Cell;
    }

    public int getXDimension() {
        return xDimension;
    }

    public int getYDimension() {
        return yDimension;
    }

    public void clearTable() {
        cells = null;
    }


}
