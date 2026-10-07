package Java.Chapter05.FILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("filename2.txt");


        try(Scanner myReader = new Scanner(myObj)){
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException Fady){
            System.out.println("An error occurred.");
            Fady.printStackTrace();
        }
    }
}
