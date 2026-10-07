package Java.Chapter02.POLYMORPHISM;

public class Calculator {

        public int add(int a, int b) {
            return a + b + 20;
        }

        public long add(long a, long b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Public class with main method
    class OverloadingExample {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println(calc.add(2, 3));
            System.out.println(calc.add(2.5, 3.5));
            System.out.println(calc.add(1, 2, 3));
        }
    }