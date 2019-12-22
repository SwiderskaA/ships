package eu.symolon.game.ship.board;

public class Cell {

    private final int xCoordinate;
    private final int yCoordinate;
    private CellState cellState;


    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        cellState = CellState.EMPTY;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    @Override
    public String toString() {
        return cellState.getSign();
    }
}
