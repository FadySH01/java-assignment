package Java.Pratice.BROCODE.Scanner;
import java.util.Scanner;
public class ScanerTask {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);


        System.out.println("My full name is");
        String fullname = Scan.nextLine();

        System.out.println("My age is ");
        int age = Scan.nextInt();

        Scan.nextLine();

        System.out.println("My fav Color is");
        String color = Scan.nextLine();

        System.out.println("My height is ");
        double height = Scan.nextDouble();

        Scan.nextLine();

        System.out.println("Do you love coding");
        boolean coding = Scan.nextBoolean();

        System.out.println("My fullname is" +  fullname);
        System.out.println("I am" + age + "years old");
        System.out.println("My fav Color is " + color);
        System.out.println("My height is " + height);
        System.out.println("Do you love coding" + coding);
    }
}
