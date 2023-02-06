package tester.classPratice;

import java.util.Date;

public class Car{

    public static void main(String[] args) {
        info();
    }
    public static void info()
    {
        Date dt=new Date();
        InfoGetterSetter obj=new InfoGetterSetter("closed","started","belted","Shree Ram",15.78f,"Life","Human",dt,0,2,3);
        //obj.setValue("Land Rover","Range Rover",dt,23900000.00d,4,317494,"opened","off","absent",0.0f);
        obj.getValue();
        System.out.println("Car is running : " +obj.isRunning() );
    }
}
