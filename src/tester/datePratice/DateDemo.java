package tester.datePratice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date dt=new Date();
        System.out.println(dt.toString());
        SimpleDateFormat sDF=new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date : "+ sDF.format(dt));
    }
}
