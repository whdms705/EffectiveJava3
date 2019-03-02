package ch05.item26;

import java.util.*;

public class LoTest {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings,Integer.valueOf(24));
        String s = strings.get(0);
    }

    public static void unsafeAdd(List list,Object o){
        list.add(o);
    }
}
