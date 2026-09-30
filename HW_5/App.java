package edu.neu.mgen;
import java.util.ArrayList;
import java.util.Arrays;//another approach
public class App 
{
    public static void main( String[] args )
    {
        //String
        String str = "Oakland";
        System.out.println("Length of 'Oakland' is:"+str.length());
        System.out.println(str.charAt(2)); 
        //System.out.println(str.substring(3,7)); //another approach
        System.out.println(str.substring(3));
        System.out.println(str.toUpperCase());
        //Array int
        int[] abc = {1,3,5,2,5};
        System.out.println("Length of 'abc' is:"+abc.length);
        System.out.println(abc[abc.length-1]);
        //System.out.println(abc[4]);// if I know the total number of elements
        //ArrayList String
        ArrayList<String> cities = new ArrayList<>();
        // ArrayList<String> cities=new ArrayList<>(Arrays.asList("Austin","San Francisco","Seattle","Houston","Oakland","Paris")); //another approach
        cities.add("Austin");
        cities.add("San Francisco");
        cities.add("Seattle");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        System.out.println(cities);
        cities.remove("Paris");
        System.out.println(cities);
    }
}
