package Core;

import Stats.Statistics;
import Utils.InputHelper;

public class GameLogic {

    private String word;
    String selectedDifficulty;
    private int trials;
    private StringBuilder guessedWord;
    private Statistics stats;

    public GameLogic(String word, String selectedDifficulty, Statistics stats) {

        this.word = word;
        this.selectedDifficulty = selectedDifficulty;
        this.trials = Difficulty.availableTrials(word, selectedDifficulty);
        this.guessedWord = new StringBuilder(("_").repeat(word.length()));
        this.stats = stats;

    }

    public void play() {

        while (trials > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            System.out.println("\nSłowo:" + guessedWord + "\n");
            System.out.println("Podaj literę:");

            char letter = InputHelper.readLine().charAt(0);

            if (word.contains(String.valueOf(letter))) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter) {
                        guessedWord.setCharAt(i, letter);

                    }
                }

            } else {

                System.out.println("\nNie ma takiej litery w słowie\n");
                trials--;
                System.out.println("Pozostałe próby: " + trials);

            }

        }
        if (trials > 0 && guessedWord.indexOf("_") == -1) {
            System.out.println("\nGRATULUJE, WYGRAŁEŚ! Słowo: " + word);
            stats.incrementGamesWon();

        } else {
            System.out.println("Niestety przegrałeś. Słowo: " + word);
            stats.incrementGamesLost();
        }

    }
}
