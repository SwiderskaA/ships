package eu.symolon.game.ship.board;

import eu.symolon.game.ship.ship.Ship;

public class Cell {

    private final int xCoordinate;
    private final int yCoordinate;
    private CellState cellState;
    private Ship ship;


    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.cellState = CellState.EMPTY;
    }

    public Cell(int xCoordinate, int yCoordinate, CellState cellState, Ship ship) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.cellState = cellState;
        this.ship = ship;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return cellState.getSign();
    }
}
