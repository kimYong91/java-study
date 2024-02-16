package enum0;

public class Eunm1 {
    public static void main(String[] args) {
        Week today = Week.MONDAY; // 대문자는 열거형일 가능성이 높음

        switch (today) {
            case MONDAY -> System.out.println("월요일");
            case THURSDAY -> System.out.println("화요일");
        }

        //  반복문을 통해 열거형의 종류 확인
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
