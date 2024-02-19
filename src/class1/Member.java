package class1;

import java.util.Scanner;

public class Member {
    String name;    // 이름
    int score;      // 성적
    int age;        // 연령

    // 생성자
    // 생성자는 Return 타입이 없다.
    // 생성자는 클래스의 이름과 같아야 한다.
    // 생성자가 하나라도 존재할 경우, 기본 생성자가 제공되지 않는다.
    Member(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    // 생성자 오버로딩 : 매개변수의 개수, 순서가 다르거나, 타입이 다를 경우
    Member(String name, int age) {
        this.name = name;
        this.age = age;
        this.score = 50;
    }
    // 생성자 오버로딩 시 코드를 this()로 줄일 수 있음
    Member(String name) {
        // System.out.println("매개변수 한개짜리 생성자 호출");
        this(name, 0, 0);   // 첫 줄에만 호출 가능
        // System.out.println("매개변수 한개짜리 생성자 호출"); // 뒷 줄 또한 인식 안함
    }
}
