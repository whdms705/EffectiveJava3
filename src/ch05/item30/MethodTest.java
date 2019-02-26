package ch05.item30;

import java.util.HashSet;
import java.util.Set;

public class MethodTest {
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static Set union(Set s1,Set s2){
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {

        /*Set<String> guys = new HashSet<String>();
        guys.add("톰");
        guys.add("딕");
        guys.add("해리");

        Set<String> stooges = new HashSet<String>();
        stooges.add("톰2");
        stooges.add("딕2");
        stooges.add("해리2");*/

        Set<String> guys = null;
        Set<String> stooges = null;

        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);
    }
}

