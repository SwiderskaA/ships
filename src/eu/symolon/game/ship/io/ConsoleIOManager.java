package eu.symolon.game.ship.io;

import java.util.Scanner;

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
        return scanner.nextInt();
    }
}
