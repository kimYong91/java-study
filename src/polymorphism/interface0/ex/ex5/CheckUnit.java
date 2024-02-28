package polymorphism.interface0.ex.ex5;

public class CheckUnit {

    public void getUnitStatus (Unit unit) {
        System.out.println(unit.name + "은(는) HP가 " + (unit.hp - unit.damage) + " 남았습니다.");
    }
}
