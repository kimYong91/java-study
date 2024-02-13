package loop;

public class Ex1 {
    public static void main(String[] args) {
        // 반복문을 이용해서 20이내의 짝수를 출력해주세요

        for (int i = 1; i <= 20; i++) {
            /*
            (int i = 1; i <= 20; i+= 2)
                 System.out.println(i);
             */
            //System.out.println(i * 2);
            if (i % 2 != 0){
                continue;
            }
            System.out.println("짝수 : " + i);
        }




        }
    }