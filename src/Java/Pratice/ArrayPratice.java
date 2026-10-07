package Java.Pratice;

public class ArrayPratice {
    public static void main(String[] args) {

        int[] app1 = {60, 60, 80, 24, 90};
        int sum = 0;

        for (int num : app1) {
            sum += num;
        }
    double average = (double) sum/ app1.length;
        System.out.println("Average =" + average);

    }

}