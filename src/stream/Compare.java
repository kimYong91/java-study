package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
        // Comparator 인터페이스의 디폴트 메서드 사용

        // Comparator.comparing(클래스명::필드명)
        // 특정 필드, 특정 속성 기준으로 객체를 정렬할 때 사용
        List<person> persomList = new ArrayList<>(
                Arrays.asList(new person("홍길동", 30)
                , new person("김철수", 24)
                , new person("홍길동", 20))
        );
        persomList.stream()
                // 나이 기준으로 정렬하기
                //.sorted(Comparator.comparing(person::getAge))
                // 이름 기준으로 정렬하기
                .sorted(Comparator.comparing(person::getName))
                .forEach(System.out::println);

        System.out.println("===========================");

        // thenComparing
        // 주 정렬조건이 같을 때 추가 정렬 조건을 제공
        persomList.stream()
                .sorted(Comparator.comparing(person::getName)
                        .thenComparing(person::getAge))   // 이름이 같다면 나이 순으로.
                .forEach(System.out::println);

        System.out.println("===========================");

        // reversed() 역순
        persomList.stream()
                .sorted(Comparator.comparing(person::getAge).reversed()
                        .thenComparing(person::getName))
                .forEach(System.out::println);

        System.out.println("===========================");

        List<String> stringList = Arrays.asList("x", "xxx", "xx");
        stringList.stream()
                .sorted(Comparator.comparingInt(String::length)) // comparing 해도 같은 결과가 나왔음 질문
                .forEach(System.out::println);

        System.out.println("===========================");

        // null값이 있는 경우
        // Comparator.nullsFirst : 널을 처음에 두고 나머지는 새로운 비교자로 정렬
        // Comparator.nullsLast : 널을 마지막에 두고 나머지는 새로운 비교자로 정렬
        // Comparator.naturalOrder() : 자연순 -> Comparable 기준
        // Comparator.reverseOrder() : 역순 -> Comparable 의 내림차순
        List<String> nameList = Arrays.asList("홍길동", null, "김철수", "이영희");
        nameList.stream()
                .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
                .forEach(System.out::println);

        System.out.println("===========================");

        nameList.stream()
                .sorted(Comparator.nullsLast(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
    static class person {
        private String name;
        private int age;

        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " : " + age;
        }
    }
}
