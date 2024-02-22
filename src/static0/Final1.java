package static0;

public class Final1 {
    public static void main(String[] args) {
        Person person = new Person("800000-111111", "홍길동");

        System.out.println(person.nation);  // final 필드 초기 값 할당됨
        System.out.println(person.ssn);     // 생성자 시점 초기값 할당
        System.out.println(person.name);

        // 개명 신천
        person.name = "홍지원";        // 일반 필드 변경 가능
        // 주민번호 변경(final) 변경 불가
        //person.ssn = "8888-121212";   // final 필드는 변경 불가
        // 국적(final) 변경 불가
        //person.nation = "미국";
    }
}
