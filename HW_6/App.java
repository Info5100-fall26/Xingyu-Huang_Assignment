package edu.neu.mgen;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int x=10,y=25;
        int maxValue=Math.max(x,y);
        int minValue=Math.min(x,y);
        double sqrtX=Math.sqrt(x);
        double sqrtY=Math.sqrt(y);
        // System.out.println("max value between x and y is:"+maxValue
        // +"\nmin value between x and y is:"+minValue
        // +"\nthe square root of x is:"+sqrtX
        // +"\nthe square root of y is:"+sqrtY);//another approach
        System.out.println("max value between x and y is:"+maxValue);
        System.out.println("min value between x and y is:"+minValue);
        System.out.println("the square root of x is:"+sqrtX);
        System.out.println("the square root of y is:"+sqrtY);
        // other math calculations,like ... x to the power of 3
        double powResult=Math.pow(x,3);
        System.out.println(powResult);
        // absolute result like ... |-x|
        int absResult=Math.abs(-x);
        // System.out.println(-x);
        System.out.println(absResult);
        // random number between 0~1
        double randomNumber=Math.random();
        System.out.println(randomNumber);
        // random number between x~y
        double randomInRange=x+(randomNumber*(y-x));
        System.out.println(randomInRange);
        // the second part
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any word:");
        long startTime = System.currentTimeMillis();
        // System.out.println(startTime);
        String word = scanner.nextLine();
        long endTime = System.currentTimeMillis();
        double passedSeconds=(endTime-startTime)/1000.0;//use 1000.0 instead of 1000 to keep the decimal part during division
        // System.out.println(passedSeconds);
        if (word.isEmpty()) {
            System.out.println("You entered an empty line. Please reenter");
        } 
        else {
            int length = word.length();
            String category;
            if (length<=5) {
                category = "short";
            } else if (length <= 10) {
                category="medium";
            } else {
                category = "long";
            }
            System.out.println("Your word is "+word);
            System.out.println("It is a " +category+" word");
            System.out.println("The length of the word is " + length);
            System.out.println("Your reaction time is " +passedSeconds+" seconds");
        }
        scanner.close();
    }
}



