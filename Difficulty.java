public class Difficulty {


    public int availableTrials(String selectedDifficulty) {

        switch (selectedDifficulty) {
            case "1":
                return  10;
            case "2":
                return  5;
            case "3":
                return 1;
            default:
                return 5;
        }




}}
