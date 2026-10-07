package Java.Chapter03.Conversion;

    class NarrowingTest {
        public static void main(String[] args) {
            int big = 70000;

            short s = (short) big;
            char c = (char) big;
            byte b = (byte) big;

            System.out.println("int: " + big);
            System.out.println("int → short: " + s);
            System.out.println("int → char: " + c);
            System.out.println("int → byte: " + b);
        }
    }
