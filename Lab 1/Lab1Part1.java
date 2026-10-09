public class Lab1Part1 {

    public static void main(String[] args) {
        int[] x = {4, 9, 2, 7, 5};
        int[] y = {6, 3, 8, 1, 7};

        // z[i] is the larger of x[i] and y[i].
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            if (x[i] >= y[i]) {
                z[i] = x[i];
            } else {
                z[i] = y[i];
            }
        }

        System.out.println("Array x = " + format(x));
        System.out.println();
        System.out.println("Array y = " + format(y));
        System.out.println();
        System.out.println("Array z = x + y = " + format(z));
    }

    // Prints an int array in the form { 4, 9, 2, 7, 5 }.
    public static String format(int[] array) {
        String result = "{ ";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
        }
        result += " }";
        return result;
    }
}