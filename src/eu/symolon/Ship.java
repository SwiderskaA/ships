package eu.symolon;

public class Ship {
    private static int xCoordinate;
    private static int yCoordinate;
    private static int size;

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
        Ship.size = size;
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
