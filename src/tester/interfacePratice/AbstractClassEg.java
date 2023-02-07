package tester.interfacePratice;

abstract class Bike
{
    Bike()
    {
        System.out.println("Bike is created : ");
    }
    abstract void run();
    void gearChange()
    {
        System.out.println("Gear is changed : ");
    }

}
class Honda extends Bike
{
    public void run()
    {
        System.out.println("Running safely");
    }
}
public class AbstractClassEg
{
    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
        obj.gearChange();
    }
}
