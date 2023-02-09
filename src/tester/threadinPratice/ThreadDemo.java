package tester.threadinPratice;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("First Thread : >> " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        Thread thr = new Thread(t1);
        ThreadDemo2 t2 = new ThreadDemo2();
        thr.start();
        t2.start();
    }
}
