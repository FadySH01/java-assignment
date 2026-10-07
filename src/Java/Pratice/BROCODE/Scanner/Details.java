package Java.Pratice.BROCODE.Scanner;
import java.util.Scanner;
public class Details {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = S.nextLine();

        System.out.println("Enter your age");
        int age = S.nextInt();

        S.nextLine();

        System.out.println("Enter your favourite tech Field");
        String Tech = S.nextLine();


        System.out.println("Hello" + name + "! You are" + age + "years old and you love" + Tech + ". Keep going _ the world need you!" );

        S.close();
    }
}
