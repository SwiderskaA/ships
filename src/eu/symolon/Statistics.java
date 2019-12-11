package eu.symolon;

public class Statistics {
    private static int numberOfSuccessHits;
    private static int numberOfMissedHits;

    public static int getNumberOfSuccessHits()
    {
        return numberOfSuccessHits;
    }

    public static void setNumberOfSuccessHits(int numberOfSuccessHits)
    {
        Statistics.numberOfSuccessHits = numberOfSuccessHits;
    }

    public void printStatistics()
    {   //TODO: change it into polish!
        System.out.println("Number of success hits :" + numberOfSuccessHits);
        System.out.println("Number of missed hits :" + numberOfMissedHits);
    }
}
