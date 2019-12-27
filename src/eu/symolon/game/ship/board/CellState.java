package eu.symolon.game.ship.board;

public enum CellState {

    EMPTY("."),
    OCCUPIED("o"),
    HIT("x"),
    MISSED("m"),
    DESTROYED("D");

    private final String sign;

    CellState(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
