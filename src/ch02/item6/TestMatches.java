package ch02.item6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatches {

    //Pattern 인스턴스를 클래스 초기화(정적 초기화) 과정에서 직접 생성해 캐싱해둠
    //메서드가 호출될 때마다 이 인스턴스를 재사용
    private static final Pattern ROMAN = Pattern.compile("(^[0-9]*$)");

    public static void main(String[] args) {

        //Pattern 기본사용법
        Pattern p = Pattern.compile("(^[0-9]*$)");

        int onlyNum;
        String inputVal;
        Scanner iStream = new Scanner(System.in);

        inputVal = iStream.nextLine();
        Matcher m = p.matcher(inputVal);

        if(m.find())
        {
            onlyNum = Integer.parseInt(inputVal);
            System.out.println(onlyNum);
        }
        else
        {
            System.out.println("숫자가 아닌데..?");
        }

    }
    public static boolean isRomanNumeral01(String s){
        return s.matches("(^[0-9]*$)");
    }

    public static boolean isRomanNumeral02(String s){
        return ROMAN.matcher(s).matches();
    }

}
