public class Statistics {
// private int gamesWon = 10;
// private int gamesLost = 5;






public static double getWinLossRatio(double won, double lost) {

double ratio = (double) won / (won + lost) * 100;
return Math.round(ratio);

}






}
