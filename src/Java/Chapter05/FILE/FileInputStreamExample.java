package Java.Chapter05.FILE;

import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String fileName = "filenameStream1.txt";

        try{
            File file = new File(fileName);
            if (file.createNewFile()){
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
        }
            try(FileWriter Writer = new FileWriter(fileName)){
                Writer.write("Hello this is Miky! \nWelcome to Java files handling");
                    System.out.println("Successfully wrote to the file");
                }

            try(FileInputStream input = new FileInputStream(fileName)){
                int i;
                System.out.println("\nFile Content");
                while ((i = input.read()) != -1){
                    System.out.print((char)i);
                }
            }
            } catch (IOException e) {
                System.out.println("An error occurred:" + e.getMessage());
                }
        }
    }

