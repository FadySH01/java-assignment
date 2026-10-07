package Java.Chapter03.WrapperClass;

public class UnboxingExample {

        public static void main(String[] args) {
            Integer number = Integer.valueOf(200); // Wrapper class object

            // Manual Unboxing
            int manualUnboxed = number.intValue();

            // Auto Unboxing (compiler does it automatically)
            int autoUnboxed = number;

            System.out.println("Wrapper value: " + number);
            System.out.println("Manual Unboxing: " + manualUnboxed);
            System.out.println("Auto Unboxing: " + autoUnboxed);
        }
    }

