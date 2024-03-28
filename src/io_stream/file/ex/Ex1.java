package io_stream.file.ex;

import java.io.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Information information = new Information();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1: 정보 저장, 2: 정보 조회");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1 || choice == 2) {
                switch (choice) {
                    case 1:
                        information.inputCreateFileAndWriteFile();
                        break;
                    case 2:
                        information.readInformation();
                }
            } else {
                System.out.println("1또는 2를 선택하세요");
            }
        }
    }
}

class Information {
    String name;
    String email;
    String age;

    public void inputCreateFileAndWriteFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        name = scanner.nextLine();
        System.out.println("이메일: ");
        email = scanner.nextLine();
        System.out.println("나이: ");
        age = scanner.next();
        scanner.nextLine();
        String path = "src/io_stream/file/ex/";
        File file = new File(path + name + ".user");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));) {
            bufferedWriter.write(name);
            bufferedWriter.newLine();
            bufferedWriter.write(email);
            bufferedWriter.newLine();
            bufferedWriter.write(age);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("정보 저장 완료.");
    }

    public void readInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일명(이름): ");
        name = scanner.next();
        scanner.nextLine();
        File userFile = new File("src/io_stream/file/ex/" + name + ".user");
        System.out.println(userFile.getName());

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