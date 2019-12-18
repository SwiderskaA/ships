package eu.symolon;

public class OccupiedCell extends Cell {
    Ship ship;

    public OccupiedCell(Ship ship) {
        this.ship = ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }


}
