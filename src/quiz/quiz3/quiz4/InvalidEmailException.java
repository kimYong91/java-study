package quiz.quiz3.quiz4;

public class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }

    public static void checkEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("예외 발생: 유효하지 않은 이메일 주소입니다.");
        }
    }
}