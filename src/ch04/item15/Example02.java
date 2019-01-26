package ch04.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example02 {
    private static final String[] PRIVATE_VALUES = {"a","b","c"};;

    //unmodifiableList 이란
    //https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
    public static final List<String> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
