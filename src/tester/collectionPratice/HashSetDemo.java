package tester.collectionPratice;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args)
    {
        //create a HashSet to store Strings
        HashSet<String> hs = new HashSet<String>();
        //Store some String elements
        hs.add("Anil");
        hs.add("Akshara");
        hs.add("Babji");
        hs.add("Charan");
        hs.add("Raman");

        //view the HashSet
        System.out.println("HashSet = " + hs);
        //add an Iterator to hs
        Iterator<String> it = hs.iterator();
        //display element by element using Iterator
        System.out.println("Elements Using Iterator: ");
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        demo2();
    }
    public static void demo2(){
        HashSet<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        for(String str:set)
        {
            System.out.println(str);
        }
    }
}

