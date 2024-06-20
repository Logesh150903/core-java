package demo;

import java.util.Scanner;

public class forloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j ;
		char ch='z';
        for(i=0;i<=5;i++) {
            for(j=0;j<5-i;j++)
            {
                System.out.print("  ");
            }
            for(j=0;j<i;j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
            }
	}

}



