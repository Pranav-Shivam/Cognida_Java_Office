package tester.threadinPratice;

public class ThreadOps {
    public static void main(String[] args) {
        System.out.println("Program Started :) ");
        int x=10,y=20;
        System.out.println("The sum is : "+(x+y));
        Thread t=Thread.currentThread();
        String tName=t.getName();
        System.out.println("Current processing thread is : "+tName);
        t.setName("Ram");
        System.out.println("Current processing thread is : "+t.getName());
        System.out.println("Program Terminated ): ");
    }
}
