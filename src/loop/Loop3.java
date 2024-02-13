package loop;

public class Loop3 {
    public static void main(String[] args) {
        /* do-while 문, while문과 유사하지만, 무조건 한 번은 코드를 실행한다.
        do {
            //반복할 코드
        } while (조건식);
         */

        int i = 10;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        System.out.println("=========");

        i = 10;
        while (i < 5); {
            System.out.println("i = " + i);
            i++;
        }
    }
}
