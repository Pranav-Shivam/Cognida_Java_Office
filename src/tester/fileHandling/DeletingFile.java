package tester.fileHandling;

import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        File file = new File("C:\\Extra\\newFolder\\test.txt");
        if (file.delete()) {
            System.out.println("Deletion successfully");
        } else {
            System.out.println("Error occurred");
        }
    }
}
