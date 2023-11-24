import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 2;

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            System.out.println("Producing " + item);
            buffer.add(item);
            notify();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            int item = buffer.removeFirst();
            System.out.println("Consuming " + item);
            notify();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        final Buffer buffer = new Buffer();

        Thread producerThread = new Thread(() -> {
            try {
                int item = 1;
                while (true) {
                    buffer.produce(item++);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

