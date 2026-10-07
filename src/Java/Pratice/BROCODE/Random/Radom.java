package Java.Pratice.BROCODE.Random;

import java.util.Random;

public class Radom {
    public static void main(String[] args) {

        Random random = new Random();


        double z = random.nextDouble();
        int x = random.nextInt();
        Boolean y = random.nextBoolean();

        System.out.println(z);
        System.out.println(y);
        System.out.println(x);

    }
}
