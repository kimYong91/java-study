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
