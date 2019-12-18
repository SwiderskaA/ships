package eu.symolon;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    public List<Cell> placement=new ArrayList<Cell>();
    public int size;

    public List<Cell> getPlacement() {
        return placement;
    }

    public int getSize() {
        return size;
    }

    public Ship() {

    }

    public void addReservedCell(Cell reservedCell){
        placement.add(reservedCell);
    }
}
