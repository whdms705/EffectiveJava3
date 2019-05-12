package ch07.item47;

import java.util.*;


public class PowerSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(of(set));
        System.out.println(of(set).size());



        /*List<Set<String>> list = new AbstractList<>(){
            @Override
            public int size() {
                return 1;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Set<String> get(int index) {
                Set<String> result = new HashSet<>();
                return result;
            }
        };*/


    }
    public static  <E> Collection<Set<E>> of(Set<E> s) {
        List<E> src = new ArrayList<>(s);
        if(src.size() > 30) {
            throw new IllegalArgumentException("집합에 원소가 너무 많습니다(최대 30개).: " + s);
        }

        return new AbstractList<Set<E>>() {
            @Override
            public int size() {
                return 1 << src.size();
            }

            @Override
            public boolean contains(Object o) {
                return o instanceof Set && src.containsAll((Set) o);
            }

            @Override
            public Set<E> get(int index) {
                Set<E> result = new HashSet<>();
                for (int i = 0; index != 0; i++, index >>=1) {
                    if((index & 1) == 1) {
                        result.add(src.get(i));
                    }
                }
                return result;
            }
        };
    }
}
