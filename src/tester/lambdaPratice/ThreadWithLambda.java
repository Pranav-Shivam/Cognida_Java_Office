package tester.lambdaPratice;

public class ThreadWithLambda {
    public static void main(String[] args) {
        Runnable t1=()->{
            for (int i = 1;i<10; i++) {
                System.out.println("Thread 1 is running ->>> " + i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t11=new Thread(t1);
        t11.setName("Pranav");
        System.out.println("Thread ID : "+t11.threadId()+"  Thread name : "+t11.getName());
        t11.start();


        //Creating another thread
        Runnable t2=()->{
            char i='A';
            while (i<='J')
            {
                System.out.println("Thread 2 is running >>  "+i);
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                i++;
            }
        };
        Thread t22=new Thread(t2);
        t22.setName("Shivam");
        System.out.println("Thread ID : "+t22.threadId()+ "   Thread name : "+ t22.getName());
        t22.start();
    }
}
