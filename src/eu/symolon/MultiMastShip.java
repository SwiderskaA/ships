package eu.symolon;

public class MultiMastShip extends Ship {

    //Stores one of four available directions:
    private static char direction;

    public char getDirection()
    {
        return this.direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void printShipInfo()
    {
        System.out.println("Ship size: "+this.getSize());
        printCoordinates();
        System.out.println("Direction: "+this.getDirection());
    }


}
