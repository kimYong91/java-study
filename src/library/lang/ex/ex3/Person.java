package library.lang.ex.ex3;

public class Person {
    // hashCode() 메서드와 equals() 메서드를 오버라이딩하여 구현하세요.

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        return 300 + name.hashCode() * 100 + age ;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);

        System.out.println(person1.hashCode()); // 318734572
        System.out.println(person2.hashCode()); // 123456789
        System.out.println(person1.equals(person2)); // false
    }
}
