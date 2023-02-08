package tester.collectionPratice;

import java.util.Comparator;

public class ResultComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.getMarks()!=b.getMarks())
        {
            return (int)(a.getMarks()-b.getMarks());
        }
        else {
            return b.getName().compareTo(a.getName());
        }
    }
}
