package ch07.item49;

import java.math.BigInteger;
import java.util.Objects;

public class Parameter_ex01 {
    public static void main(String[] args) {
        Parameter_ex01 ex = new Parameter_ex01();
        long val = 1;
        BigInteger m = BigInteger.ONE;
// System.out.println(m.signum());

        m = null;
        // ex.mod(m);



        // requireNonNull example
        String test = null;
        ex.mod2(test);
    }

    /*
    @param m 계수(양수여야 한다.)
    @return  현재 값 mod m
    @throws ArithmeticException m이 0 보다 작거간 같으면 발생한다.
     */
    public BigInteger mod(BigInteger m){
        if(m.signum() <= 0){
            throw new ArithmeticException("계수 는 양수여야 합니다.");
        }
        return m;
    }

    public String mod2(String m){
        System.out.println("requireNonNull");
        m  = Objects.requireNonNull(m,"m >> NullPointerException");

        return m;
    }
}
