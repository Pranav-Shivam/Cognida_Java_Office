package tester.fileHandling;

import java.io.*;

public class WritingIntoFile {
    public static void main(String[] args) {
        File dir = new File("C:\\Extra\\newFolder");
        dir.mkdir();
        File file = new File("C:\\Extra\\newFolder\\first.txt");
        try {
            file.createNewFile();
            System.out.println("File created successfully :)");
        } catch (IOException e) {
            System.out.println("Problem Occurred! while creating a file");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Pranav");
            bw.newLine();
            bw.write("Shivam");
            bw.newLine();
            bw.write("Singh");
            bw.newLine();
            bw.write("Tomar");
            bw.newLine();
            bw.write("Prem");
            bw.newLine();
            bw.write("Harsh");
            bw.newLine();
            System.out.println("Writing into a file completed successfully :)");
        } catch (IOException e) {
            System.out.println("Problem Occurred! while write into a file");
        }
    }
}
