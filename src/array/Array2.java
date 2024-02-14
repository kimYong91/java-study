package array;

public class Array2 {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 변수를 반복적으로 선언할 때
        // 동일한 타입을 연속된 메모리 공간에 저장하는 자료 구조

        int[] scores;           //int 타입의 배열 변수를 선언
        scores = new int[6];    // 배열 생성

        // 배열값의 값을 초기화 * 반드시 '0' 부터 시작
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 10;
        scores[3] = 80;
        scores[4] = 70;
        //scores[5] = 60;      // 배열을 초기화하지 않으면, 자동으로 초기 값으로 초기화된다.
        //scores[6] = 50;         // 배열의 범위를 초과하는 인덱스에 접근할 경우 예외발생
        // 기본타입의 초기값 : 숫자는 0, 실수는 0.0, boolean 은 false
        // 참조타입의 최기값 : null

        for (int i = 0; i < scores.length; i++) { //scores.length <- scores 의 길이 만큼 진행
            System.out.println(i + 1 + "번 점수 : " + scores[i]);
        }
        // 배열을 사용하면 반복문으로 리펙토링 할 수 있다.


        /*
        System.out.println("1번 점수 : " + scores[0]);
        System.out.println("2번 점수 : " + scores[1]);
        System.out.println("3번 점수 : " + scores[2]);
        System.out.println("4번 점수 : " + scores[3]);
        System.out.println("5번 점수 : " + scores[4]);
        System.out.println("6번 점수 : " + scores[5]);
         */

    }
}
