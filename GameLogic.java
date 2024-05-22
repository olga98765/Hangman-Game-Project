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
        System.out.println(word);

        if (trials > 0) {
            System.out.println("Słowo:");
            System.out.println(guessedWord);
            System.out.println("Podaj literę:");

            String letter = InputHelper.readLine();

if (word.contains(letter)) {
    System.out.println("zawiera " + letter);
} else {
    System.out.println("nie zawiera " + letter);
}








        }

    }

}