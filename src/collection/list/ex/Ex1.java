package collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//        System.out.println(numbers);
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
/*
문제: 정수를 저장하는 ArrayList를 생성하고, 1부터 10까지의 숫자를 추가하세요. 그리고 이 리스트에서 짝수만 찾아 출력하는 프로그램을 작성하세요.
*/