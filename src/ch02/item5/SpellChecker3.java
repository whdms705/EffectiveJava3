package ch02.item5;

import java.util.List;
import java.util.Objects;

public class SpellChecker3 {
    private final Lexicon dicttionanry;

    public SpellChecker3(Lexicon dicttionanry) {
        this.dicttionanry = Objects.requireNonNull(dicttionanry);
    }
    public static boolean isValid(String word){
        return true;
    }

    public static List<String> suggestions(){
        return null;
    }
}
