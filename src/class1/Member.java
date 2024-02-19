package class1;

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
    Member() {} //
}
