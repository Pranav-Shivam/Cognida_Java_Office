package tester.threadinPratice;

public class ThreadDemo2 extends Thread {
    @Override
    public void run() {
        for (char x = 'A'; x <= 'J'; x++) {
            System.out.println("Another Thread : >> " + x);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
