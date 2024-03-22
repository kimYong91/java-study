package quiz.quiz5;

import java.util.HashMap;
import java.util.Map;

public class Quiz3 {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        Map<String, Integer> word = new HashMap<>();
        String[] split = text.split(" ");
        for (String s : split) {
            String words = s.replaceAll("[^가-힣]", "");
            int sameWords = word.getOrDefault(words, 0) + 1;
            word.put(words, sameWords);
        }
        System.out.println(word);
    }
}
