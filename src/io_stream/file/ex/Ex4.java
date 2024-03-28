package io_stream.file.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        try {
            List<Path> path = Files.walk(Paths.get("src")).toList();
            long count = path.stream().count();

            System.out.println("- 총 자바 파일 개수: " + count + "개");

            Stream<Path> walk = Files.walk(Paths.get("src"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader((File) walk));
            String line = bufferedReader.readLine();
            System.out.println(line.length());

            long exCount = path.stream()
                    .filter(n -> n.getFileName().startsWith("Ex"))
                    .count();
            System.out.println("- 실습문제 풀이 수 : " + exCount);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
    /*
    연습문제: 자바 프로젝트 코드 분석

    문제 요구사항
    현재 Java 프로젝트의 src 디렉토리 내에 있는 모든 자바 파일(.java)에 대한 코드 분석을 수행하는 프로그램을 작성하세요. 분석 결과로 다음 정보를 출력해야 합니다

    요구사항
    - src 디렉토리 내에 있는 총 자바 파일(.java)의 개수
    - 모든 자바 파일의 총 코드 라인 수
    - 실습문제(파일이름이 "EX")로 시작하는 파일의 수

    출력 예시
    ===
    자바 프로젝트 코드 분석 결과
    - 총 자바 파일 개수: xxx개
    - 총 코드 라인 수: xxxxx줄
    - 실습문제 풀이 수 : xxx개
    */