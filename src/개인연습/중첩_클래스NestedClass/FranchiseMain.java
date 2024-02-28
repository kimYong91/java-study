package 개인연습.중첩_클래스NestedClass;

public class FranchiseMain {
    /*
    가게 이름
    지역
    점장 이름

    쿠폰 발행
     */
    public static void main(String[] args) {
        Franchise.TaskForce taskForce = new Franchise.TaskForce("남천", "홍길동");
        taskForce.launch();
        Franchise namchunStore = taskForce.launch();

        Franchise.TaskForce taskForce1 = new Franchise.TaskForce("금련산", "임꺽정");
        taskForce1.launch();
        Franchise kumryuStore = taskForce1.launch();

        namchunStore.getCoupon(10000, taskForce);

    }

    /*
    Franchise.TaskForce taskForce1 = new Franchise.TaskForce("남천", "홍길동");
        Franchise namchunStore = taskForce1.launch();

        Franchise.TaskForce taskForce2 = new Franchise.TaskForce("금련산", "임꺽정");
        Franchise kumryuStore = taskForce2.launch();

        // 2. (인스턴스) 내부 클래스 : 인스턴스가 있어야 생성 가능
        namchunStore.getCoupon(50000,"신사임당");
        kumryuStore.getCoupon(10000, "세종대왕");

        Franchise.Coupon coupon = namchunStore.new Coupon(1000, "율곡이이");



리더 홍길동님을 주축으로 남천TF팀 출범!
남천점 런칭하였습니다.
리더 임꺽정님을 주축으로 금련산TF팀 출범!
금련산점 런칭하였습니다.
50000원 쿠폰 남천점에서 신사임당님에게 발금되었습니다.
10000원 쿠폰 금련산점에서 세종대왕님에게 발금되었습니다.
1000원 쿠폰 남천점에서 율곡이이님에게 발금되었습니다.
     */


}
