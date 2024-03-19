package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 80));
        studentList.add(new Student("홍길동", 95));
        studentList.add(new Student("홍길동", 92));

        // 학생 객체에서 score만 사용하는 스트림으로 변환
        studentList.stream()
                .mapToInt(student -> student.getScore())
                .forEach(System.out::println);

        System.out.println("======================");

        double average = studentList.stream() // 생성 : 학생 객체 스트림
                .mapToInt(Student::getScore)  // 중간 : 점수 정수 스트림 변환
                .average()                    // 최종 : 점수의 평균
                .getAsDouble();               // Optional 타입에서 값 꺼내기

        System.out.println("average = " + average);

        System.out.println("======================");

        // 기본 타입 간의 변환 메서드
        // asLongStream, asDoubleStream
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);

        intStream
                .asDoubleStream()               // 중간 : 실수 스트림 변환
                .forEach(System.out::println);  // 최종

        System.out.println("=========================");

        // flatMap : 하나의 요소를 여러개의 요소로 변환한 스트림을 반환
        List<String> stringList = new ArrayList<>(
                List.of("Hello, Java and Stream",  // ["Hello", "Java", ....]
                        "I am a Developer")        // ["I", "am", .....]
        );                                         // => [ "Hello" ... "I" .... ]
        stringList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")));

    }
}
