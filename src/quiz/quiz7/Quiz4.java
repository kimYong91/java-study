package quiz.quiz7;

import java.io.*;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):");
        while (true) {
            System.out.print("> ");
            String text = scanner.nextLine();
            String file = "src/quiz/quiz7/output.txt";
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            if (text.equals("종료")) return;
                bufferedWriter.write(text);
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
