package demo;

import java.util.Scanner;

public class ForLoopStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j ;
		System.out.println("Enter any number : ");
		Scanner s = new Scanner(System.in);
		int ch=s.nextInt();
        for(i=0;i<=ch;i++) {
//            System.out.println(i);
            for(j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            }
	}

}
