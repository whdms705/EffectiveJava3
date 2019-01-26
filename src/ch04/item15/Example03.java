package ch04.item15;

public class Example03 {
    private static final String[] PRIVATE_VALUES = {"a","b","c"};;
    public static final String[] values(){
        return PRIVATE_VALUES.clone();
    }
}
