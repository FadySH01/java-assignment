package Java.Chapter14;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
public class ClassExample {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Micheal", "Mary", "Anna", "Moses");

            List<String> longNames = names.stream()
                    .filter(name -> name.length() > 4)
                    .map(String::toUpperCase)
                    .sorted()
                    .toList();

            System.out.println("Names longer than 4 letters: " + longNames);


            long count = names.stream()
                    .filter(name -> name.startsWith("M"))
                    .count();

            System.out.println("Name starting with M: " + count);
        }
    }

