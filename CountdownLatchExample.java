import java.util.concurrent.CountDownLatch;

public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        Runnable task = () -> {
            System.out.println("Thread is running.");
            latch.countDown();
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

        latch.await(); // Wait for all threads to finish

        System.out.println("All threads have completed.");
    }
}

