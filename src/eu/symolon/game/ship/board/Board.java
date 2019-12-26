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

        this.cells = new Cell[yDimension][xDimension];
        for (int i = 0; i < yDimension; i++) {
            for (int j = 0; j < xDimension; j++) {
                this.cells[i][j] = new Cell(i, j);
            }
        }

    }

    public List<Ship> getAllShips() {
        return allShips;
    }


    public void addShip(Ship ship) {
        for (Cell c : ship.getPlacement()) {
            (cells[c.getxCoordinate()][c.getyCoordinate()]).setCellState(CellState.OCCUPIED);
            (cells[c.getxCoordinate()][c.getyCoordinate()]).setShip(ship);
        }
        allShips.add(ship);
    }


    public Cell[][] getCells() {
        return cells;
    }


    public void printBoard() {
        System.out.print("  ");
        for (int j = 0; j < xDimension; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < yDimension; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < xDimension; j++) {
                System.out.print(this.cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printPlayerBoard() {
        System.out.print("  ");
        for (int j = 0; j < xDimension; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < yDimension; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < xDimension; j++) {
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

    public CellState getCellState(int x, int y) {
        return cells[y][x].getCellState();
    }

    public void setCellState(int x, int y, CellState cellState) {
        cells[y][x].setCellState(cellState);
    }

    public Cell getCell(int x, int y) {
        return cells[y][x];
    }


}
