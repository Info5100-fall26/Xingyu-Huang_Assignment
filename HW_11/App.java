package edu.neu.mgen;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            try {
                int number=sc.nextInt();
                System.out.println("You entered: "+number);
                break;
            } catch (Exception e) {
                System.out.println("Wrong input. Please try again.");
                sc.nextLine();
            }
        }
    }
}