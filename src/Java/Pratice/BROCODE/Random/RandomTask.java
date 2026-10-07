package Java.Pratice.BROCODE.Random;

import java.util.Random;

public class RandomTask {
    public static void main(String[] args) {

        Random t = new Random();

        int A = t.nextInt(4 + 1);

        System.out.println(A);
    }
}
