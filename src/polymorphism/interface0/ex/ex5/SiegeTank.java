package polymorphism.interface0.ex.ex5;

public class SiegeTank extends Unit implements Attackable{


    public SiegeTank(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    @Override
    public void attack(String name) {
        System.out.println(this.name + "은(가) " + name + "을(를) 향하여 포를 쏩니다." + "\n" + " 데미지: " + this.damage);
    }

    @Override
    public void attack1(Unit unit) {
        System.out.println(this.name + "은(가) " + unit.name + "을(를) 향하여 포를 쏩니다." + "\n" + " 데미지: " + this.damage);
    }


}
