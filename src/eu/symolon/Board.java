package eu.symolon;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //Size of a board - one value because board is a square
    private int size;
    private Cell[][] cells;
    public List<Ship> allShips=new ArrayList<>();

    public Board(int size)
    {
        size = size;
        cells = new EmptyCell[size][size];
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

    //TODO: think about changing this name of function !
    public void addShip(Ship ship){
        allShips.add(ship);
    }

}
