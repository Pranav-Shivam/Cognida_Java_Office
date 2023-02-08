package tester.collectionPratice;

import java.util.ArrayList;
import java.util.Collections;

public class LearnComparator {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1("Ram",0001,99.99,"Ayodhya"));
        list.add(new Student1("Krishna",0002,96.99,"Delhi"));
        list.add(new Student1("Shiva",0003,100.00,"Kailash"));
        System.out.println(list);
        //Comparable is working here
//        Collections.sort(list,new IdComparator());
//        System.out.println(list);
        Collections.sort(list,new NameComparator());
        System.out.println(list);

    }
}
class Student1
{
    private String name;
    private int rollNo;
    private double marks;
    private String city;

    public Student1(String name, int rollNo, double marks, String city) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                ", city='" + city + '\'' +
                '}';
    }
}
