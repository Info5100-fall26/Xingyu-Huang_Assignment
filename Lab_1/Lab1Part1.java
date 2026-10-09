package edu.neu.mgen;
public class Lab1Part1 {
    public static void main(String[] args) {
        int[] x={4,9,2,7,5};
        int[] y={6,3,8,1,7};
        int[] z=new int[5];
        for (int i=0;i<5;i++) {
            if (x[i]>y[i]) {
                z[i]=x[i];
            } else {
                z[i]=y[i];
            }
        }
        System.out.println("Array x = "+arrayToString(x));
        System.out.println();
        System.out.println("Array y = "+arrayToString(y));
        System.out.println();
        System.out.println("Array z = x + y = "+arrayToString(z));
    }
    public static String arrayToString(int[] a) {
        String s="{ ";
        for (int i=0;i<a.length;i++) {
            s+=a[i];
            if (i!=a.length-1) {
                s+=", ";
            }
        }
        s+=" }";
        return s;
    }
}
