package quiz.quiz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> candidates = new ArrayList<>();
        Map<String, Integer> vote = new HashMap<>();
        candidates.add("고길동");
        candidates.add("듈리");
        candidates.add("마이콜");
        candidates.add("희동이");

        while (true) {
            for (int i = 0; i < candidates.size(); i++) {
                System.out.println((i + 1) + ". " + candidates.get(i));
            }


        }
    }
}
