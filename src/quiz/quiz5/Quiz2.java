package quiz.quiz5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz2 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> lotto = new HashSet<>();


        while (lotto.size() < 6) {
            int i = random.nextInt(45) + 1;
            lotto.add(i);

        }
        System.out.println(lotto);

    }
}
