package Java.Chapter08;

public class RunnableDemo2 extends Thread{
    private String threadName;
    RunnableDemo2(String name){
        threadName = name;
        System.out.println("Thread:" + threadName + "," + "State:New");
    }

    public void run(){
        System.out.println("Thread: " +  threadName + "," + "State: Running");
        for (int i = 4; i >0 ; i--) {
            System.out.println("Thread: " + threadName + "," + i);
        }
        System.out.println("Thread: " + threadName + ", " + "State: Dead");
    }
}

class TestThread2 {
    public static void main(String[] args) {
        RunnableDemo2 R1 = new RunnableDemo2("Thread-1");
        RunnableDemo2 R2 = new RunnableDemo2("Thread-2");
        R1.start();
        R2.start();
    }
}
