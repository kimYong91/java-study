package method;

public class Method1 {
    public static void main(String[] args) {
//        int x = 1;
//        int y = 2;
////        System.out.println("x + y = " + (x + y));
//        int sum = x + y;
//        System.out.println("덧셈 결과 1 : " + sum);
        sum(5,7);
//        int x2 = 1;
//        int y2 = 2;
//        int sum2 = x2 + y2;
//        System.out.println("덧셈 결과 2 : " + sum2);
        sum(5,6);
    }

    // 함수 (function)
    // 수학에서 가져온 개념 : 값을 입력하면. 연산을 처리하여 결과를 출력한다.
    // 자바에서는 함수를 메서드(Method)라고 한다.

    /*
    [리턴 타입] [메서드 이름] ( [매개변수...] ) {
        // 실행할 코드
    }
     */

        // sum  메서드 선언 (Declaration)
        public static int sum ( int g, int p){       // 메서드 시그니쳐
            int sum = g + p;
            System.out.println("덧셈 결과 3 : " + sum);
            return sum;       // 반환 결과
        }
    }
