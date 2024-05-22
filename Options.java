import java.util.List;

public class Options {

    private static Statistics stats = new Statistics();
    private static WordDatabase wordDatabase = new WordDatabase();

public static void playGame() {
    System.out.println("graj");
}



public static void addWord() {
    System.out.println("Wpisz słowo do dodania");
    String newWord = InputHelper.readLine();
wordDatabase.addWord(newWord);
System.out.println("Słowo zostało dodane");

}



public static void removeWord() {
    System.out.println("Wpisz słowo do usunięcia");
    String wordToRemove = InputHelper.readLine();
wordDatabase.removeWord(wordToRemove);
System.out.println("Słowo zostało usunięte");



}


public static void editWordByNumber() {
    System.out.println("Podaj numer słowa do edycji");
String number = InputHelper.readLine();

}


public static void showStatistics() {
    System.out.println("\nStatystyki:");
    System.out.println("\nGry wygrane:" + stats.getGamesWon());
    System.out.println("Gry przegrane:" + stats.getGamesLost());
    double ratio = stats.getWinLossRatio();
    System.out.println("Średnia zwycięstw:" + (ratio == 0 ? "0 % " : ratio + "%"));



}

public static void showWordDatabase() {
    System.out.println("Słowa w grze:");

    System.out.println(wordDatabase.getWords());

    List<String> words = wordDatabase.getWords();
    System.out.println(words);
    for (int i = 0; i < words.size(); i++) {
        System.out.println(i + " " + words.get(i));
    }


}


}
