package ch07.item47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubListEx {
    public static void main(String[] args) {

        List<String> src = new ArrayList<>();
        src.add("a");
        src.add("b");
        src.add("c");
        Stream<List<String>> s = of(src);
        // s.forEach(System.out::println);


        // 이중 포문을 이용한 처리
        for (int start = 0; start < src.size(); start++) {
            for (int end = start + 1; end <= src.size(); end++) {
                System.out.println(src.subList(start, end));
            }
        }

    }

    // 입력리스트의 모든 부분리스트를 스트림으로 반환
    public static <E> Stream<List<E>> of(List<E> list) {
        return Stream.concat(Stream.of(Collections.emptyList()),
                prefixes(list).flatMap(SubListEx::suffixes));
    }

    public static <E> Stream<List<E>> prefixes(List<E> list) {
        return IntStream.rangeClosed(1, list.size())
                .mapToObj(end -> list.subList(0, end));
    }

    public static <E> Stream<List<E>> suffixes(List<E> list) {
        return IntStream.rangeClosed(0, list.size())
                .mapToObj(start -> list.subList(start, list.size()));
    }



}
