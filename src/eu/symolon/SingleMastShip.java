package eu.symolon;

public class SingleMastShip extends Ship {

    public SingleMastShip(int coordinateX, int coordinateY)
    {
        this.setSize(1);
        this.setXCoordinate(coordinateX);
        this.setYCoordinate(coordinateY);
    }
}
