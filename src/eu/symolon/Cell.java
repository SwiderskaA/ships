package eu.symolon;

public class Cell {

    private Ship ship;
    private boolean reserved;

    public Ship getShip()
    {
        return ship;
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
    }

    public boolean isReserved()
    {
        return reserved;
    }

    public void setReserved(boolean state)
    {
        this.reserved = state;
    }

    public void printCell()
    {
        //TODO:implement cell printing;
    }


}
