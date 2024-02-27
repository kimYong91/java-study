package polymorphism.interface0.ex.ex3;

public class Mage implements Attackable{

    String name;

    Mage (String name) {
        this.name = name;
    }

    public void attack(Attackable attackable) {
        System.out.println("마법사은(는) " + attackable + "에게 마법 공격을 합니다. 불의 화살!");
    }
}
