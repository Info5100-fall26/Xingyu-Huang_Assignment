package edu.neu.mgen;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A={{2,3,4},{3,4,5}};
        int[][] B={{1,2},{3,4},{5,6}};
        if (A[0].length!=B.length) {
            System.out.println("These two matrices cannot be multiplied.");
            return;
        }
        int[][] result=new int[A.length][B[0].length];
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<B[0].length;j++) {
                int sum=0;
                for (int k=0;k<A[0].length;k++) {
                    sum+=A[i][k]*B[k][j];
                }
                result[i][j]=sum;
            }
        }
        System.out.println("A * B = ");
        for (int i=0;i<result.length;i++) {
            for (int j=0;j<result[0].length;j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
