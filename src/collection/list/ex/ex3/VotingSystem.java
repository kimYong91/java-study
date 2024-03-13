package collection.list.ex.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    private List<Candidate> candidateList = new ArrayList<>();

    public VotingSystem() {
         candidateList.addAll(List.of(new Candidate("고길동"), new Candidate("둘리"), new Candidate("마이콜"), new Candidate("희동이")));
//        candidateList.add(new Candidate("고길동"));
//        candidateList.add(new Candidate("둘리"));
//        candidateList.add(new Candidate("마이콜"));
//        candidateList.add(new Candidate("희동이"));

    }
//    public VotingSystem(List<Candidate> candidates) {     -> 메인에서 후보자 이름을 등록하는 방법
//        this.candidates = candidates;
//    }
    public void startVoting() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < candidateList.size(); i++) {
            System.out.println((i+1) + ". " + candidateList.get(i).getName());
        }                           // 리스트(candidateList).후보객체(get(i)).이름문자열(getName())
//        System.out.println("""
//                1. 고길동
//                2. 둘리
//                3. 마이콜
//                4. 희동이
//                """);
        while (true) {
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):");
            int choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    candidateList.get(0).receiveVote();
//                    break;
//                case 2:
//                    candidateList.get(1).receiveVote();
//                    break;
//                case 3:
//                    candidateList.get(2).receiveVote();
//                    break;
//                case 4:
//                    candidateList.get(3).receiveVote();
//                    break;
//                default:
//                    System.out.println("잘못 입력 하셨습니다.");
//                    break;
//                case 0:
//                    System.out.println("투표를 종료합니다.");
//                    return;
            if (choice == 0) break;
            else if (choice > 0 && choice <= candidateList.size()) {
                int realIndex = choice - 1;
                // 투표 카운트하기
                candidateList
                        .get(realIndex)     // 후보 객체 가져오기
                        .receiveVote();     // 후보의 투표수 늘리기
            } else {
                System.out.println("번호를 맞게 입력해주세요");
            }
        }
        printResults();
    }
    public void printResults() {
        System.out.println(candidateList.toString());
    }
}
