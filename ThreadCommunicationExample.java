public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Message message = new Message();

        Thread producerThread = new Thread(() -> {
            String[] messages = {"Message 1", "Message 2", "Message 3"};
            for (String msg : messages) {
                message.produce(msg);
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                message.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized void produce(String msg) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        empty = false;
        notify();
    }

    public synchronized String consume() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String msg = message;
        empty = true;
        notify();
        System.out.println("Consumed: " + msg);
        return msg;
    }
}

