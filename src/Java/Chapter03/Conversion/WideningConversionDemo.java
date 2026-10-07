package Java.Chapter03.Conversion;

public class WideningConversionDemo {

        public static void main(String[] args) {
            byte b = 42;
            short s = b;
            int i = s;
            long l = i;
            float f = l;
            double d = f;

            char c = 'A';
            int i2 = c;
            long l2 = c;
            float f2 = c;
            double d2 = c;

            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + f);
            System.out.println("double: " + d);
            System.out.println("char: " + c);
            System.out.println("char to int: " + i2);
            System.out.println("char to long: " + l2);
            System.out.println("char to float: " + f2);
            System.out.println("char to double: " + d2);
        }
    }
