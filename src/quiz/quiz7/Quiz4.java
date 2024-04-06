package quiz.quiz7;

import java.io.*;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):");
        String file = "src/quiz/quiz7/output.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (true) {
                System.out.print("> ");
                String text = scanner.nextLine();
                if (text.equals("종료")) return;
                bufferedWriter.write(text);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
입출력 스트림, 사용자 입력 문자열을 파일에 저장하기

    사용자로부터 문자열 입력을 받아 이를 "output.txt"라는 이름의 파일에 저장하는 프로그램을 작성하세요.

    요구 사항
    - 사용자 입력 받기: 사용자로부터 문자열을 계속해서 입력 받으세요. 입력은 터미널(콘솔)을 통해 이루어집니다.
    - 파일에 저장: 사용자가 입력한 문자열을 "output.txt" 파일에 저장하세요. 사용자가 새 문자열을 입력할 때마다, 이 문자열은 파일의 새로운 줄에 추가되어야 합니다.
    - 프로그램 종료 조건: 사용자가 "종료"라고 입력하면, 프로그램은 더 이상 입력을 받지 않고 종료됩니다. 이때, 지금까지 입력받은 모든 문자열이 "output.txt" 파일에 저장되어 있어야 합니다.

    실행예시
    ===
    텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):
    > 안녕하세요
    > 파일 입출력 연습입니다.
    > 종료

    output.txt
    ===
    안녕하세요
    파일 입출력 연습입니다.
 */