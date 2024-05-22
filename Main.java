
public class Main {


    public static void main(String[] args) {

        WordDatabase words = new WordDatabase();
        System.out.println(words.getRandomWord()); 
        double ratio = Statistics.getWinLossRatio(10,5);
System.out.println(ratio);

Menu menu = new Menu();
menu.displayMenu();






    }
}
