package eu.symolon.game.ship;

import eu.symolon.game.ship.board.Board;
import eu.symolon.game.ship.board.Cell;
import eu.symolon.game.ship.board.CellState;
import eu.symolon.game.ship.io.ConsoleIOManager;

import java.util.List;

public class Game {
    private final static Game game = new Game();
    private final ConsoleIOManager consoleIOManager;

    private Game() {
        this.consoleIOManager = new ConsoleIOManager();
    }

    public static Game getInstance() {
        return game;
    }

    public void play(Board board) {
        consoleIOManager.printMessage("Witamy w grze");
        while (!isGameEnd(board)) {
            shoot(board);
            board.printPlayerBoard();
        }
        consoleIOManager.printMessage("Gra skończona. Dziękujemy");
    }

    private void shoot(Board board) {
        int x = consoleIOManager.readValueFromRange(0, board.getXDimension() - 1, "Podaj koordynat X statku");
        int y = consoleIOManager.readValueFromRange(0, board.getYDimension() - 1, "Podaj koordynat Y statku");
        switch (board.getCellState(x, y)) {
            case EMPTY:
                consoleIOManager.printMessage("Pudło");
                board.setCellState(x, y, CellState.MISSED);
                break;
            case MISSED:
            case HIT:
            case DESTROYED:
                consoleIOManager.printMessage("Strzelałeś już w to pole!");
                break;
            case OCCUPIED:
                handleHitShoot(board, x, y);
                break;

        }
    }

    private void handleHitShoot(Board board, int x, int y) {
        consoleIOManager.printMessage("Trafiony!");
        board.setCellState(x, y, CellState.HIT);
        Cell cell = board.getCell(x, y);
        if (cell.getShip() != null) {
            Cell c = null;
            List<Cell> placement = cell.getShip().getPlacement();
            for (Cell shipItem : placement) {
                if (shipItem.getyCoordinate() == y && shipItem.getxCoordinate() == x) {
                    c = shipItem;
                }
            }

            cell.getShip().hit();

            if (cell.getShip().isDestroyed()) {
                consoleIOManager.printMessage("Zatopiony!");
                for (Cell field : placement) {
                    board.setCellState(field.getyCoordinate(), field.getxCoordinate(), CellState.DESTROYED);
                }

            }
        } else {
            throw new RuntimeException("Something was wrong!");
        }
    }


    private boolean isGameEnd(Board board) {
        boolean gameDone = true;
        for (Cell[] cell : board.getCells()) {
            for (Cell c : cell) {
                if (c.getCellState() == CellState.OCCUPIED || c.getCellState() == CellState.HIT) {
                    gameDone = false;
                    break;
                }
            }
        }
        return gameDone;

    }
}
