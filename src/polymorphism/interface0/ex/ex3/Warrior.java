package polymorphism.interface0.ex.ex3;

public class Warrior implements Attackable{

    String name;

    Warrior (String name) {
        this.name = name;
    }


    public void attack(Attackable attackable) {
        System.out.println("전사이(가) " + attackable + "을(를) 공격합니다. 강한 공격!");
    }
}
