
// Q.2) Write a java program to create using Runnable interface
// to display traffic signal.

class TrafficSignal implements Runnable {

    public void run() {
        try {
            System.out.println("RED - STOP");
            Thread.sleep(2000);

            System.out.println("YELLOW - WAIT");
            Thread.sleep(2000);

            System.out.println("GREEN - GO");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Slip15Q2 {
    public static void main(String[] args) {

        TrafficSignal obj = new TrafficSignal();

        Thread t = new Thread(obj);

        t.start();
    }
}
