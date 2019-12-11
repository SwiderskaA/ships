package eu.symolon;

public class Validator {

    public static boolean checkBoardSize(int boardSize){
        if(boardSize<5){
            return false;
        }
        return true;
    }
}
