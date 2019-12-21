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


    public static boolean validateShipPosition(int shipX, int shipY, int shipDirection, Board gameBoard) {
        return true;
    }

    public static boolean validateInRange(int size, int min, int max) {
        return size >= min && size <= max;
    }


    public static boolean validateNotInRange(int size, int min, int max) {
        return !validateInRange(size,min,max);
    }
}
