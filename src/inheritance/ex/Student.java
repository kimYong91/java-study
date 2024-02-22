package inheritance.ex;

public class Student extends Person{

   int studentId;

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다.");
    }
}
