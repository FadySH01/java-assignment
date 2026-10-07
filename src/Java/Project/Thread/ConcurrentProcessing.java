/*
 This program demonstrates CONCURRENT PROCESSING in Java.
 Multiple threads make progress at the same time using CPU time sharing.
*/
public class ConcurrentProcessing {

    static class MyTask implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " running step " + i);
            }
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask());

        t1.start();
        t2.start();
    }
}
