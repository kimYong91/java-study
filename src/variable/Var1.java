package variable;
public class Var1 {
    public static void main(String[] args) {

        int age; // 정수를 저장할 수 있는 age 이름의 변수 선언
        double value; // 실수를 저장할 수 있는 value 라는 이름의 변수

        int x,y,z; // 같은 종류의 변수는 한꺼번에 선언 가능

        int score; // 변수 선언 Declare, *
        score = 90; // 변수 초기화 initilize
        System.out.println("점수 : "+ score);
        score = 100;
        System.out.println("점수 : "+ score);
        score = 25;
        System.out.println("점수 :"+ score);

        int number = 100; // 선언과 초기화 동시에 가능

        int result = score + number; // 다른 변수의 값을 불러들여 저장, 또는 연산 가능

        System.out.println(result);
    }
}
