package tester.threadinPratice;

class ThreadPrintDemo
{
    public void printCount()
    {
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println("Counter ---- >> "+i);
            }
        }
        catch (Exception e)
        {
            System.out.println("Thread Interrupted");
        }
    }
}
class ThreadSyncDemo extends Thread
{
    private Thread t;
    private String threadName;
    ThreadPrintDemo PD;

    public ThreadSyncDemo( String threadName, ThreadPrintDemo PD) {
        this.threadName = threadName;
        this.PD = PD;
    }
    @Override
    public void run()
    {
        synchronized (PD)
        {
            PD.printCount();
        }
        System.out.println("Thread "+threadName+" exiting");
    }
    @Override
    public void start()
    {
        System.out.println("Starting "+threadName);
        if (t == null) {
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
public class ThreadSynchronization {
    public static void main(String[] args) {
        ThreadPrintDemo PD=new ThreadPrintDemo();
        ThreadSyncDemo t1=new ThreadSyncDemo("Thread - 1",PD);
        ThreadSyncDemo t2=new ThreadSyncDemo("Thread - 2",PD);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (Exception e)
        {
            System.out.println("Interrupted");
        }
    }

}
