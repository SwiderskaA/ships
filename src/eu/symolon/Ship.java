package eu.symolon;

public class Ship {
    private int xCoordinate;
    private int yCoordinate;
    private int size;

    public Ship(int xCoordinate, int yCoordinate, int size) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.size = size;
    }

    public void setXCoordinate(int coordinateX)
    {
        this.xCoordinate = coordinateX;
    }

    public void setYCoordinate(int coordinateY)
    {
        this.yCoordinate = coordinateY;
    }

    public int getXCoordinate()
    {
        return this.xCoordinate;
    }

    public int getYCoordinate()
    {
        return this.yCoordinate;
    }

    public int getSize()
    {
        return this.size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public void printCoordinates()
    {
        System.out.println("["+xCoordinate+" "+yCoordinate+"]");
    }

    public void printShipInfo()
    {
        System.out.println("Ship size: "+this.getSize());
        printCoordinates();
    }
}
