package Java.Chapter01;

public class Third {
// String instance variable initialized with a Java.Chapter01.Third
// This literal is stored in the String Pool for memory efficiency.
            String message="Hello, this is a Java.Chapter01.Third!";

// Method using Java.Chapter01.Third directly
            public void printMessages() {
                System.out.println("Printing messages:");
                System.out.println(message);  // prints the variable holding the literal
                System.out.println("This is another Java.Chapter01.Third!");  // prints a literal directly
            }

            public static void main(String[] args) {
                Third example= new Third();
                example.printMessages();
                System.out.println(example);
            }
        }
