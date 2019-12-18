package eu.symolon.game.ship.board;

import eu.symolon.Ship;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //Size of a board - one value because board is a square
    private int xDimension;
    private int yDimension;


    private Cell[][] cells;

    public List<Ship> allShips=new ArrayList<>();

    public Board(int x, int y)
    {
        this.xDimension = x;
        this.yDimension = y;

        this.cells=new Cell[xDimension][yDimension];
        for(int i=0;i<xDimension;i++){
            for(int j=0;j<yDimension;j++){
                this.cells[i][j]=new EmptyCell();
            }
        };
    }

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



    public void printBoard()
    {
        //TODO:implement printing board based on print Cell;
    }

    public int getSize() {
        return 0;
    }

    public void clearTable()
    {
        cells = null;
    }


}
