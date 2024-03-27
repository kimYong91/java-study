package io_stream.file.ex;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Information information = new Information();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1: 정보 저장, 2: 정보 조회");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                information.inputCreateFileAndWriteFile();
                return;
                case 2 :

            }

        }

    }
}
class Information {
    String name;
    String email;
    String age;
    public void inputCreateFileAndWriteFile () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        name = scanner.nextLine();
        System.out.println("이메일: ");
        email = scanner.nextLine();
        System.out.println("나이: ");
        age = scanner.next();
        Path path = Paths.get("src", "io_stream", "file", "ex");
        try {
            Path file = Files.createFile(path.resolve(name + ".user"));
            List<String> list = Arrays.asList(name, email, age);
            try {
                Files.write(file, list);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileAlreadyExistsException e) {
            System.out.println("파일이 이미 존재 합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("정보 저장 완료.");
    }

    public void readInformation () {


    }
}

 /*
    연습문제 1: 사용자 정보 저장 및 조회 시스템

    사용자로부터 이름, 이메일, 나이를 입력받아,
    각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요.
    그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

    요구사항:

    - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
    - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
    - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
    - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

    실행예시
    ===
    1: 정보 저장, 2: 정보 조회
    1
    이름: 홍길동
    이메일: abc@def.com
    나이: 30
    정보 저장 완료.


    1: 정보 저장, 2: 정보 조회
    2
    홍길동.user
     */