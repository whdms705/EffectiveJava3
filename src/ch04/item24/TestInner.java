package ch04.item24;

public class TestInner {
    int i;
    public TestInner() {
        System.out.println("바깥클래스 생성자");
    }// TestInner
    public void outMethod() {
        System.out.println("바깥클래스의 메서드");
    }
    // //////////Inner Class의 시작//////////////
    public class Inner {
        int j;
        public Inner() {
            System.out.println("안쪽클래스의 생성자");
        }// Inner
        public void inMethod() {
            System.out.println("안쪽클래스의 메서드");
            System.out.println("안쪽메서드 바깥변수 i="+i);
        }
    }
}
