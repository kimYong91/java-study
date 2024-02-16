package class0;

public class Class2 {
    public static void main(String[] args) {

        // 배열을 사용할 경우 사람이 데이터를 수정하거나 관리할 때 실수할 수 있다.
        String[] studentName = {"홍길동", "홍길동1"};
        int[] studentScore = {80,70};
        int[] studentAge = {30,40};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("[학생 이름 : " + studentName[i] + "점수 : " + studentScore[i] + "나이 : " + studentAge[i] + "]");
        }

    }
}
