package eu.symolon.game.ship;

public class Statistics {
    private static final Statistics statistics = new Statistics();

    public static Statistics getInstance() {
        return statistics;
    }

    private int totalHits;
    private int successHits;

    public void print() {
        System.out.println("------------------------");
        System.out.println("Ogólna liczba strzałów:" + totalHits);
        System.out.println("------------------------");
        System.out.println("Liczba trafień:" + successHits);
        System.out.println("------------------------");
        System.out.println("Liczba pudeł:" + (totalHits - successHits));
        System.out.println("------------------------");

    }

    public void increaseTotal() {
        totalHits++;
    }

    public void increaseSuccessHit() {
        successHits++;
    }
}
