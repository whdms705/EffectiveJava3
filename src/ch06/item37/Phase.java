package ch06.item37;


import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

// 1. 컴파일러는 ordinal과 배열 인덱스의 관계를 알 수 없다.
// 2. IndexOutofBoundExceotion, NullPointerException을 던질 수 있다.
// 3. Phase , Phase.Transition의 열거 타입을 수정하면서 Transition[][] TRANSITIONS 표를 실수로 수정하지
// 않은 경우 런타임에러발생
public enum Phase {
    SOLID, LIQUID, GAS;

    // 배열들의 배열의 인덱스에 ordinal()을 사용 - 사용하지 말하야 할 방법
    /*public enum Transition {
        MELT, FREEZE,
        BOIL, CONDENSE,
        SUBLIME, DEPOSIT;

        private static final Transition[][] TRANSITIONS = {
                {null,MELT,SUBLIME},
                {FREEZE,null,BOIL},
                {DEPOSIT,CONDENSE,null}
        };

        public static Transition from(Phase to , Phase from){
            return TRANSITIONS[from.ordinal()][to.ordinal()];
        }

    }*/

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

        // 상전이 맵을 초기화한다.
        private static final Map<Phase, Map<Phase, Transition>> m
                = Stream.of(values())
                .collect(groupingBy(
                        t -> t.from
                ,() -> new EnumMap<>(Phase.class)
                ,toMap(t -> t.to, t -> t,
                        (x, y) -> y, () -> new EnumMap<>(Phase.class))));

        public static Transition from(Phase from, Phase to) {
            return m.get(from).get(to);
        }


    }

    public static void main(String[] args) {
        for (Phase src : Phase.values()) {
            for (Phase dst : Phase.values()) {
                Transition transition = Transition.from(src, dst);
                if (transition != null)
                    System.out.printf("%s에서 %s로 : %s %n", src, dst, transition);
            }
        }
    }

}
