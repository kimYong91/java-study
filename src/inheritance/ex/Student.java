package inheritance.ex;

public class Student extends Person{

   int studentId;

    @Override
    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 "+ name +"입니다. 저는 "+ age +"살이고," +
                " " + "제 학번은 " + studentId + "입니다.");
    }
}
