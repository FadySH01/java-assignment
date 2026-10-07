package Java.Chapter08.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {

        public static void bookTaxi(int requestNumber){
            System.out.println(
                    "Taxi booked for request" + requestNumber +
                            "by" + Thread.currentThread().getName()
            );
        }

        public static void main(String[] args) {
            ExecutorService pool = Executors.newCachedThreadPool();

            for(int i = 1; i<= 15; i++){
                final int request = i;

                pool.execute(new Runnable() {
                    @Override
                    public void run() {
                        bookTaxi(request);
                    }
                });
            }
            pool.shutdown();
        }
    }
