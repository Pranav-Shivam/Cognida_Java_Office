package tester.interfacePratice;
// there two ways for getting interface's private in the main class either we can use
//  1. default method :- call the private methods
//  2. static method  :-make the private method static and then call that private methods
interface x
{
    default void display()
    {
        sum(10,17);
    }
    private void sum(int a,int b)
    {
        System.out.println("The sum of the a and b :: "+(a+b));
    }
}
interface z
{
    static void display()
    {
        sum(10,17);
    }
    static private void sum(int a,int b)
    {
        System.out.println("The sum of the a and b :: "+(a+b));
    }
}
class y implements x
{
    public void sub(int a,int b)
    {
        System.out.println("The sub of the a and b :: "+(a-b));
    }
}
public class InterfaceInJava_9 {
    public static void main(String[] args)
    {
        //interface z is using the static technique
        z.display();

        //interface x is using default technique
        x m=new y();
        m.display();

        y n=new y();
        n.sub(10,15);
    }
}
