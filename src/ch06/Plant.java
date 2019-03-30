package ch06;

import java.util.HashSet;
import java.util.Set;


class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant[] garden = {
                new Plant("바질",    LifeCycle.ANNUAL),
                new Plant("캐러웨이", LifeCycle.BIENNIAL),
                new Plant("딜",      LifeCycle.ANNUAL),
                new Plant("라벤더",   LifeCycle.PERENNIAL),
                new Plant("파슬리",   LifeCycle.BIENNIAL),
                new Plant("로즈마리", LifeCycle.PERENNIAL)
        };

        Set<Plant>[] plansByLifeCycle = (Set<Plant>[]) new Set[LifeCycle.values().length];

        for(int i =0;i<plansByLifeCycle.length;i++){
            plansByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : garden)
            plansByLifeCycle[p.lifeCycle.ordinal()].add(p);

        for (int i = 0; i < plansByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n",
                    Plant.LifeCycle.values()[i], plansByLifeCycle[i]);
        }


    }
}
