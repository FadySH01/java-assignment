package Java.Chapter05.Scanner;

import java.util.Scanner;

public class ScanEx1 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username");

        String Username  = myObj.nextLine();
        System.out.println("Username is " + Username);
    }
}
