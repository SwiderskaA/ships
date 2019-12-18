package eu.symolon;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //Size of a board - one value because board is a square
    private int size;


    private Cell[][] cells;
    public List<Ship> allShips=new ArrayList<>();



    public List<Ship> getAllShips() {
        return allShips;
    }

    //TODO: think about changing this name of function !
    public void addShip(Ship ship){
        allShips.add(ship);
    }


    public Cell[][] getCells() {
        return cells;
    }

    public Board(int size)
    {
        this.size = size;
        this.cells=new Cell[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                this.cells[i][j]=new EmptyCell();
            }
        };
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
