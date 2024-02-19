package class1;

import java.util.Scanner;

public class Constructor2 {
    public static void main(String[] args) {
        Member member = new Member("홍길동", 30, 20);
        Member member1 = new Member("이순신", 100, 35);
       // Member member2 = new Member(); // 생성자가 존재할 때, 입력값이 없는 생성자를 호출하면 컴파일 오류가 발생 => 런타임 오류를 원천 차단, 제약을 줌
        Member member2 = new Member("임꺽정", 40); // 같은 이름의 생성자를 여러개 만들면 여러 변수에 대응 가능

        Member[] members = {member, member1, member2};
        for (Member m : members) {
            System.out.println("이름 : " + m.name + " 성적 : " + m.score + " 나이 : " + m.age);
        }

    }
}
