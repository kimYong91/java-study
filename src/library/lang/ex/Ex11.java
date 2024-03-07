package library.lang.ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문장을 입력해 주세요 : ");
        String sentence = scanner.nextLine();
        String[] split = sentence.split(" ");

        String longWord = "";
        for (String word : split) {
            if (word.length() > longWord.length()){
                longWord = word;
            }
        }
        System.out.println(longWord);


    }
}
 /*
연습문제: 가장 긴 단어 찾기

요구사항:
사용자로부터 한글 문장을 입력받아,
문장 내에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
단어는 공백으로 구분됩니다.

예시 입력
===
데이터 분석과 프로그래밍은 매우 재미있어요

예시 출력
===
프로그래밍은

     */