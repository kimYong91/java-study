package collection.ex.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    private List<Candidate> candidateList = new ArrayList<>();

    public VotingSystem() {

        this.candidateList.add(new Candidate("고길동"));
        this.candidateList.add(new Candidate("둘리"));
        this.candidateList.add(new Candidate("마이콜"));
        this.candidateList.add(new Candidate("희동이"));

    }
    public void startVoting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. 고길동
                2. 둘리
                3. 마이콜
                4. 희동이
                """);
        while (true) {
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    this.candidateList.get(0).receiveVote();
                    break;
                case 2:
                    this.candidateList.get(1).receiveVote();
                    break;
                case 3:
                    this.candidateList.get(2).receiveVote();
                    break;
                case 4:
                    this.candidateList.get(3).receiveVote();
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
                case 0:
                    System.out.println("투표를 종료합니다.");
                    return;
            }
        }
    }
    public void printResults() {
        System.out.println(this.candidateList.toString());
    }
}
