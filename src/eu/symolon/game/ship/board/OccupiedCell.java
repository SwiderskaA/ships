package eu.symolon.game.ship.board;

import eu.symolon.Ship;
import eu.symolon.game.ship.board.Cell;

public class OccupiedCell extends Cell {
    Ship ship;

    public OccupiedCell(Ship ship) {
        this.ship = ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }


}
