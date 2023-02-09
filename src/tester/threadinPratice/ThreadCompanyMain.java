package tester.threadinPratice;

public class ThreadCompanyMain {
    public static void main(String[] args) {
        ThreadCompany comp=new ThreadCompany();
        ThreadProducer p=new ThreadProducer(comp);
        ThreadConsumer c=new ThreadConsumer(comp);
        p.start();
        c.start();

    }
}
