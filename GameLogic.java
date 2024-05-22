public class GameLogic {

String word;
String selectedDifficulty;
int trials;


public GameLogic(String word, String selectedDifficulty){

this.word = word;
this.selectedDifficulty = selectedDifficulty;
this.trials = new Difficulty().availableTrials(selectedDifficulty);


}


public void play() {

    System.out.println("poziom" + selectedDifficulty);




System.out.println("gramy!");






}



}