package collection.ex;

import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String push = stack.push("www.example.com");
        String push1 = stack.push("www.example.com/about");
        String push2 = stack.push("www.example.com/contact");


        move(push);
        back(stack);
        inquiry(stack);
        move(push1);
        back(stack);
        inquiry(stack);
        move(push2);
        back(stack);
        inquiry(stack);

        /*
        public static void main(String[] args) {
        Stack<String> webHistory = new Stack<>();

        webHistory.push("www.naver.com");
        webHistory.push("www.naver.com/cafe");
        webHistory.push("www.naver.com/webmail");

        goBack(webHistory);
        goBack(webHistory);
        goBack(webHistory);

    }

    private static void goBack(Stack<String> webHistory) {
        try {
            System.out.println("=====================");
            String pop = webHistory.pop();
            System.out.println("현재 페이지 = " + pop);
            String peek = webHistory.peek();
            System.out.println("이전 페이지로 돌아갑니다 = " + peek);
        } catch (EmptyStackException e) {
            System.out.println("더 이상 돌아갈 페이지가 없습니다.");
        }
    }
}
         */


    }
    static void inquiry (Stack<String> stack) {
        String inquiry = stack.peek();
        System.out.println("이전 페이지를 조회: " + inquiry);
    }
    static void back (Stack<String> stack) {
        String back = stack.pop();
        System.out.println("뒤로가기: " + back);
    }
    static void move (String push) {
        Stack<String> stack = new Stack<>();
        String move;
        move = stack.push(push);
        System.out.println("현제 페이지: " + move);
    }
}
 /*
    문제 : 웹 브라우저 방문 기록 (Stack 활용)
    웹 브라우저에서 사용자가 방문한 페이지의 이력을 스택을 사용하여 관리하는 프로그램을 작성하세요.
    사용자가 새로운 페이지로 이동할 때마다 해당 페이지의 URL을 스택에 push하고,
    사용자가 뒤로 가기 버튼을 클릭할 때마다 스택에서 최근 페이지 URL을 pop하여 이전 페이지로 이동할 수 있게 합니다.

    요구사항:
    사용자가 방문한 페이지 URL을 순서대로 스택에 추가(push)합니다.
    사용자가 뒤로 가기를 선택하면, 현재 페이지를 스택에서 제거(pop)하고, 이전 페이지를 조회(peek)합니다.
    입력 예시:

    데이터
    www.example.com
    www.example.com/about
    www.example.com/contact

    출력 예시:
    현재 페이지: www.example.com/contact
    이전 페이지로 돌아갑니다: www.example.com/about
     */