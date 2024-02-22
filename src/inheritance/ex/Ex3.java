package inheritance.ex;

public class Ex3 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "John Doe";
        professor.age = 40;
        professor.department = "컴퓨터 과학";

        Student student = new Student();
        student.name = "Jane Smith";
        student.age = 20;
        student.studentId = 20201234;


        professor.introduce();
        student.introduce();
    }

}
