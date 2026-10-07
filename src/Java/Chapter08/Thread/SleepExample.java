package Java.Chapter08.Thread;

    public class  SleepExample extends Thread {

        public String name1;

        public SleepExample(String name1) {
            this.name1 = name1;
            setName(name1);
        }

        public void run() {
            System.out.println(name1 + " starts working...");
            // System.out.println(Thread.currentThread().getName() + " is running");
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println(name1 + " step " + i);
                    Thread.sleep(1000); // pause for 1 second
                }
            } catch (InterruptedException e) {
                System.out.println(name1 + " was interrupted!");
            }
            System.out.println(name1 + " finished.");
        }

        public static void main(String[] args) {
            SleepExample t1 = new SleepExample("Thread-122");
            SleepExample t2 = new SleepExample("Thread-222");

            t1.start();
            t2.start();
        }
    }

