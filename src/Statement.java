public class Statement {
    public static void main(String[] args) {
        /*
         실행문 끝에는 반드시 세미콜론(;)을 붙여서 실행문이 끝났음을 표시해야 한다.
         세미콜론은 명령의 끝을 의미하기에 한줄에 여러 명령을 붙여 사용하여도 세미콜론 때문에 상관없다.
         */
        System.out.println("Hello");

        int x; //x라는 변수를 선언
        x = 1; //x에 1을 저장해라
        int y = 2; //y를 선언하고 2를 저장해라
        int result = x + y; //result를 선언하고 x와 y를 더해서 저장하라
        System.out.println(result); //출력하라
    }
}