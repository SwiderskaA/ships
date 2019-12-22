package eu.symolon.game.ship.board;

public enum CellState {

    EMPTY("."),
    OCCUPIED("X"),
    DESTROYED("D");

    private String sign;

    CellState(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
