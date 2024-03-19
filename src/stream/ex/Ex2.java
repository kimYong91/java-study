package stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);
//        scores.stream()
//                .filter(number -> number > 0)
//                .mapToDouble(Math::sqrt) //.mapToDouble(score -> Math.sqrt(score))
//                .forEach(System.out::println);
        List<Double> sqrtList = scores.stream() // 생성
                // 주어진 정수 리스트에서 양수만 필터링한 후,
                .filter(score -> score > 0) // 필터
                // 각 숫자의 제곱근을 구하여 결과를 출력하세요.
                .map(Math::sqrt)       // 중간
                .toList();      // 최종

        sqrtList.forEach(System.out::println);
    }
}
 /*
    문제 2: 숫자 게임 점수 변환
    주어진 정수 리스트에서 양수만 필터링한 후, 각 숫자의 제곱근을 구하여 결과를 출력하세요.

    List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

    출력 결과:
    4.0
    2.0
    1.0
    3.0
    5.0

     */