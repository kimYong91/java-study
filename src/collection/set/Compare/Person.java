package collection.set.Compare;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // 나이 기준으로 정수 비교 : 양수, 0, 음수
        int ageCompared = Integer.compare(this.age, other.age);
        // 나이가 같을 경우 이름으로 비교
        if (ageCompared == 0){
            int nameCompare = this.name.compareTo(other.name);
            return nameCompare;
        }
        // 나이가 다르면 나이순(1) 비교
        return ageCompared;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
