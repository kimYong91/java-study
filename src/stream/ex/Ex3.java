package stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

//        List<String> list = alphabets.stream()
//                .sorted()
//                .toList();
//
//        list.forEach(System.out::println);
        List<String> list = alphabets.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)  // 대소문자 구분 없이 정렬
                .toList();

        list.forEach(System.out::println);

    }
}
/*
    문제 3: 알파벳 정렬
    알파벳이 뒤죽박죽인 리스트가 있습니다. 이를 알파벳 순으로 정렬한 후, 결과를 출력하세요. 단, 대소문자 구분 없이 정렬하세요.

    List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

    출력 결과:
    A
    B
    C
    D
    E
    F
    b
    c
    d
    e
     */