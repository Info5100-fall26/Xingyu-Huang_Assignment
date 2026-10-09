package edu.neu.mgen;
public class App {
    static String[] names={"Anne","John","Alex","Jessica"};
    static String[] planets={"Sun","Mercury","Venis","Earth","Mars","Jupiter"};
    public static void main(String[] args) {
        String[] result1=reverseArray(names);
        printResult(names,result1);
        System.out.println();
        String[] result2 = reverseArray(planets);
        printResult(planets,result2);
    }
    public static String[] reverseArray(String[] arr) {
        String[] result=new String[arr.length];
        for (int i=0;i<arr.length;i++) {
            String word=arr[arr.length-1-i];
            String reversed="";
            for (int j=word.length()-1;j>=0;j--) {
                reversed+=word.charAt(j);
            }
            reversed=reversed.substring(0, 1).toUpperCase()
                    +reversed.substring(1).toLowerCase();
            result[i]=reversed;
        }
        return result;
    }
    public static void printResult(String[] original, String[] result) {
        System.out.println("Original array:");
        System.out.println();
        for (int i=0;i<original.length;i++) {
            System.out.println("“"+original[i]+"”");
        }
        System.out.println("End of the array");
        System.out.println();
        System.out.println("=========");
        System.out.println();
        System.out.println("Resultant array:");
        System.out.println();
        for (int i=0;i<result.length;i++) {
            System.out.println("“"+result[i]+"”");
        }
        System.out.println("End of the array");
    }
}
