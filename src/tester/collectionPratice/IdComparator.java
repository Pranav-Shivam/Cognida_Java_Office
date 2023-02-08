package tester.collectionPratice;

import java.util.Comparator;

public class IdComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getRollNo()- o2.getRollNo();
    }
}
