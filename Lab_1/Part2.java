package edu.neu.mgen;
import java.util.ArrayList;
public class Part2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Anne");
        names.add("John");
        names.add("Alex");
        names.add("Jessica");
        names.add("Michael");
        ArrayList<String> switched=new ArrayList<String>();
        for (int i=0;i<names.size();i++) {
            String name=names.get(i);
            String s=name.charAt(name.length()-1)
                    +name.substring(1,name.length()-1)
                    +name.charAt(0);
            s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
            switched.add(s);
        }
        System.out.println("Names = "+arrayToString(names));
        System.out.println();
        System.out.println("Names (switched) = "+arrayToString(switched));
    }
    public static String arrayToString(ArrayList<String> list) {
        String s="{ ";
        for (int i=0;i<list.size();i++) {
            s+=list.get(i);
            if (i!=list.size()-1) {
                s+=", ";
            }
        }
        s+=" }";
        return s;
    }
}
