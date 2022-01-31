package com.core.test;

public class MultiBuilder {

    private static int[][] matrix;
    private static int num = 0;

    public static void createMatrix(int length){
        matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            MultCore myThread = new MultCore();
            myThread.start();
        }
    }

    public static void fillMatrix(){


            for (int i = 0; i < matrix.length; i++) {
                matrix[num][i] = i;
            }
            num++;
        if (num == matrix.length){
            showResult();
        }
    }

    public static void showResult(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println("\n");
        }
    }
}
