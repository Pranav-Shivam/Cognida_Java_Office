package tester.threadinPratice;

import tester.demo.Main;

public class UseIsAliveMethods extends Thread {
    public static int amount=100;

    public static void main(String[] args) {
        System.out.println("Starting the thread ");
        UseIsAliveMethods t=new UseIsAliveMethods();
        t.start();
        while (t.isAlive())
        {
            System.out.println("Waiting ....");
        }
        System.out.println("Amount is "+amount);
        amount++;
        System.out.println("Amount is "+amount);
        System.out.println("Terminating the tread ");
    }
    @Override
    public void run()
    {
        amount++;
    }
}
