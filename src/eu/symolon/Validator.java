package eu.symolon;

import eu.symolon.game.ship.board.Board;

public class Validator {

    public static boolean checkBoardSize(int boardSize){
        if(boardSize<5){
            return false;
        }
        return true;
    }

    public static boolean checkCountOfShips(int countOfShips){
        if(countOfShips<2 && countOfShips>5){
            return false;
        }
        return true;
    }

    public static boolean checkIfIsDigit(String input){
        if(input.matches("^[0-9]*$")){
            return true;
        }
        return false;
    }

    public static boolean checkIfInRangeOfBoardSize(int coordinate, Board board){
        if(coordinate<board.getSize()){
            return true;
        }
        return false;
    }

    public static boolean validateShipPosition(int shipX, int shipY, int shipDirection, Board gameBoard) {
        return true;
    }
}
