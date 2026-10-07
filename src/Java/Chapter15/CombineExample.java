package Java.Chapter15;
import java.util.concurrent.CompletableFuture;

public class CombineExample {
    public static void main(String[] args) {
        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() ->{
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e) {}
            return "User data";
        });

        CompletableFuture<String> OrderFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            return "Order history";
        });

        CompletableFuture<Void> combined = CompletableFuture.allOf(userFuture, OrderFuture);

        combined.thenRun(() ->{
            try {
                String user = userFuture.get();
                String orders = OrderFuture.get();
                System.out.println("Combined Result ->" + "+" + orders);
            }catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("Main thread is doing other work... ");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {}
    }
}