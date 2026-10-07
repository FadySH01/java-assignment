package Java.Chapter4.Checked;
import java.io.*;
public class IOExceptionExample {
        public static void main(String[] args) {
            try {
                FileReader fr = new FileReader("nonexistent.txt"); // File doesn't exist
            } catch (IOException e) {
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    }
