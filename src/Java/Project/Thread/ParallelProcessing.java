package Java.Project.Thread;


    public class ParallelProcessing extends Thread {

        @Override
        public void run() {
            // Prints the name of the thread currently executing this task
            System.out.println("Task running by: " + Thread.currentThread().getName());
        }


        public static void main(String[] args) {

        /*
         Creating multiple ParallelProcessing objects.
         Each object represents an independent thread.
        */
            ParallelProcessing t1 = new ParallelProcessing();
            ParallelProcessing t2 = new ParallelProcessing();
            ParallelProcessing t3 = new ParallelProcessing();

        /*
         Calling start() tells the JVM to start each thread.
         The JVM schedules these threads to run in parallel
         on available CPU cores.
         The execution order is not guaranteed.
        */
            t1.start();
            t2.start();
            t3.start();
        }
    }
