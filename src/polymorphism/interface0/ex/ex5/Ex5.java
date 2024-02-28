package polymorphism.interface0.ex.ex5;

public class Ex5 {
    public static void main(String[] args) {
        Attackable[] attackUnits = {new Marine("마린", 100,10), new SiegeTank("시저탱크",300,70)};
        Movable[] moveUnits = {new Marine("마린",100,10), new Observer("옵져버",50,0)};

        attackUnits[0].attack("시저탱크");
        attackUnits[1].attack("마린");


        for (Movable unit : moveUnits) {
            unit.move();
        }
        // SupplyDepot는 Attackable이나 Movable 인터페이스를 구현하지 않았으므로,
        // 공격이나 이동 메서드를 호출할 수 없습니다.
        SupplyDepot depot = new SupplyDepot("서플라이 디봇",3000,0);
        depot.provideSupply("시저탱크"); // 공급 기능만 수행

        System.out.println("==================");

        Marine marine = new Marine("마린",100,10);
        SiegeTank siegeTank = new SiegeTank("시저 탱크",300,70);
        Observer observer = new Observer("옵저버",50,0);
        CheckUnit checkUnit = new CheckUnit();


        marine.attack1(siegeTank);
        siegeTank.attack1(marine);
        marine.move();
        observer.move();
        checkUnit.getUnitStatus(marine);
        checkUnit.getUnitStatus(siegeTank);
        // SupplyDepot는 Attackable이나 Movable 인터페이스를 구현하지 않았으므로,
        // 공격이나 이동 메서드를 호출할 수 없습니다.
        SupplyDepot depot1 = new SupplyDepot("서플라이 디봇",3000,0);
        depot1.provideSupply1(siegeTank); // 공급 기능만 수행
    }
}
