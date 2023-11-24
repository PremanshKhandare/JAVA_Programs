public class TrafficLightProblem {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        Thread carThread = new Thread(() -> {
            while (true) {
                trafficLight.waitForGreen();
                System.out.println("Car is crossing the intersection.");
            }
        });

        Thread trafficLightThread = new Thread(() -> {
            while (true) {
                trafficLight.setRed();
                System.out.println("Traffic light is RED.");
                try {
                    Thread.sleep(3000); // Red light for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                trafficLight.setGreen();
                System.out.println("Traffic light is GREEN.");
                try {
                    Thread.sleep(2000); // Green light for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        carThread.start();
        trafficLightThread.start();
    }
}

class TrafficLight {
    private boolean isGreen = false;

    public synchronized void waitForGreen() {
        while (!isGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void setRed() {
        isGreen = false;
        notifyAll();
    }

    public synchronized void setGreen() {
        isGreen = true;
        notifyAll();
    }
}


