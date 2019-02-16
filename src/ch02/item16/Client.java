package ch02.item16;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        double x= 0.1;
        double y = 0.3;

        //Point02.x=0.1;

        Point02 p2 = new Point02();
//        p2.x=x;
//        p2.y=y;

        //public 필드를 노출한 경우
        Dimension dimension = new Dimension();
        Point p =new Point();

        //public 클래스에 필드를 노출하지 않은 경우
        ArrayList list = new ArrayList();

    }
}
