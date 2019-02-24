package ch04.item24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        TestInner ti = new TestInner();
        ti.i = 10;
        // ti.j=10;//안쪽 클래스의 변수는 직접 사용 불가능
        // ti.inMethod(); //안쪽 클래스의 메서드는 직접 사용 불가능
        // 바깥클래스에서 안쪽클래스의 자원을 사용하려면 안쪽클래스를
        // 객체화하여 사용
        TestInner.Inner in = ti.new Inner();
        // 안쪽 클래스의 자원 사용
        in.j = 100;
        in.inMethod();

        System.out.println("============ static  맴버 클래스 =============");

        //안쪽클래스의 자원 사용
        TestStaticNested.Nested.k=10;
        TestStaticNested.Nested.inMethod();

        System.out.println("============ 자역 클래스 =============");

        TestLocal tl = new TestLocal();
        tl.method(100,200);

        Map<String,String> map = new HashMap<>();
        map.keySet();

        List<String> list = new ArrayList<>();
        list.iterator();
    }
}



//참고사이트
//https://jsnote.tistory.com/21