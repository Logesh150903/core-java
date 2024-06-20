package demo;

import java.util.Scanner;

public class Pattern {
	 void printT(int n) {
		 int rowCount = 1;
	        for(int i=n;i>0;i--) {
	        	for(int j=1;j<i;j++) {
	        		System.out.print(" ");
	        	}
	            for(int j=1;j<=rowCount;j++) {
	                System.out.print(rowCount+" ");
	            }
	            
	            System.out.println();
	            rowCount++;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
		Pattern p=new Pattern();
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
        p.printT(n);
        
//        System.out.println("****");
        p.printT(n1);
//        System.out.println("****");
        p.printT(n2);
        

	}

}
