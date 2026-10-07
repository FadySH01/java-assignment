package Java.Pratice.BROCODE.Scanner;
import java.util.Scanner;
public class ScanerTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("full name");
        String name = scan.nextLine();

        System.out.println("Maths Score");
        double Maths = scan.nextDouble();

        System.out.println("English Score");
        double English = scan.nextDouble();

        System.out.println("Science Score");
        double Science = scan.nextDouble();

        System.out.println("Computer Score");
        double Computer = scan.nextDouble();

        System.out.println("Physics Score");
        double Physics = scan.nextDouble();


        System.out.println("Enter your fullname " + name );
        System.out.println("Enter Score for Maths " + Maths);
        System.out.println("Enter score for English " + English);
        System.out.println("Enter Score for Science" + Science);
        System.out.println("Enter score for computer " + Computer);
        System.out.println("Enter score for Physics " + Physics);

        double Total = Maths + English + Science + Computer + Physics;
        System.out.println("Total =" + Total);

        int average = (int) (Total/5);
        System.out.println("Average = " + average);

        char grade;
        if(average>=90){
            grade = 'A';
        }else if (average >= 80){
            grade = 'B';
        }else if (average >= 70){
            grade = 'C';
        }else if (average >= 60){
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.println("---Result Sumarry----");
        System.out.println("Name:" + name);
        System.out.println("Total Score:" + Total);
        System.out.println("Average Score:" + average);
        System.out.println("Grade: " + grade);

        scan.close();}
}