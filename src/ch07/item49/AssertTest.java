package ch07.item49;


// @Content : assert 단언문의 사용
public class AssertTest {
    public static void main(String[] args) {
        long[] a = null;
        int offset = 1;
        int length = 1;
        sort(a,offset,length);
    }
    private static void sort(long a[], int offset, int length){
        assert a !=null: "왼쪽의 조건식이 false이면 이 메시지와 함께 AssertionError가 발생합니다.";
        assert  offset > 0 && offset <= a.length;
        assert length > 0 && length <= a.length - offset;
    }
}
