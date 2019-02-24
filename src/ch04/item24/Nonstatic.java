package ch04.item24;

//

public class Nonstatic {
    void test() {
        System.out.println("Hello, World!");
    }

    class Nonstatic2 {

        void test() { // this 한정 구문
            Nonstatic.this.test();
        }
    }

}
