package Java.Chapter08.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void useComputer(int studentNumber){
        System.out.println(
                "Student" + studentNumber +
                        "is using a number on" +
                        Thread.currentThread().getName()
        );
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(12);

        for(int i = 1; i<= 8; i++){
            final int student = i;

            pool.execute(new Runnable() {
                @Override
                public void run() {
                    useComputer(student);
                }
            });
        }
        pool.shutdown();

    }
}
