package quiz.quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz1 {
    record Employee(String name, String role, int salary) {}
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );
        Integer collect = employees.stream().collect(Collectors.summingInt(Employee::salary));
        System.out.println("총 급여: " + collect);

        double v = employees.stream()
                .filter(employee -> employee.role.equals("Developer"))
                .mapToInt(employee -> employee.salary)
                .average()
                .orElse(0);

        System.out.println("Developer 평균 급여: " + v);
        double v1 = employees.stream()
                .filter(employee -> employee.role.equals("Manager"))
                .mapToInt(employee -> employee.salary)
                .average()
                .orElse(0);
        System.out.println("Manager 평균 급여: " + v1);


    }
}
/*
직원들의 급여 집계하기

    회사 직원들의 정보가 다음과 같이 주어져 있습니다. 모든 직원의 총 급여와, 직책별 평균 급여를 계산하세요.

    record Employee(String name, String role, int salary) {}

    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "Developer", 5000),
        new Employee("Bob", "Developer", 6000),
        new Employee("Charlie", "Manager", 7000),
        new Employee("David", "Manager", 8000)
    );

    // 목표 1: 모든 직원의 총 급여 계산하기
    // 목표 2: 직책별 평균 급여 계산하기

    출력예시
    ===
    총 급여: 26000
    Developer 평균 급여: 5500.0
    Manager 평균 급여: 7500.0
 */