package ch04.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example02 {
    private static final String[] PRIVATE_VALUES = {};
    public static final List<String> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
