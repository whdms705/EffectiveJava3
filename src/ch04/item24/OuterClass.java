package ch04.item24;

public class OuterClass {

    private int x = 10;

    private static class InnerClass {

//        OuterClass outerClass = new OuterClass();
//        outerClass.x = 100;

        void test() {
            OuterClass outerClass = new OuterClass();
            outerClass.x = 100;
        }
    }
}