package lambda.ex;

import java.util.Map;
import java.util.function.BiFunction;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);
//        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
//            if (entry.getValue() > 49) {
//                System.out.println(entry.getKey() + " 합격");
//            } else {
//                System.out.println(entry.getKey() + " 불합격");
//            }
//        }  // > 기존 푸는 방식

//        BiFunction<String, Integer, String> function =
//                (name, scoer) -> {
//            if (scoer>=50) {
//                return "합격";
//            } else {
//                return "불합격";
//            }
//                }; 람다
//        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
//            System.out.println(entry.getKey() + " : " + function.apply(entry.getKey(), entry.getValue()));
//        }

//        BiFunction<String, Integer, String> function = (name, scoer) -> scoer >= 50 ? "합격" : "불합격";
//
//        userScores.forEach(
//                (name, score) -> System.out.println(name + " : " + function.apply(name, score))
//        );



        // 맵 자료 구조에서 합격 불합격 문자열을 반환하는 함수
        BiFunction<String, Integer, String> function = (name, scoer) -> name + " : " + (scoer >= 50 ? "합격" : "불합격");
        // Map.forEach BiConsumer
        userScores.forEach(
                (name, score) -> System.out.println(function.apply(name, score))
        );

    }
}
/*
문제 1: 사용자 입력 처리하기
요구사항: 사용자의 이름과 점수를 입력받아 합격 여부를 결정합니다.
 점수가 50점 이상이면 "합격", 그렇지 않으면 "불합격"입니다.
 사용자의 이름과 점수는 Map<String, Integer>로 관리되며,
 BiFunction을 사용하여 각 사용자의 이름과 합격 여부를 출력하세요.

입력 데이터
Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

출력예시
===
Alice: 합격
Bob: 불합격
Charlie: 합격
 */