import java.io.IOException;

public class GameLogic {

    String word;
    String selectedDifficulty;
    int trials;
    StringBuilder guessedWord;
    Statistics stats;

    public GameLogic(String word, String selectedDifficulty, Statistics stats) {

        this.word = word;
        this.selectedDifficulty = selectedDifficulty;
        this.trials = Difficulty.availableTrials(word, selectedDifficulty);
        this.guessedWord = new StringBuilder(("_").repeat(word.length()));
        this.stats = stats;

    }

    public void play() {

        System.out.println("słowo do odgadnięcia: " + word);

        while (trials > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("Słowo:" + guessedWord + "\n");
            System.out.println("Podaj literę:");
            try {
                char letter = InputHelper.readLine().charAt(0);

                if (word.contains(String.valueOf(letter))) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == letter) {
                            guessedWord.setCharAt(i, letter);

                        }
                    }

                } else {
                    System.out.println("- - - - - - - - - -");

                    System.out.println("\nNie ma takiej litery w słowie\n");
                    trials--;
                    System.out.println("Pozostałe próby " + trials + "\n");

                }

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Wpisz jedną literę");
               
            }
        }
        if (trials > 0 && guessedWord.indexOf("_") == -1) {
            System.out.println("gra wygrana");
            stats.incrementGamesWon();


        } else {
            System.out.println("gra przegrana");
            stats.incrementGamesLost();
        }

    }
}
