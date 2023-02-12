package tester.fileHandling;

import java.io.*;

public class FileCreatedWithFolder {
    public static void main(String[] args) throws IOException {
        File dir=new File("C:\\Extra\\newFolder");
        dir.mkdirs();
        System.out.println("Directory is being created ");
        File file=new File("C:\\Extra\\newFolder\\test.txt");
        file.createNewFile();
        System.out.println("File is created");
    }
}
