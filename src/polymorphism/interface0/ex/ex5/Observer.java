package polymorphism.interface0.ex.ex5;

public class Observer extends Unit implements Movable{


    public Observer(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    @Override
    public void move() {
        System.out.println(this.name + "이(가) 떠다닙니다.");
    }
}
