package tester.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromTheFile {
    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("C:\\Extra\\newFolder\\Third.txt"));
            System.out.println("Reading from the file");
            System.out.println("*********************************");
            String content;
            while ((content= br.readLine())!=null)
            {
                System.out.println(content);
            }
            br.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch (IOException e)
        {
            System.out.println("Error Occurred! while creating a file");
        }
    }
}
