package tester.interfacePratice;
interface A
{
    void a1();
    void a2();
    default void a3()
    {
        System.out.println("A's a3()");
    }
    static void a4()
    {
        System.out.println("Can't override interface static methods ");
    }
}
class B implements A
{
    @Override
    public void a1()
    {
        System.out.println("B' a1()");
    }
    @Override
    public void a2()
    {
        System.out.println("B' a2()");
    }
}
class C implements A
{
    @Override
    public void a1()
    {
        System.out.println("C' a1()");
    }
    @Override
    public void a2()
    {
        System.out.println("C' a2()");
    }
}
class D implements A
{
    @Override
    public void a1()
    {
        System.out.println("D' a1()");
    }
    @Override
    public void a2()
    {
        System.out.println("D' a2()");
    }
    @Override
    public void a3()
    {
        System.out.println("D' a3()");
    }
}

public class InterfaceInJava_8 {
    public static void main(String[] args) {
        //method of interface is called because a4() is a static method
        A.a4();


        B b=new B();
        C c=new C();
        D d=new D();

        b.a1();
        b.a2();
        b.a3();
        c.a1();
        c.a2();
        c.a3();
        d.a1();
        d.a2();
        d.a3();
    }
}
