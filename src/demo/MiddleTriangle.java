package demo;

import java.util.Scanner;

public class MiddleTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        for (int i = 1; i <= rows; i++) {        
            for ( int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}