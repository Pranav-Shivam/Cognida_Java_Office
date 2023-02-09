package tester.threadinPratice;

public class ThreadProducer extends Thread{
    ThreadCompany c;
    ThreadProducer(ThreadCompany c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            try {
                this.c.produce_item(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}
