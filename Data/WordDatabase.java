package Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordDatabase {

    private List<String> words;
    private Random random;

    public WordDatabase() {
        this.random = new Random();
        this.words = new ArrayList<>(List.of(
                "oxygen", "zipcode", "yacht", "barbecue", "waterfall", "drone",
                "microwave", "caterpillar", "tiramisu", "jackpot", "umbrella", "pixel"));
    }

    public String getRandomWord() {
        return words.get(random.nextInt(words.size()));
    }

    public void addWord(String word) {
        words.add(word);

    }

    public void removeWord(String word) {
        words.remove(word);

    }

    public void setWord(int number, String newWord) {

        words.set(number, newWord);

    }

    public List<String> getWords() {
        return new ArrayList<>(words);
    }

    public boolean containsWord(String word) {
        return words.contains(word);
    }

}
