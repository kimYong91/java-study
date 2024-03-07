package library.util.ex;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int length = scanner.nextInt();
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder passwordBuilder = new StringBuilder();
        Random random = new Random();


        // 대문자, 소문자, 숫자 포함 시키는 방법을 추가 해야함


        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charSet.length());
            passwordBuilder.append(charSet.charAt(index));
        }
        System.out.println("생성된 비밀번호는 : " + passwordBuilder);



    }
}
/*
연습 문제 2: 랜덤 비밀번호 생성기
요구사항: 사용자로부터 비밀번호의 길이를 입력받아,
해당 길이를 가진 랜덤 비밀번호를 생성하는 프로그램을
작성하세요. 비밀번호는 대문자, 소문자, 숫자를 포함해야 합니다.

입력 예시:
8

출력 예시:
생성된 비밀번호: X7gA2fHq

힌트:
// 비밀번호에 사용될 문자 세트
String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 */