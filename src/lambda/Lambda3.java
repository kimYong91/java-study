package lambda;

public class Lambda3 {
    public static void main(String[] args) {
        Returner returner1 = () -> {return "반환값";};
        Returner returner2 = () -> "반환식만 있을 경우 괄호와 return을 생략 가능";

        System.out.println(returner1.returnObject());
        System.out.println(returner2.returnObject());

    }

}
