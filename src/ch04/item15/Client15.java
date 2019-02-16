package ch04.item15;

public class Client15 {
    public static void main(String[] args) {

        //"Example01"은 실행해보면 값이 변경되는 것을 학인 할 수 있다.
//        Example01 ex01 = new Example01();
//        ex01.change("test01");
//
//        Example01.VALUES[1]="test02";
//        System.out.println("clinet  example01");
//        for(String s : Example01.VALUES){
//
//            System.out.println(s);
//        }

        //"Example02"을 확인 한 경우
        //java.lang.UnsupportedOperationException 에러 발생
        System.out.println("clinet  example02");

        for(String s : Example02.VALUES){

            System.out.println(s);
        }

        Example02.VALUES.add(1,"test");


        for(String s : Example02.VALUES){

            System.out.println(s);
        }




    }
}
