package Java.Chapter08.Thread;

    public class IsAliveExample extends Thread {

        private String name;

        public IsAliveExample(String name) {
            this.name = name;
            setName(name);
        }

        public void run() {
            try {

                System.out.println("Inside run(): isAlive = " + isAlive());

                System.out.println(name + " starts working...");
                for (int i = 1; i <= 3; i++) {
                    System.out.println(name + " step " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted!");
            }
            System.out.println(name + " finished.");
        }

        public static void main(String[] args) {
            IsAliveExample t1 = new IsAliveExample("Thread-1");
            t1.start();

            while (t1.isAlive()) {
                System.out.println(t1.getName() + " is still running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { }
            }

            System.out.println(t1.getName() + " has finished.");
        }
    }

