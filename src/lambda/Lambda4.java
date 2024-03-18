package lambda;

public class Lambda4 {
    public static void main(String[] args) {
        // 반환 값만 있을 경우, 중괄호와 return 생략
        //Param multiply = x -> {return  x*x;};

        // 먀개변수가 하나만 있을 때는 () 생략 가능
        Param multiply1 = (x) -> {return  x*x;};
        Param multiply2 = x -> {return  x*x*x;};

        System.out.println("4*4 = " + multiply1.func(4));
        System.out.println("4*4*4 = " + multiply2.func(4));

    }
}
