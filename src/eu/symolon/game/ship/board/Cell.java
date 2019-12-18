package eu.symolon.game.ship.board;

public class Cell {

    public int rowCoordinate;
    public int columnCoordinate;

    public int getRowCoordinate() {
        return rowCoordinate;
    }

    public int getColumnCoordinate() {
        return columnCoordinate;
    }

    public Cell() {
    }

    public Cell(int rowCoordinate, int columnCoordinate) {
        this.rowCoordinate = rowCoordinate;
        this.columnCoordinate = columnCoordinate;
    }

    public void printCell()
    {
        //TODO:implement cell printing;
    }


}
