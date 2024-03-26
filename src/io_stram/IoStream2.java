package io_stram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IoStream2 {
    public static void main(String[] args) {
        // 바이트를 배열로 출력
        try {
            OutputStream outputStream = new FileOutputStream("src/io_stram/text2_IoStream2.txt");

            byte[] byteArray = {65, 66, 67};

            // 배열의 모든 바이트를 출력
            outputStream.write(byteArray);

            // 버퍼 지우기
            outputStream.flush();

            // 메모리 해제
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
