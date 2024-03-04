package exception.예외_활용법;

public class InsufficientException extends Exception {

    // 기본 생성자
    public InsufficientException() {
    }

    // 메시지를 매개변수로 가지는 생성자
    public InsufficientException(String message) {
        super(message);
    }
}