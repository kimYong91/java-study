package collection.list.ex.ex3;


public class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    void receiveVote(){
        votes++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "후보자 이름 : " + name + ", 득표수 : " + votes + "\n";

    }
}
