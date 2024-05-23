public class Statistics {
    private int gamesWon = 0;
    private int gamesLost = 0;

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void incrementGamesWon() {
        gamesWon++;
    }

    public void incrementGamesLost() {
        gamesLost++;
    }

    public double getWinLossRatio() {

        double ratio = (double) gamesWon / (gamesWon + gamesLost) * 100;
        return Math.round(ratio);

    }

}
