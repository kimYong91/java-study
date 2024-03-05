package library.lang.ex1;

public class Equals {
    // Object 클래스의 equals 메서드는 객체의 동등성을 비교하는데 사용
    // 기본 구혀 갑은 this == obj : 실제로 같은 객체인지 비교
    // 오버라이딩을 통해 논리적 동등성을 구현할 수 있다.
    Object object;
    String string;

    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("홍길동", 30);
        Person person3 = new Person("홍길동", 60);
        Person person4 = null;
        Cat person5 = new Cat("홍길동",30);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
        System.out.println(person1.equals(person5));

    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        //객채가 null인 경우 => false
        if (obj == null) return false;

        // 타입이 같은지 비교
        if (getClass() != obj.getClass()) return false;

        // 필드 값을 비교해서 두 필드(이름, 나이)가 같으면 => 동등
        return ((Person) obj).name.equals(name) && age == ((Person) obj).age;
    }

}
class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}