package tester.interfacePratice;

interface Ax
{
     void show();
}
interface Bx
{
    void show();
}
interface Cx
{
    void display();
}

class TestMultipleInheritance implements Ax,Bx,Cx
{
    @Override
    public void show()
    {
        System.out.println("Multiple Inheritance");
    }
    @Override
    public void display()
    {
        System.out.println("Other than overriding methods");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        TestMultipleInheritance m=new TestMultipleInheritance();
        m.display();
        m.show();
    }
}
