package eu.symolon.game.ship.io;

import java.util.InputMismatchException;
import java.util.Scanner;

import static eu.symolon.Validator.*;

public class ConsoleIOManager {
    private final Scanner scanner;

    public ConsoleIOManager() {
        scanner = new Scanner(System.in);
    }

    public void printMainMenu() {
        System.out.println("Rozpoczynamy gre w statki" +
                "\n 1. Rozpocznij gre" +
                "\n 2. Zakończ");

    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int readIntValue() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Musisz podac liczbe: ");
            return readIntValue();
        }
    }

    public int readGameType() {

        int type = -1;
        while (validateNotInRange(type, 1, 2)) {
            System.out.println("Wybierz typ gry" +
                    "\n 1. Losowe rozmieszczenie statków" +
                    "\n 2. Podaj rozmieszczenie statków");
            type = readIntValue();

        }
        return type;
    }

    public int readBoardSizeX() {
        int size = -1;
        while (validateNotInRange(size, 5, 10)) {
            printMessage("Podaj rozmiar planszy x (5-10): ");
            size = readIntValue();

        }
        return size;
    }

    public int readBoardSizeY() {
        int size = -1;
        while (validateNotInRange(size, 5, 10)) {
            printMessage("Podaj rozmiar planszy y (5-10): ");
            size = readIntValue();

        }
        return size;
    }

    public int readShipAmount() {
        int size = -1;
        while (validateNotInRange(size, 1, 5)) {
            printMessage("Podaj ilośc statków (1-5): ");
            size = readIntValue();

        }
        return size;
    }

    public int readShipSize() {
        int size = -1;
        while (validateNotInRange(size, 1, 4)) {
            printMessage("Podaj wielkosc statku: ");
            size = readIntValue();

        }
        return size;
    }
}
