public class GameLogic {

    String word;
    String selectedDifficulty;
    int trials;
    StringBuilder guessedWord;

    public GameLogic(String word, String selectedDifficulty) {

        this.word = word;
        this.selectedDifficulty = selectedDifficulty;
        this.trials = Difficulty.availableTrials(selectedDifficulty);
        this.guessedWord = new StringBuilder(("_" + " ").repeat(word.length()));


    }

    public void play() {

        System.out.println("poziom" + selectedDifficulty);

        if (trials > 0) {
            System.out.println("Słowo:");
            System.out.println(guessedWord);

        }

    }

}