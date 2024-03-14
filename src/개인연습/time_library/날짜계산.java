package 개인연습.time_library;

import java.time.LocalDate;
import java.time.Period;

public class 날짜계산 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2026,6,14);
        LocalDate localDateNow = LocalDate.now();

        Period period = Period.between(localDate, localDateNow);

        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();


    }
}
 /*
    연습 문제 2: 월드컵 개최일까지 남은 시간 계산하기
    요구사항: 특정 월드컵 개최일까지 남은 년, 월, 일을 계산하세요.
     예를 들어, 다음 월드컵이 2026년 6월 14일에 시작한다고 할 때,
     오늘 날짜로부터 개최일까지 남은 시간을 Period를 사용하여 계산하세요.

    입력 예시: (자동으로 현재 날짜를 가져옵니다)

    출력 예시:
    다음 월드컵은 3년 8개월 21일 후에 시작합니다!
     */