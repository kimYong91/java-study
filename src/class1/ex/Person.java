package class1.ex;

public class Person {
    // 필드 : name, age, gender
    String name;
    int age;
    String gender;

    // 생성자 : 모든 속성을 초기화하는 생성자, 이름, 성별만 초기화하는 생성자

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person(String name, String gender) {
        this(name, 0, gender);
    }

    // 메서드 : 필드 정보를 출력하는 printInfo()
    void printInfo() {
        System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender);
    }
}

