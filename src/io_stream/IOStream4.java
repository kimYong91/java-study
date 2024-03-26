package io_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOStream4 {
    public static void main(String[] args) throws IOException {
        // 바이트 배열로 읽기
        InputStream inputStream = new FileInputStream("src/io_stram/text_IoStream1.txt");

        // 최대 1024 바이트를 저장하는 바이트 배열
        byte[] buffer = new byte[1024];

        while (true) {
            // 최대 1024바이트를 읽고, 매개변수 data (바이트 배열)에 읽은 바이트를 저장
            int number = inputStream.read(buffer); // text_IoStream1.txt 이것을 읽고 총 양을 본 후 그 양의 숫자를 반환
                                                 // 여기서는 3가지의 숫자를 가지고 있기에 3을 반환, 즉, 글자의 총 길이를 반환

            // 파일 끝에 도달하면 -1을 반환하기 때문에 -1되면 끝나게만 만들면 됨
            if (number == -1) break;

            // 읽은 바이트를 출력
            for (int i = 0; i < number; i++) {
                System.out.println(buffer[i]);
            }
        }
        // 메모리 해제
        inputStream.close();
    }
}
