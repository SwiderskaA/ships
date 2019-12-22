package eu.symolon.game.ship.board;

import eu.symolon.game.ship.ship.Ship;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final int xDimension;
    private final int yDimension;


    private Cell[][] cells;

    private List<Ship> allShips = new ArrayList<>();

    public Board(int x, int y) {
        this.xDimension = x;
        this.yDimension = y;

        this.cells = new Cell[xDimension][yDimension];
        for (int i = 0; i < xDimension; i++) {
            for (int j = 0; j < yDimension; j++) {
                this.cells[i][j] = new Cell(i, j);
            }
        }

    }

    public List<Ship> getAllShips() {
        return allShips;
    }


    public void addShip(Ship ship) {
        allShips.add(ship);
    }


    public Cell[][] getCells() {
        return cells;
    }


    public void printBoard() {
        System.out.print("  ");
        for (int j = 0; j < yDimension; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < xDimension; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < yDimension; j++) {
                System.out.print(this.cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printPlayerBoard() {
        System.out.print("  ");
        for (int j = 0; j < yDimension; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < xDimension; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < yDimension; j++) {
                if (this.cells[i][j].getCellState() == CellState.OCCUPIED) {
                    System.out.print(". ");
                } else {
                    System.out.print(this.cells[i][j] + " ");
                }
            }
            System.out.println();
        }
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
