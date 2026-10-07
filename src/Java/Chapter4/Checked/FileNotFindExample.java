package Java.Chapter4.Checked;
import java.io.*;
public class FileNotFindExample {


        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("missing.txt");
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException: File not found!");
            }
        }
    }

