import java.util.ArrayList;
public class Lab1Part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Anne");
        names.add("John");
        names.add("Alex");
        names.add("Jessica");
        names.add("Michael");
        ArrayList<String> switched = new ArrayList<String>();
        for (int i = 0; i < names.size(); i++) {
            switched.add(switchFirstLast(names.get(i)));
        }
        System.out.println("Names = " + format(names));
        System.out.println();
        System.out.println("Names (switched) = " + format(switched));
    }
    public static String switchFirstLast(String name) {
        if (name == null || name.length() < 2) {
            return name;
        }
        String swapped = name.charAt(name.length() - 1)
                + name.substring(1, name.length() - 1)
                + name.charAt(0);
        return Character.toUpperCase(swapped.charAt(0))
                + swapped.substring(1).toLowerCase();
    }
    public static String format(ArrayList<String> list) {
        String result = "{ ";
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                result += ", ";
            }
            result += list.get(i);
        }
        result += " }";
        return result;
    }
}
