package Java.Chapter4.UnChecked;

public class IllegalArgumentExample {

        public static void main(String[] args) {
            Thread t = new Thread();
            try {
                t.sleep(-1000); // Negative time not allowed
            } catch (IllegalArgumentException | InterruptedException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
            }
        }
    }

