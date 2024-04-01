package quiz.quiz6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

        Consumer<String> consumer = language -> System.out.println(language);
        languages.sort(Comparator.comparingInt(String::length));
        languages.forEach(consumer);

    }
}
