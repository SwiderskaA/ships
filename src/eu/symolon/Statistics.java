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
    {
        //TODO: implement print stats
    }
}
