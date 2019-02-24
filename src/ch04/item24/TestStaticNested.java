package ch04.item24;



public class TestStaticNested {
    int i;
    static int j;
    public TestStaticNested(){
        System.out.println("바깥클래스의 생성자");
    }//TestNested

    public void outMethod(){
        System.out.println("인스턴스메서드");
    }//outMethod

    public static void outStaticMethod(){
        System.out.println("바깥 클래스의 스태틱메서드");
    }//outstaticMethod

    ///////////중첩클래스 시작////////////
    static class Nested {
        static int k;

        public Nested() {
            System.out.println("안쪽생성자");
        }//Nested

        public static void inMethod() {
            //i=10; //static영역에서는 instance 영역의 자원을 직접 사용할 수 없음.
            System.out.println("안쪽 메서드");
            TestStaticNested.j = 10; // = "j=10;"
            //outMethod(); //static영역에서는 instance 영역의 자원을 직접 사용할 수 없음.
            TestStaticNested.outStaticMethod(); // = outStaticMethod();
        }
    }
}


