package ch05.item30;

import java.util.*;

public class RecursiveTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] test = {"a","d","c"};
        List<String> argList = Arrays.asList(test);
        System.out.println(max(argList));
    }

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }
}
