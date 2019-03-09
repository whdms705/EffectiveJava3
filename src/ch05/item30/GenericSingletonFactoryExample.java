package ch05.item30;

import java.util.*;

/*
[Collections.reverseOrder]
@SuppressWarnings("unchecked")
public static <T> Comparator<T> reverseOrder() {
        return (Comparator<T>) ReverseComparator.REVERSE_ORDER;
}*/

/*
[Collections.reverseOrder(T)]
public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) {
    if (cmp == null)
    return reverseOrder();

    if (cmp instanceof ReverseComparator2)
    return ((ReverseComparator2<T>)cmp).cmp;

    return new ReverseComparator2<>(cmp);
}*/


/*
[ Collections.emptySet() ]
@SuppressWarnings("unchecked")
public static final <T> Set<T> emptySet() {
        return (Set<T>) EMPTY_SET;
}*/

public class GenericSingletonFactoryExample {
    public static void main(String[] args) {
        // * 제네릭 싱글턴 팩터리 사용을 보기 좋은 예 *
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("l");

        Set<Integer> emptyset = Collections.emptySet();

        emptyset = new HashSet<>();
        System.out.println("Created empty immutable set: "+emptyset);

        //1.String try
        //emptyset.add("Adding");

        //2.int try
        emptyset.add(123);

        System.out.println(emptyset.toString());
    }
}
