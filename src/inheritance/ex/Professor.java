package inheritance.ex;

public class Professor extends Person{
   String department;

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(department +" 학과에서 근무합니다.");
    }
}
