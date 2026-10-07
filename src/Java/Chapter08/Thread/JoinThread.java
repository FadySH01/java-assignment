package Java.Chapter08.Thread;

    class JoinThread implements Runnable {

        public JoinThread() {
            System.out.println("Thread: " + Thread.currentThread().
                    getName() + ", State: New");
        }

        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", State: Running");

            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
            }

            System.out.println("Thread: " + Thread.currentThread().getName() + ", State: Dead");
        }
    }

    class TestThread12 {
        public static void main(String[] args) throws InterruptedException {

            Thread t1 = new Thread(new JoinThread(), "Thread-1");
            Thread t2 = new Thread(new JoinThread(), "Thread-2");
            Thread t3 = new Thread(new JoinThread(), "Thread-3");

            // Start Thread-1 and wait for it to finish
            t1.start();
            t1.join();

            // Start Thread-2 after Thread-1 is dead
            t2.start();
            t2.join();

            // Start Thread-3 after Thread-2 is dead
            t3.start();
        }
    }

