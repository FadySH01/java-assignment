import java.util.*;
import java.util.function.*;

public class StudentAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        List<Integer> scores = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores.add(sc.nextInt());
        }

        System.out.println("\nAll Scores: " + scores);

        // Functional Interfaces

        // Predicate → pass mark
        Predicate<Integer> isPass = score -> score >= 50;

        // Function → add bonus
        Function<Integer, Integer> addBonus = score -> score + 5;

        // Function → grading system
        Function<Integer, String> grade = score -> {
            if (score >= 70) return "A";
            else if (score >= 60) return "B";
            else if (score >= 50) return "C";
            else return "F";
        };

        // Consumer → display result
        Consumer<String> print = System.out::println;

        // Passed Students
        print.accept("\nPassed Students:");
        scores.stream()
                .filter(isPass)
                .forEach(score -> print.accept("Score: " + score));

        // Failed Students
        print.accept("\nFailed Students:");
        scores.stream()
                .filter(score -> score < 50)
                .forEach(score -> print.accept("Score: " + score));

        // Bonus + Grade
        print.accept("\nFinal Results (With Bonus + Grade):");
        scores.stream()
                .filter(isPass)
                .map(addBonus)
                .forEach(score ->
                        print.accept("Score: " + score + " Grade: " + grade.apply(score))
                );

        // Average
        double avg = scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        print.accept("\nAverage Score: " + avg);

        // Highest Score
        int max = scores.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        print.accept("Highest Score: " + max);

        // Lowest Score
        int min = scores.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        print.accept("Lowest Score: " + min);

        sc.close();
    }
}