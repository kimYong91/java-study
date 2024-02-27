package polymorphism.interface0.ex.ex3;

public class Healer implements Healable{

    String name;

    Healer (String name) {
        this.name = name;
    }

    public void heal(Attackable attackable) {
        System.out.println("힐러은(는) " + attackable + "을(를) 치유합니다. 치유의 빛!");
    }
}
