package exception.ex.ex2;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException() {
    }
    public InvalidAgeException(String message) {
        super(message);
    }
    public void adult (int age) throws InvalidAgeException {
        if (age <= 19) {
            throw new InvalidAgeException("미성년자는 접근할 수 없습니다.");
        }
    }
}
