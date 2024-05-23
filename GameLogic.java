public class GameLogic {

    String word;
    String selectedDifficulty;
    int trials;
    StringBuilder guessedWord;

    public GameLogic(String word, String selectedDifficulty) {

        this.word = word;
        this.selectedDifficulty = selectedDifficulty;
        this.trials = Difficulty.availableTrials(selectedDifficulty);
        this.guessedWord = new StringBuilder(("_").repeat(word.length()));


    }

    public void play() {

        System.out.println("poziom trudności " + selectedDifficulty);
        System.out.println("słowo do odgadnięcia: " + word);

        while (trials > 0) {
            System.out.println("Słowo:" + guessedWord);
            System.out.println("Podaj literę:");

            char letter = InputHelper.readLine().charAt(0);

if (word.contains(String.valueOf(letter))) {
for (int i =0; i< word.length(); i++) {
    if (word.charAt(i) == letter) {
guessedWord.setCharAt(i, letter);

    }






}








        }

    }
    }
        }