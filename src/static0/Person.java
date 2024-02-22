package static0;

public class Person {
    // 필드
    // final은 최종적이하는 뜻을 가지는 필드
    // 최기화가 되지 않으면 컴차일 에러가 발생한다.
    // 생성자를 통해서 초기값을 부여 받을수 있다.
    final String nation = "Korea";    // 국가
    final String ssn;                 // 주민번호
    String name;                // 이름

    // 생성자
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
