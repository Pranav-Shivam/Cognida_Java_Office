package tester.fileHandling;
import java.io.*;
public class FileCreations {
    public static void main(String[] args) throws IOException{
//        File file=new File("First.txt");
//        file.createNewFile();
//
//        File file=new File("Second.txt");
//        file.createNewFile();
//        System.out.println("File Created");

        //We can also give the file path creation
        File file=new File("src/Third.txt");
        file.createNewFile();
        System.out.println("New File Created");

    }
}
