package tester.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
//        RBI obj=new RBI();
//        System.out.println(obj.interest());

        //overriding concept
        RBI in=new SBI();
        System.out.println(in.interest());

        RBI pn=new PNB();
        System.out.println(pn.interest());


    }
}
class RBI
{
    public int interest()
    {
        System.out.print("The RBI interest is : ");
        return 5;
    }
}
class SBI extends RBI
{
    public int interest()
    {
        System.out.print("The SBI interest is : ");
        return 7;
    }
}

class PNB extends RBI
{
    public int interest()
    {
        System.out.print("The PNB interest is : ");
        return 6;
    }
}