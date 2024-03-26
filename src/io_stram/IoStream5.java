package io_stram;

import quiz.quiz2.ex4.Warrior;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IoStream5 {
    public static void main(String[] args) throws IOException {
        // Writer : 문자열 출력 스트림
        Writer writer = new FileWriter("src/io_stram/text3_IoStream5.txt");

        // Character 1 개씩 출력
        writer.write('a');
        writer.write('b');

        // Character 배열을 출력
        char[] chars = {'c', 'b', 'e'};
        writer.write(chars);

        // 문자열을 출력
        writer.write("fghi");

        // 버퍼에 남아있는 문자를 출력하고 비움
        writer.flush();

        // 출력 스트림 닫기
        writer.close();
    }
}
