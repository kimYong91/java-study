package access_modifier.ex.com.school.management;

public class MaxCounterMain {
    public static void main(String[] args) {
            /*
            MaxCounter counter = new MaxCounter(2);
            counter.increment();
            counter.increment();
            counter.increment();

            실행결과
            ===
            1
            2
            최대값을 초과할 수 없습니다.
             */
        MaxCounter counter = new MaxCounter(5);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();


    }
}
