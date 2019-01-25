package ch02.item5;

import java.util.List;

public class SpellChecker2 {
    private final Lexicon dicttionanry = null;

    private SpellChecker2() {};
    public static SpellChecker2 instance = new SpellChecker2();

    public static boolean isValid(String word){
        return true;
    }

    public static List<String> suggestions(){
        return null;
    }

}
