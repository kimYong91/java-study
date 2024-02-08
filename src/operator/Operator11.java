package operator;

public class Operator11 {
    public static void main(String[] args) {
        // 삼항 연산자 : 3개의 피연산자를 팔요로 하는 연산자
        //  조건식  ?  참일 경우  :  거짓일 경우

        int score = 85;
        String grade = (score > 90) ? "A" : "B";
        System.out.println("grade = " + grade);

        // 삼항 연산자는 조건문으로 풀어 사용할 수 있다.
    }
}
