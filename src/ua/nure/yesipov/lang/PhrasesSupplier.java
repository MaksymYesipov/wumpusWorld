package ua.nure.yesipov.lang;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PhrasesSupplier {

    private final Random random;
    private Map<Integer, String> stenchPhrases;
    private Map<Integer, String> windPhrases;
    private Map<Integer, String> flitterPhrases;
    private Map<Integer, String> bumpPhrases;
    private Map<Integer, String> screamPhrases;

    public PhrasesSupplier() {
        random = new Random();
        fillStenchPhrases();
        fillWindPhrases();
        fillFlitterPhrases();
        fillBumpPhrases();
        fillScreamPhrases();
    }

    public String getPhrase(int stateNum) {
        switch (stateNum) {
            case 0:
                return getStenchPhrase();
            case 1:
                return getWindPhrase();
            case 2:
                return getFlitterPhrase();
            case 3:
                return getBumpPhrase();
            case 4:
                return getScreamPhrase();
            default:
                return "";
        }
    }

    private void fillScreamPhrases() {
        screamPhrases = new HashMap<>();
        screamPhrases.put(0, "I hear a scream. ");
        screamPhrases.put(1, "Some kind of eerie scream. ");
    }

    private void fillBumpPhrases() {
        bumpPhrases = new HashMap<>();
        bumpPhrases.put(0, "Bump. ");
        bumpPhrases.put(1, "I ran into an obstacle. ");
        bumpPhrases.put(2, "I hit the wall");
    }

    private void fillFlitterPhrases() {
        flitterPhrases = new HashMap<>();
        flitterPhrases.put(0, "Something flashed. ");
        flitterPhrases.put(1, "I saw some shine. ");
        flitterPhrases.put(2, "I see some kind of gloss. ");
    }

    private void fillWindPhrases() {
        windPhrases = new HashMap<>();
        windPhrases.put(0, "The wind blows. ");
        windPhrases.put(1, "It's windy here. ");
    }

    private void fillStenchPhrases() {
        stenchPhrases = new HashMap<>();
        stenchPhrases.put(0, "It stinks here. ");
        stenchPhrases.put(1, "There is a terrible stench. ");
        stenchPhrases.put(2, "There is an unpleasant smell. ");
        stenchPhrases.put(3, "Stinky. ");
    }

    private String getBumpPhrase() {
        return bumpPhrases.get(random.nextInt(bumpPhrases.size()));
    }

    private String getScreamPhrase() {
        return screamPhrases.get(random.nextInt(screamPhrases.size()));
    }

    private String getFlitterPhrase() {
        return flitterPhrases.get(random.nextInt(flitterPhrases.size()));
    }

    private String getWindPhrase() {
        return windPhrases.get(random.nextInt(windPhrases.size()));
    }

    private String getStenchPhrase() {
        return stenchPhrases.get(random.nextInt(stenchPhrases.size()));
    }
}
