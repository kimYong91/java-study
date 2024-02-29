package quiz.quiz2.ex4;

public class Healer extends Name implements Healable{

    String name;

    Healer(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public void heal(Name name) {
        System.out.println(this.name + "은(는) " + name.name + "을(를) 치유합니다. 치유의 빛!");
    }
}
