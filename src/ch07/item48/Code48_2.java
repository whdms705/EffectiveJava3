package ch07.item48;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.LongStream;

public class Code48_2 {
    public static void main(String[] args) {
        long n = 2147483;
        //long re1 = pi1(n);
        //System.out.println(re1);
        long re2 = pi2(n);
        System.out.println(re2);
    }
    //parallel 사용전
    public static long pi1(long n){
        return LongStream.rangeClosed(2,n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    //parallel 사용
    public static long pi2(long n){
        return LongStream.rangeClosed(2,n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }
}
