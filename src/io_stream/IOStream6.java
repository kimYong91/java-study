package io_stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOStream6 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/io_stram/text3_IoStream5.txt");

        while (true) {
            // 한 문자씩 읽기 -> int 로 반환
            int readCharacter = reader.read();
            if (readCharacter == -1) break;
            // 캐스팅을 통해 문자로 변환
            System.out.println((char) readCharacter);
        }
        reader.close();

        // 문자 배열을 사용하여 읽기

        reader = new FileReader("src/io_stram/text3_IoStream5.txt");
        char[] buffer = new char[1024];
        while (true) {
            // 읽은 문자를 버퍼 배열에 저장하고, 문자 수만큼 반환
            int length = reader.read(buffer);
            if (length == -1) break;

            for (int i = 0; i < length; i++) {
                System.out.print(buffer[i]);
            }
        }
        reader.close();
    }
}
