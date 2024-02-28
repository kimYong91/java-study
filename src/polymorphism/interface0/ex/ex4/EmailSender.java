package polymorphism.interface0.ex.ex4;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 발송 성공: " + message);
    }
}
