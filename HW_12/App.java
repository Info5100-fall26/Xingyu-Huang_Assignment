package edu.neu.mgen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class App {
    public static void main(String[] args) {
        try {
            File myObj = new File("my_test_file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();
        try {
            FileWriter myWriter = new FileWriter("my_test_file.txt");
            myWriter.write(phrase);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
