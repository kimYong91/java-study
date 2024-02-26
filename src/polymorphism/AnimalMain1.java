package polymorphism;

public class AnimalMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();

        // 각각 개별적인 타입의 경우
//        dog.sound();
//        cat.sound();
//        pig.sound();

        // 배열을 콩해 새로운 객체가 들어오더라도 중복 제거 후 기능 수행
//        Dog[] animalArray = {dog, cat, pig};
//        for (Dog animal : animalArray) {
//            animal.sound();
//        }

        // 다형적 참조를 통해 (부모 타입은 자식 타입을 담을 수 있다)
        // 각각 다른 타입의 자식들을 부모 타입의 배열에 담는다.
        // 각각의 자식의 타입은 부모 타입으로 업 캐스팅 된다.
        Animal[] animalArray = {dog, cat, pig}; // dog, cat, pig 들이 Animal 으로 업 캐스팅 됨

        // 반복문을 통해 Animal 타입(부모 타입)의 변수에 접근
        for (Animal animal : animalArray) {
            animal.sound();     // 오버라이딩이 우선순위 이기에 Animal 의 sound 가 아닌 각각의 sound 메소드로 실행됨
        }




    }
}
