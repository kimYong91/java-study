package library.lang.ex;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        String s = "Java 프로그래밍, 문자열 처리 연습";
        System.out.println("문자열의 길이 : " + s.length());
        System.out.println("공백의 수 : ");
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {}
        System.out.println("각 부분 문자열 길이 : " + split[0].length() + ", " + split[1].length());
        System.out.println("Java 포함 여부 : " + s.contains("Java"));
        System.out.println("프로그래밍 : " + s.endsWith("프로그래밍"));

//        System.out.println("a 문자의 수: " + );

    }
}
