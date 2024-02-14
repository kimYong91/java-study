package loop;

public class Ex1 {
    public static void main(String[] args) {
        // 반복문을 이용해서 20이내의 짝수를 출력해주세요

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수 : " + i);

            }


        }
        for (int i = 1; i <= 20; i++) { // 이 방법이 더 가독성이 좋다고 함
            if (i % 2 != 0){
                continue;
            }
            System.out.println("짝수 : " + i);
        }



        }
    }