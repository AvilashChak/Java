package myJavaPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practice_file {
    public static void main(String[] args) {
        // Code to create a new file
        /*File myFile = new File("file.txt");
        try {
            myFile.createNewFile();
            System.out.println("This file has been created!");
        } catch (IOException e) {
            System.out.println("Couldn't create this file!");
            throw new RuntimeException(e);
        }*/

        // Code to write to a file
        /*try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is my first file in this Java course\ncatch you later");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // Reading a file
        /*File myFile = new File("this.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        // Deleting a file
        File myfile = new File("this.txt");
        if(myfile.delete()) {
            System.out.println("This file have been deleted: " + myfile.getName());
        } else {
            System.out.println("Error occurred while deleting the file: " + myfile.getName());
        }
    }
}
