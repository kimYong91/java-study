package quiz.quiz4;

import java.time.LocalDate;
import java.time.Period;

public class Quiz3 {
    public static void main(String[] args) {
        LocalDate worldCup = LocalDate.of(2026,6,14);
        LocalDate now = LocalDate.now();

        Period period = Period.between(now, worldCup);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.printf("다음 월드컵은 %d년 %d개월 %d일 후에 개최됩니다.", years, months, days);
    }
}
/*
월드컵 개최일까지 남은 시간 계산하기

    요구사항: 특정 월드컵 개최일까지 남은 년, 월, 일을 계산하세요.
     예를 들어, 다음 월드컵이 2026년 6월 14일에 시작한다고 할 때,
     오늘 날짜로부터 개최일까지 남은 시간을 Period를 사용하여 계산하세요.

    출력 예시:
    다음 월드컵은 2년 3개월 1일 후에 개최됩니다.
 */