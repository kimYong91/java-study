package 개인연습.중첩_클래스NestedClass;

public class Franchise {
    public static class TaskForce {
        private String title;
        private String name;

        public TaskForce(String title, String name) {
            this.name = name;
            this.title = title;
        }

        public Franchise launch() {
            System.out.println(name + "님께서 " + title + "점 런칭하였습니다.");
            return new Franchise();
        }
    }

    class Coupon {
        private int amount;
        private String name;

        public Coupon(int amount, String name) {
            this.amount = amount;
            this.name = name;
        }
    }

    public void getCoupon(int amount, TaskForce taskForce) {
        System.out.println("%d원 쿠폰 %s점에서 %s님에게 발급되었습니다.".formatted(amount, taskForce.title, taskForce.name));
    }
}
