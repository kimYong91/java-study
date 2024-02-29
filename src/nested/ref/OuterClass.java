package nested.ref;

public class OuterClass {
    String OuterField = "바깥쪽 필드";
    String field;
    void outerMethod(){
        System.out.println("바깥쪽 메서드");
    }
    void Method(){
        System.out.println("바깥쪽 메서드");
    }

    // 안쪽 중첩 클래스
    class InnerClass {
        String innerField = "안쪽 필드";
        String field;
        void innerMethod() {
            System.out.println("안쪽 메서드");
        }
        void Method() {
            System.out.println("안쪽 메서드");
        }
        void call() {
            System.out.println("=====1. 안쪽에서 안쪽 필드와 메서드 호출 =========");
            // 안쪽에서 안쪽(중첩객체 참조)
            System.out.println(innerField);             // this를 사용 안하더라도 사용가능
            innerMethod();
            System.out.println(OuterClass.this.field);  // 이름이 같은 때 바깥쪽 filed 를 쓰고 싶을때
            System.out.println(this.field);             // 필드의 이름이 겹칠때 This 키워드로 명시적으로 가리킨다.
            this.innerMethod();

            // 안쪽에서 바깥쪽을 참조
            System.out.println("====== 2. 안쪽에서 바깥쪽 필드와 메서드 호출 ========");
            System.out.println(OuterClass.this.OuterField);
            OuterClass.this.outerMethod();
            OuterClass.this.Method();
        }
    }
}
