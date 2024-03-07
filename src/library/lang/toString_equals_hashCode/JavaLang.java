package library.lang.toString_equals_hashCode;

public class JavaLang {
    // java.base 모듈
    // java.lang 패키지
    // 자바 프로그래민 언어의 기본 클래스들을 포함하고 있고,
    // 별도의 import 구문 없이도 클래스를 사용할 수 있다.
    Object object;          // 모든 클래스의 최상의 클래스
    // 공식문서 보는 법

    public static void main(String[] args) {
        // toString 메서드
        // 기본적으로 객체의 정보를 출력
        // 패키지 경로. 클래스 명 @ 해시값 => 기본 구현은 유용한 정보를 제공하지 못함
        // 객체의 상태를 더욱 잘 나타낼 수 있는 방식으로 오버라이딩하는 관행
        // 객체를 대표하는 문자열을 반환
        // 유용성 : 디버깅, 로깅, 가독성 등에 유용하게 사용할 수 있다.


        Object obj = new Object();
        System.out.println(obj.toString());
        // println 메서드에서는 기본적으로 객체의 toString() 값을 리턴
        Student student = new Student("홍길동", "6");
        System.out.println(student.toString());
        System.out.println(student);

        Student student2 = new Student("임꺽정", "5");
        System.out.println(student2);

    }
}
class Student {
    String name;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String grade;

    // 객체의 정보를 유용하게 제공하기 위해 toString()을 오버하이드
    @Override
    public String toString() {
        return "%s학년 %s 입니다.".formatted(grade,name);
    }
}