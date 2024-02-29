package quiz.quiz2.ex4;

public class Mage extends Name implements Attackable{

    String name;

    Mage (String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attack(Name name) {
        System.out.println(this.name + "이(가) " + name.name + "에게 마법 공격을 합니다. 불의 화살!");
    }
}
