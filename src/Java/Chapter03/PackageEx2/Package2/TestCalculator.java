package Java.Chapter03.PackageEx2.Package2;


import Java.Chapter03.PackageEx2.Package1.Calculator;

    public class TestCalculator {
        public static void main(String[] args) {
            Calculator calc = new Calculator();


            // public → accessible
            calc.add(5, 3);

            // protected → ❌ not accessible (only in same package OR subclass)
            // calc.subtract(10, 4); // ERROR

            // default → ❌ not accessible outside package1
            // calc.multiply(2, 3); // ERROR

            // private → ❌ not accessible
            // calc.divide(10, 2); // ERROR

            // but we can call through public wrapper
            calc.safeDivide(20, 5);
            calc.safeDivide(10, 0);
        }
    }

