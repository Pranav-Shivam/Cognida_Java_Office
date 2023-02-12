package tester.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendingIntoFile {
    public static void main(String[] args) {
        File dir = new File("C:\\Extra\\newFolder");
        dir.mkdir();
        File file = new File("C:\\Extra\\newFolder\\Third.txt");
        try {
            file.createNewFile();
            System.out.println("File created successfully :)");
        } catch (IOException e) {
            System.out.println("Error Occurred! while creating a file");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Sun");
            bw.newLine();
            bw.write("Moon");
            bw.newLine();
            bw.write("Star");
            bw.newLine();
            bw.write("Orbit");
            bw.newLine();

            System.out.println("Writing into a file completed successfully :)");
        } catch (IOException e) {
            System.out.println("Problem Occurred! while write into a file");
        }
        appending(file);
    }

    public static void appending(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
            bw.write("Mercury");
            bw.newLine();
            bw.write("Venus");
            bw.newLine();
            bw.write("Earth");
            bw.newLine();
            bw.write("Mars");
            bw.newLine();
            bw.write("Jupiter");
            bw.newLine();
            bw.write("Saturn");
            bw.newLine();
            bw.write("Uranus");
            bw.newLine();
            bw.write("Neptune");
            bw.newLine();
            bw.write("Pluto");
            bw.newLine();
            System.out.println("Appending into a file completed successfully :)");
        } catch (IOException e) {
            System.out.println("Problem Occurred! while write into a file");
        }
    }
}


