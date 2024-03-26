package io_stram;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class IoStream7 {
    // 보조 스트림 : 다른 스트림과 연결되어서 다양한 기능을 추가하는 스트림
    // 단독으로는 사용할 수 없고, 기반 스트림이나, 다른 보조 스트림에 연결해서 사용

    // 문자 변환 스트림
    public static void main(String[] args) throws IOException {
        // 기반 스트림 : 파일 출력 스트림 (바이트 기반)
        OutputStream outputStream = new FileOutputStream("src/io_stram/text4_IoStream7.txt");

        // 보조 스트림 : 문자열 변환 스트림, 매개변수로 기반 스트림을 받음
        // 두번째 매개변수로 CharacterSet 을 받을 수 있음

        Writer writer = new OutputStreamWriter(outputStream, "EUC-KR");


        writer.write("안녕하세요, 보조 스트림입니다.");
        writer.flush();
        writer.close();


        // 읽기 : 입력 스트림 (바이트 기반)
        InputStream inputStream = new FileInputStream("src/io_stram/text4_IoStream7.txt");

        // 보조 스트림 : 문자열 변환 스트림
        // 두번쨰 매개변수로 읽는 소스와 동일한 인코딩을 지정 "UTF-8(통합), "EUC-KR(한국)"
        Reader reader = new InputStreamReader(inputStream, "EUC-KR");
        char[] buffer = new char[1024];
        int length = reader.read(buffer);
        reader.close();

        // 버퍼에서 읽은 길이만큼 문자열을 출력
        System.out.println(new String(buffer, 0, length)); // 0은 시작 지점


    }

}
