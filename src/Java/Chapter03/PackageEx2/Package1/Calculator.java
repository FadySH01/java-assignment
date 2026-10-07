package Java.Chapter03.PackageEx2.Package1;

public class Calculator {

        public void add(int a, int b) {
            System.out.println("Public Add: " + (a + b));
        }

        protected void subtract(int a, int b) {
            System.out.println("Protected Subtract: " + (a - b));
        }

        void multiply(int a, int b) { // default (package-private)
            System.out.println("Default Multiply: " + (a * b));
        }

        private void divide(int a, int b) {
            System.out.println("Private Divide: " + (a / b));
        }


        public void safeDivide(int a, int b) {
            if (b != 0) {
                divide(a, b);
            } else {
                System.out.println("Cannot divide by zero");
            }
        }
    }

