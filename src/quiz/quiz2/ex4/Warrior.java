package quiz.quiz2.ex4;

public class Warrior extends Name implements Attackable{

    String name;

    Warrior (String name){
        super(name);
        this.name = name;
    }

    @Override
    public void attack(Name name) {
        System.out.println(this.name + "이(가) " + name.name + "을(를) 공격합니다. 강한 공격!");
    }
}
