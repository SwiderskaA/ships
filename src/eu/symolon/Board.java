package eu.symolon;

public class Board {

    //Size of a board - one value because board is a square
    private static int size;
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

    public void clearTable()
    {
        cells = null;
    }

}
