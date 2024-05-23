public class Difficulty {

    public static int availableTrials(String word, String selectedDifficulty) {

        switch (selectedDifficulty) {
            case "1":
                return word.length() + 10;
            case "2":
                return word.length() + 5;
            case "3":
                return word.length();
            default:
                return  word.length() + 5;
        }

    }
}
