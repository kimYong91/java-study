package polymorphism.interface0.ex.ex5;

public class SupplyDepot extends Unit implements Supply{


    public SupplyDepot(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    @Override
    public void provideSupply(String name) {
        System.out.println(this.name + "이(가) " + name + "에게 지원을 제공합니다.");
    }

    public void provideSupply1(Unit unit) {
        System.out.println(this.name + "이(가) " + unit.name + "에게 지원을 제공합니다.");
    }

}
