package ch04.item15;

public class Client15 {
    public static void main(String[] args) {

        //"Example01"은 실행해보면 값이 변경되는 것을 학인 할 수 있다.
        Example01 ex01 = new Example01();
        ex01.change("test01");

        Example01.VALUES[1]="test02";
        System.out.println("clinet");
        for(String s : Example01.VALUES){

            System.out.println(s);
        }




    }
}
