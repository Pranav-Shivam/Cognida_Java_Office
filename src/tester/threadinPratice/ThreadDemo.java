package tester.threadinPratice;

public class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo();
        Thread thr=new Thread(t1);
        thr.start();
    }
}
