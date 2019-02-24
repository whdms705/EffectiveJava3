package ch04.item24;

public class TestLocal {
    int out_i;
    public TestLocal(){
        System.out.println("바깥 클래스의 생성자");
    }//TestLocal

    public void method(int param_i, final int param_j){
        int local_i=0;
        final int local_j=0;
        ///////지역클래스 시작//////
        //바깥클래스명$1안쪽클래스명.class
        class Local{
            int i;
            public Local(){
                System.out.println("지역클래스의 생성자");
            }//local

            public void localMethod(){
                System.out.println("바깥클래스의 인스턴스변수"+out_i);

                //final이 붙어있지 않은 파라메터는 지역클래스에서 사용할 수 없다.
                //System.out.println("파라메터 param_i="+param_i);

                System.out.println("파라메터 param_j="+param_j);

                //final이 붙어있지 않은 클래스는 지역클래스에서 사용할 수 없다.
                //System.out.println("지역변수 local_i"+local_i);

                System.out.println("지역변수 local_j="+local_j);
                System.out.println("지역클래스의 메소드");
            }//localMethod
        }//class
        Local local = new Local();
        local.i=10;
        local.localMethod();
    }//method
}
