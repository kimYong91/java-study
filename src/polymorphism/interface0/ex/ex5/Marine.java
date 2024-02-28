package polymorphism.interface0.ex.ex5;

public class Marine extends Unit implements Attackable, Movable{

    Marine(String name, int hp, int damage) {
        super(name, hp, damage);

    }

    @Override
    public void attack(String name) {
        System.out.println(this.name + "이 " + name + "을(를) 행하여 총을 쏩니다." + "\n" + " 데미지: " + this.damage);
    }

    @Override
    public void attack1(Unit unit) {
        System.out.println(this.name + "이 " + unit.name + "을(를) 행하여 총을 쏩니다." + "\n" + " 데미지: " + this.damage);
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 이동 합니다.");
    }
}
