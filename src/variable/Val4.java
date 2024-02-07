package variable;

public class Val4 {
    public static void main(String[] args) {
        //두 변수의 갋을 교환하기
        /*
        두 그릇의 내용물을 바꾸는 순서
        A 그릇에는 10ml 물이 있고
        B 그릇에는 20ml 오렌지 쥬스가 있다.
        어떻게 하면 내용믈을 바꿀 수 있을까?

        방법
        c 그릇을 하나 추가하여 A 그릇을 c 그릇에 옮긴 후 비어진 컵에 쥬스를 옮기고 추가한 그릇에 있는 물을 쥬스가 닮겨있던 컵에 옶긴다.
        */
        int a = 10; // A 그릇 10
        int b = 20; // B 그릇 20
        int temp; // C 그릇 추가

        temp = a; //빈 그릇에 a 그릇의 내용물을 10에 넣는다.
        a = b; // b 그릇을 의 내용물을 a 그릇으로 옮긴다.
        b =temp; // c 그릇의 내용물을 b 그릇으로 옮긴다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
