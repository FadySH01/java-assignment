package Java.Chapter14;
import Java.Chapter14.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 85.5),
                new Student("Bob", 22, 70.0),
                new Student("Charles",21,85.5),
                new Student("David", 23,90.0),
                new Student("Alice", 20,85.5)
        );

        System.out.println("======STATELESS OPERATIONS======");
        List<String> topStudent = students.stream()
                .filter(s -> s.getGrade() > 80)
                .map(s -> s.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println("\n====STATEFUL OPERATION====");
        List<Student> uniqueSorted = students.stream().distinct().sorted((a,b) -> Double.compare(b.getGrade(),a.getGrade())).collect(Collectors.toList());
        uniqueSorted.forEach(System.out::println);


    }
}