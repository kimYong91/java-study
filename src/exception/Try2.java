package exception;

public class Try2 {
    public static void main(String[] args) {

        try {
            int divedNUmber = 10 / 0;     // 예외 발생 가능 코드 : ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");   // try안에 있는 코드중 catch () 가로 안에 있는 에러가 발생시 작동
            System.out.println(e.getMessage()); // 에러 관련 메시지를 남겨줌 * getMessage() 이미 자바에서 만든 메서드
            e.printStackTrace();        // 예외의 stack을 추적해서 붉은 글씨로 출력 * printStackTrace() 이미 자바에서 만든 메서드
            System.out.println("예외 처리 되었습니다.");
        } finally {
            System.out.println("항상 출력되는 부분");
        }
        System.out.println("try 블럭 바깥");


        }
}
