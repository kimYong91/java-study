package condition;

public class Condition1 {
    public static void main(String[] args) {
        // 만약 나이가 18살 이상이면 성인입니다.
        // 만약 나이가 18살 이하면 미성년자입니다.
        // if age >= 18 "성인입니다."
        // if age < 18 "미성년자입니다."
        /*
        if (age )
         */

        int age = 20;

        if (age >= 18) {
            System.out.println("성인입니다.");
        }
        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
