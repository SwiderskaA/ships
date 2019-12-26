package eu.symolon.game.ship.board;

public class Cell {

    private final int xCoordinate;
    private final int yCoordinate;
    private CellState cellState;


    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.cellState = CellState.EMPTY;
    }

    public Cell(int xCoordinate, int yCoordinate, CellState cellState) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.cellState = cellState;
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

    @Override
    public String toString() {
        return cellState.getSign();
    }
}
