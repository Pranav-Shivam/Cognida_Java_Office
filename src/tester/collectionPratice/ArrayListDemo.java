package tester.collectionPratice;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(Integer.valueOf(2));// boxing
        System.out.println(list.get(0).intValue());// unboxing
        System.out.println(list);
    }
}
