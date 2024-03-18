package lambda.ex.ex5;

import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void peopleList () {
        System.out.println("Hello" + name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
