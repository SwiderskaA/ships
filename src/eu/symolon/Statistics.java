package eu.symolon;

public class Statistics {
    private static int numberOfSuccessHits;
    private static int numberOfTotalHits;
    private static int missedHits;

    public static void cleanStatistics(){
        numberOfTotalHits=0;
        numberOfSuccessHits=0;
        missedHits=0;
    }

    public static void calculateMissedHits(){
        missedHits=numberOfTotalHits-numberOfSuccessHits;
    }
    public static void addHit(){
        numberOfTotalHits+=1;
    }
    public static int getNumberOfSuccessHits()
    {

        return numberOfSuccessHits;
    }

    public static void addSuccessHit(){
        numberOfSuccessHits+=1;
    }

    public static void printStatistics()
    {   //TODO: change it into polish!
        System.out.println("------------------------");
        System.out.println("Number of total hits :" + numberOfTotalHits);
        System.out.println("------------------------");
        System.out.println("Number of success hits :" + numberOfSuccessHits);
        System.out.println("------------------------");

    }
}
