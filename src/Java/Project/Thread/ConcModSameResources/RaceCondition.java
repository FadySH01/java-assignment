package Java.Project.Thread.ConcModSameResources;

/*
 This program demonstrates a RACE CONDITION,
 which occurs when multiple threads modify the same resource
 at the same time without proper synchronization.
*/
public class RaceCondition {

    /*
     The Counter class represents a shared resource.
     The variable 'count' is accessed by multiple threads.
    */
    static class Counter {
        int count = 0;

        /*
         This method increments the count.
         Since it is not synchronized, multiple threads
         can access it at the same time.
        */
        void increment() {
            count++;
        }
    }

    /*
     The main method creates and starts multiple threads
     that modify the same Counter object concurrently.
    */
    public static void main(String[] args) throws Exception {

        /*
         A single Counter object shared by both threads.
         This shared access causes a race condition.
        */
        Counter c = new Counter();

        /*
         First thread increments the counter 1000 times.
        */
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        /*
         Second thread increments the same counter 1000 times.
        */
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        /*
         Starting both threads.
         They run concurrently and access the same resource.
        */
        t1.start();
        t2.start();

        /*
         join() ensures the main thread waits
         until both threads finish execution.
        */
        t1.join();
        t2.join();

        /*
         Printing the final value of count.
         The expected value is 2000, but due to race condition,
         the actual result is usually less.
        */
        System.out.println("Final count: " + c.count);
    }
}
// This program shows a race condition.
// Multiple threads modify the same variable without synchronization.
// The final result becomes unpredictable due to lost updates.
