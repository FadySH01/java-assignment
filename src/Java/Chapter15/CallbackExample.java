package Java.Chapter15;

public class CallbackExample {
    public static void main(String[] args) {
        System.out.println("Requesting date...");

        fetchData(result -> {
            System.out.println("Event Triggered:" + result);
        });

        System.out.println("Main thread continues...");
    }
    static void fetchData(DataListener listener){
        new Thread(() -> {
            try{Thread.sleep(2000);
            } catch (InterruptedException e) {}
            listener.onData("Data arrived successfully");
            }).start();
        }

        interface DataListener{
        void onData(String data);
    }
}
