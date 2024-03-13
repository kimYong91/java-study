package collection.ex.ex3.다른풀이;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> candidates = new ArrayList<>();
        List<Integer> votes = new ArrayList<>();

        candidates.add("고길동");
        candidates.add("둘리");
        candidates.add("마이콜");
        candidates.add("희동이");

        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }


        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i+1) + ". " + candidates.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):");
            int choice = scanner.nextInt();

            if (choice == 0) break;
            else if (choice > 0 && choice <= candidates.size()){
                Integer vote = votes.get(choice - 1);
                votes.set(choice - 1, vote + 1);
            }
        }
        System.out.println("투표결과 : ");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.printf("%s : %d", candidates.get(i), votes.get(i));
        }
    }
}
