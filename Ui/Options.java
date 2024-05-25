package Ui;

import java.util.List;

import Core.GameLogic;
import Data.WordDatabase;
import Stats.Statistics;
import Utils.InputHelper;

public class Options {

    private static Statistics stats = new Statistics();
    private static WordDatabase wordDatabase = new WordDatabase();

    public static void playGame() {
        try {
            System.out.println("\nWybierz poziom trudności (1. łatwy, 2. średni, 3. trudny):");
            String selectedDifficulty = InputHelper.readLine();
            String wordInGame = wordDatabase.getRandomWord();

            GameLogic game = new GameLogic(wordInGame, selectedDifficulty, stats);
            game.play();

        } catch (Exception e) {
            System.err.println("Wystąpił błąd podczas uruchamiania gry");

        }

    }

    public static void addWord() {
        try {
            System.out.println("Wpisz słowo do dodania");
            String newWord = InputHelper.readLine();

            if (!newWord.matches("[a-zA-Z]+") || newWord == null) {
                throw new IllegalArgumentException("Słowo musi składać się z liter.");
            }

            wordDatabase.addWord(newWord);
            System.out.println("Słowo zostało dodane");

        } catch (Exception e) {
            System.err.println("Wystąpił błąd podczas dodawania słowa");
        }
    }

    public static void removeWord() {
        try {
            System.out.println("Wpisz słowo do usunięcia");
            String wordToRemove = InputHelper.readLine();

            if (wordDatabase.containsWord(wordToRemove)) {

                wordDatabase.removeWord(wordToRemove);
                System.out.println("Słowo zostało usunięte");
            } else {
                System.out.println("Nie ma takiego słowa w grze");
            }
            if (!wordToRemove.matches("[a-zA-Z]+") || wordToRemove == null) {
                throw new IllegalArgumentException("\nWpisz poprawnie słowo do usunięcia.");
            }

        } catch (Exception e) {
            System.err.println("Wystąpił błąd podczas usuwania słowa");
        }

    }

    public static void editWordByNumber() {
        try {
            System.out.println("Podaj numer słowa do edycji");
            List<String> words = wordDatabase.getWords();

            int number = Integer.parseInt(InputHelper.readLine());

            if (number >= 0 && number < words.size()) {
                System.out.print("\nWpisz nowe słowo: ");
                String newWord = InputHelper.readLine();

                if (!newWord.matches("[a-zA-Z]+") || newWord == null) {
                    throw new IllegalArgumentException("\nWpisz poprawnie nowe słowo.");
                }

                wordDatabase.setWord(number, newWord);
                System.out.print("Słowo zostało zmienione.\n");
            } else {
                System.out.println("Numer w zakresie 1-" + words.size());
            }

        } catch (Exception e) {
            System.err.println("Wystąpił błąd podczas edytowania słowa");
        }
    }

    public static void showStatistics() {
        try {
            System.out.println("\nStatystyki:");
            System.out.println("\nGry wygrane: " + stats.getGamesWon());
            System.out.println("Gry przegrane: " + stats.getGamesLost());
            double ratio = stats.getWinLossRatio();
            System.out.println("Średnia zwycięstw: " + (ratio == 0 ? "0 % " : ratio + "%"));
        } catch (Exception e) {
            System.err.println("Wystąpił błąd podczas wyświetlania statystyk");
        }
    }

    public static void showWordDatabase() {
        try {
            System.out.println("Słowa w grze:\n");
            List<String> words = wordDatabase.getWords();
            for (int i = 1; i < words.size(); i++) {
                System.out.println(i + " " + words.get(i));
            }
        } catch (Exception e) {
            System.err.println("Wystąpił błąd podczas wyświetlania bazy słów");
        }
    }
}
