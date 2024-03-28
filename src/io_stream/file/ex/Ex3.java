package io_stream.file.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("디렉토리 경로를 입력하세요: ");
        String path = scanner.nextLine();
        Path startPath = Paths.get(path);
        long fileSize = 0;
        try {
            fileSize = Files.walk(startPath)
                    .filter(path1 -> path1.toFile().isFile())
                    .mapToLong(path1 -> path1.toFile().length())
                    .sum();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileSize);

    }
}
    /*
    연습문제 3: 디렉토리 크기 계산
    지정된 디렉토리 내의 모든 파일 크기의 합을 계산하여 출력하는 프로그램을 작성하세요. 하위 디렉토리의 파일 크기도 포함되어야 합니다.

    요구사항:
    - 사용자로부터 디렉토리 경로를 입력받습니다.
    - 입력된 디렉토리 내의 모든 파일 크기의 합을 계산합니다.
    - 계산된 총 크기를 출력합니다.
    - 단위는 Byte로 표시하고, 1024Byte가 넘는 경우 단위를 변환하여 KB로 나타내주세요.
    (1KB = 1024Byte)

    - 힌트 : nio.Files의 walk를 사용하면 내부 디렉토리 및 파일을 모두 탐색할 수 있습니다.

    출력예시
    ===
    디렉토리 경로를 입력하세요: src
    총 크기: 147KB
    */