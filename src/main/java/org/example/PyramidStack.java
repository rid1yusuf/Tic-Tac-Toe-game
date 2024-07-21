package org.example;

public class PyramidStack {
    public static void pyramidStack(){
        int row = 6;
        for(int i = 0; i < row; i++) {
            for (int j = row - i - 1; j >= 1; j--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
