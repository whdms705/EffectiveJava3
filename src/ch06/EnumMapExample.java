package ch06;

import java.util.EnumMap;

//참고 http://clearpal7.blogspot.com/2017/02/java-enummap-vs-hashmap.html
// EnumMap VS HashMap
//enumMap의 index 는 Enum의 내부 순서를 이용하므로 hashMap의 Hashing을 통한 index보다 효율적이다.
//HashMap의 경우 일정한 이상의 자료가 저장 되면, 자체적으로 resizing을 한다.
//그로 인해 성능저하가 발생한다. 그러나 EnumMap은 Enum의 갯수로 제한하므로 Resizing에 대한 성능저하가 없다.
public class EnumMapExample {

    enum enumInstance{ A ,B , C}

    public static void main(String[] args) {
        EnumMap map = new EnumMap(enumInstance.class);

        map.put(enumInstance.A,"A result");
        map.put(enumInstance.B,"B result");
        map.put(enumInstance.C,"C result");

        System.out.println(map);

        String aValue = (String) map.get(enumInstance.A);
        System.out.println(aValue);
    }
}
