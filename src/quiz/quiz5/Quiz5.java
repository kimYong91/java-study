package quiz.quiz5;

import java.util.function.Function;

public class Quiz5 {
    public static void main(String[] args) {
        Function<String, String> function = date -> date.substring(0,4) + "-" + date.substring(4,6) + "-" + date.substring(6,8);
        String date = "20240320";
        String apply = function.apply(date);
        System.out.println(apply);
    }
}
