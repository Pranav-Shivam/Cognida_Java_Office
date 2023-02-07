package tester.interfacePratice;
import java.awt.desktop.SystemEventListener;
import java.util.*;


interface clientA
{
    void input();
    void output();
}
class Domain implements clientA{
    Scanner sc=new Scanner(System.in);
    String name;
    double salary;

    public void input()
    {
        System.out.println("Enter any name : ");
        name=sc.nextLine();
        System.out.println("Enter " + name +"'s salary: ");
        salary=sc.nextDouble();
    }
    public void output()
    {
        System.out.println("Name is : "+name);
        System.out.println("Salary is : "+salary);
    }
}
public class Raju
{
    public static void main(String[] args) {
        Domain d=new Domain();
        d.input();
        d.output();
    }
}
