package Java.Chapter4.UnChecked;

public class MultipleTryFinallyExample {

        public static void main(String[] args) {
            // First try-finally
            try {
                System.out.println("Try block 1");
            } finally {
                System.out.println("Finally block 1");
            }

            // Second try-finally
            try {
                System.out.println("Try block 2");
            } finally {
                System.out.println("Finally block 2");
            }

            System.out.println("Program continues...");
        }
    }
