package Java.Pratice2;

public class Counter {
    static int count;

    static void Bid(){
        System.out.println((++count));
    }

    public static void main(String[] args) {
        Counter.Bid();
        Counter.Bid();
        Counter.Bid();
    }
}
