package tester.threadinPratice;

public class ThreadVolatile {
    public static volatile int value;
    public static void main(String[] args) {

        Thread t1=new Thread(()->{
            int ct=value;
            while (ct<10)
            {
                if (ct != value) {
                    System.out.println("T[1] local counter changed ");
                    ct=value;
                }
            }
        });
        Thread t2=new Thread(()->{
            int ct=value;
            while (ct<10)
            {
                System.out.println("T[2] Incremented counter to "+ (ct+1));
                value=++ct;
               try {
                   Thread.sleep(500);
               }
               catch (InterruptedException e)
               {
                   e.printStackTrace();
               }
            }
        });
        t1.start();
        t2.start();
    }
}
