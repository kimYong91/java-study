package collection.ex.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    List<Candidate> candidateList = new ArrayList<>();

    public VotingSystem(List<Candidate> candidateList) {
        this.candidateList = candidateList;

    }
    public void startVoting() {
        Iterator<Candidate> candidateVotes = candidateList.iterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):");
        int num = scanner.nextInt();
        switch (num) {
            case 1 :
                candidateVotes.next().receiveVote();
                return;
            case 2 :
                candidateVotes.next().receiveVote();
                return;
            case 3 :

                return;
            case 4 :
                return;
            case 0 :
                break;
        }
    }
}
