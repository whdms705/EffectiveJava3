package ch05.item30;

import java.util.function.UnaryOperator;


//@Cotnent : 때때로 불변 객체를 여러 타입으로 활용할 수 있게 만들어야 할 때가 있는데, 이때는 제네릭 싱글톤 팩토리를 만들면 된다
public class GenericSingletonFactory {

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {
        String[] strings = { "삼베", "대마", "나일론" };
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = { 1, 2.0, 3L };
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}