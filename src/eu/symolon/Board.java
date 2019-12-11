package eu.symolon;

public class Board {

    //Size of a board - one value because board is a square
    private int size;
    private Cell[][] cells;

    public Board(int size)
    {
        size = size;
        cells = new Cell[size][size];
    }

    public void printBoard()
    {
        //TODO:implement printing board based on print Cell;
    }

    public int getSize() {
        return size;
    }

    public void clearTable()
    {
        cells = null;
    }

}
