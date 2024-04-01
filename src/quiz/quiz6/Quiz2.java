package quiz.quiz6;

import java.util.Map;

public class Quiz2 {
    public static void main(String[] args) {
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        userScores.entrySet().stream().map(userScore -> userScore.getValue() >= 50 ? userScore.getKey() + ": " + "합격" : userScore.getKey() + ": " + "불합격").forEach(System.out::println);
    }
}
