import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordDatabase {

List<String> words;
Random random;

public WordDatabase() {
this.random = new Random();
    this.words = new ArrayList<>(List.of(
                "oxygen", "zipcode", "yacht", "barbecue", "waterfall", "drone",
                "microwave", "caterpillar", "tiramisu", "ul", "jackpot", "umbrella", "pixel"));
    }




public String getRandomWord() {
    return words.get(random.nextInt(words.size()));
}




public void addWord() {

}

public void removeWord() {

}

public void editWord() {

}


public void showWords() {

}


}
