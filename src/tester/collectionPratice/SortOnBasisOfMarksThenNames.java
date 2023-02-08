package tester.collectionPratice;

import java.util.*;

public class SortOnBasisOfMarksThenNames {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Pranav",2618,99,"Banka"));
        list.add(new Student("Chandan",2648,98,"Patna"));
        list.add(new Student("Manish",2639,96,"Banaras"));
        list.add(new Student("JaiDeep",2838,98,"Chandigarh"));
        list.add(new Student("Kritik",2836,98,"Lucknow"));

        Collections.sort(list,new ResultComparator());
        Collections.reverse(list);
        new SortOnBasisOfMarksThenNames().printResult(list);
//        System.out.println(list);
    }
    public void printResult(ArrayList<Student> list)
    {
        for (Student x:list)
        {
            System.out.print(x.getRollNo()+"  "+x.getName()+"  "+x.getMarks()+"  "+x.getCity());
            System.out.println("\n");
        }
    }
}
