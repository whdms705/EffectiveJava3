package ch06.item38;

import java.util.Arrays;
import java.util.Collection;

public enum ExtendedOperation implements Operaiton {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };
    private final String symbol;
    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        double x = 0.5;
        double y = 1.5;
        test(ExtendedOperation.class, x, y);
        System.out.println("===========================================");
        test2(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    // Enum 형을 테스트 하기 위해 한정적 자료형 토큰을 넘기는 방법
    // Class 에 getEnumConstants 를 사용해 가능한 Operation 을 가져올수 있다.
    private static <T extends Enum<T> & Operaiton> void test(
            Class<T> opEnumType, double x, double y) {
        for (Operaiton op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

    // Enum 형을 테스트 하기 위해  한정적 와일드 카드 자료형을 사용
    private static void test2(Collection<? extends Operaiton> opSet,
                             double x, double y) {
        for (Operaiton op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }


}
