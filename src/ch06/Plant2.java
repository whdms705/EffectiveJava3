package ch06;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class Plant2 {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final Plant2.LifeCycle lifeCycle;

    Plant2(String name, Plant2.LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant2[] garden2 = {
                new Plant2("바질",    Plant2.LifeCycle.ANNUAL),
                new Plant2("캐러웨이", Plant2.LifeCycle.BIENNIAL),
                new Plant2("딜",      Plant2.LifeCycle.ANNUAL),
                new Plant2("라벤더",   Plant2.LifeCycle.PERENNIAL),
                new Plant2("파슬리",   Plant2.LifeCycle.BIENNIAL),
                new Plant2("로즈마리", Plant2.LifeCycle.PERENNIAL)
        };

        Map<Plant2.LifeCycle, Set<Plant2>> plantsByLifeCycle2 =
                new EnumMap<>(Plant2.LifeCycle.class);

        for(Plant2.LifeCycle lc : Plant2.LifeCycle.values()){
            plantsByLifeCycle2.put(lc,new HashSet<>());
        }

        for(Plant2 p : garden2){
            plantsByLifeCycle2.get(p.lifeCycle).add(p);
        }

        System.out.println(plantsByLifeCycle2);
        System.out.println("스트림을 사용하는 코드 - EnumMap을 사용하지 않음");
        System.out.println();

        // *스트림을 사용하는 코드1 - EnumMap을 사용하지 않음
        System.out.println(Arrays.stream(garden2)
                .collect(groupingBy(p -> p.lifeCycle)));

        // groupingBy 는 EnumMap이 아닌 고유한 맵 구현체를 사용

        /*public static <T, K> Collector<T, ?, Map<K, List<T>>>
        groupingBy(Function<? super T, ? extends K> classifier) {
            return groupingBy(classifier, toList());
        }*/

        System.out.println(" *스트림을 사용하는 코드1 - EnumMap을 사용");
        System.out.println();
        // *스트림을 사용하는 코드1 - EnumMap을 사용

        System.out.println(Arrays.stream(garden2)
                .collect(groupingBy(p -> p.lifeCycle,
                        () -> new EnumMap<>(LifeCycle.class), toSet())));


    }
}
