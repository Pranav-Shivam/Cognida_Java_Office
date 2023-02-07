package tester.polymorphism;

public class Poly {
    public static void main(String[] args)
    {
        add();
        add(10);
        add(10,20);
    }
    public static void add()
    {
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
    public static void add(int x)
    {
        int sum=x+10;
        System.out.println("Sum ="+sum);
    }
    public static void add(int x,int y)
    {
        int sum=x+y;
        System.out.println("Sum = "+sum);
    }
}
