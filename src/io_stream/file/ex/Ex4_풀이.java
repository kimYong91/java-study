package io_stream.file.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex4_풀이 {
    public static void main(String[] args) {
        Path srcPath = Paths.get("src");

        long javaFileCount = 0;
        long codeLineCount = 0;
        long exerciseCount = 0;

        try {
            // 1.
            javaFileCount = Files.walk(srcPath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .count();

            // 2.
            codeLineCount = Files.walk(srcPath)
                    // java 파일들만 찾아서
                    .filter(path -> path.toString().endsWith(".java"))
                    // 각줄의 갯수를 세어 정수로 반환
                    .mapToLong(path -> {
                        try {
                            return Files.lines(path).count();
                        } catch (IOException e) {
                            return 0;
                        }
                    })
                    .sum();

            // 3.
            exerciseCount = Files.walk(srcPath)
                    .filter(path -> path.getFileName().toString().startsWith("Ex"))
                    .count();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("프로젝트 코드 분석 결과");
        System.out.printf("- 총 자바 파일 수 : %,d 개%n", javaFileCount);
        System.out.printf("- 총 코드 라인 수 : %,d 줄%n", codeLineCount);
        System.out.printf("- 총 연습 문제 수 : %,d 문제%n", exerciseCount);
    }
}
