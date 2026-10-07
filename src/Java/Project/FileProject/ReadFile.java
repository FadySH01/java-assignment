package Java.Project.FileProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
        public static void main(String[] args) {
            File myObj = new File("Fady.txt");


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


