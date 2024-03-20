package stream.ex;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

        double average = grades.stream()
                .mapToInt(Integer::intValue)        // .mapToInt(numer -> numer.intValue())
                // ^ 배열의 요소가 숫자로 되어 있으나 List<Integer>에 보면 Integer 박싱되어 있기 때문에 언 박식을 해야 한다.
                .average()
                .orElse(0.0);
        System.out.println("평균 성적: " + average);

//        OptionalInt max = grades.stream()
//                .mapToInt(Integer::intValue)
//                .max();
//        System.out.println("최고 성적: " + max.getAsInt());

        int highest = grades.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println("최고 성적: " + highest);

//        int[] array = grades.stream()
//                .mapToInt(Integer::intValue)
//                .filter(n -> n > average.getAsDouble())
//                .toArray();
//        System.out.println("평균 이상 성적 학생 수: " + array.length);
        long count = grades.stream()
                .filter(score -> score >= average)
                .count();

        System.out.println("평균 이상 성적 학생 수: " + count);

    }
}
 /*
    연습 문제 2: 학급의 학생 성적 분석
    학급에 속한 학생들의 성적이 주어져 있습니다. 여러분의 목표는 다음 정보를 계산하는 것입니다:

    - 전체 학생의 평균 성적을 계산하세요.
    - 최고 성적을 받은 학생의 성적을 찾으세요.
    - 성적이 평균 이상인 학생의 수를 계산하세요.

    List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

    출력예시
    ===
    평균 성적: 83.625
    최고 성적: 100
    평균 이상 성적 학생 수: 5
     */