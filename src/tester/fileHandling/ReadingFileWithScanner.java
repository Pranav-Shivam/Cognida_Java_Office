package tester.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileWithScanner {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(new File("C:\\Extra\\newFolder\\Third.txt"));
            String content;
            while (sc.hasNext())
            {
                content= sc.nextLine();
                System.out.println(content);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
    }
}
