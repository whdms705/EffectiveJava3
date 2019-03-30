package ch06.item37;


// 배열들의 배열의 인덱스에 ordinal()을 사용 - 사용하지 말하야 할 방법
// 1. 컴파일러는 ordinal과 배열 인덱스의 관계를 알 수 없다.
// 2. IndexOutofBoundExceotion, NullPointerException을 던질 수 있다.
// 3. Phase , Phase.Transition의 열거 타입을 수정하면서 Transition[][] TRANSITIONS 표를 실수로 수정하지
// 않은 경우 런타임에러발생
public enum Phase {
    SOLID, LIQUID, GAS;
    public enum Transition {
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

    }
}
