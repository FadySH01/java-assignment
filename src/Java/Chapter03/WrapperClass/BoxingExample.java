package Java.Chapter03.WrapperClass;

public class BoxingExample {
        public static void main(String[] args) {
            int num = 50; // primitive int

            // Manual Boxing
            Integer manualBoxed = Integer.valueOf(num);

            // Auto Boxing (Java does it automatically)
            Integer autoBoxed = num;

            System.out.println("Primitive value: " + num);
            System.out.println("Manual Boxing: " + manualBoxed);
            System.out.println("Auto Boxing: " + autoBoxed);
        }
    }
