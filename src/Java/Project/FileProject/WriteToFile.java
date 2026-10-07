package Java.Project.FileProject;

import java.io.FileWriter;
import java.io.IOException;

    public class WriteToFile {
        public static void main(String[] args) {
            try(
                    FileWriter myWriter = new FileWriter("Fady.txt")){
                myWriter.write("My name is Olagunju Fadilulah , " +
                        "I created this shit now!");

                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }
    }

