package demo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int num,fact=1,fact1=1,fact2=1;
		num=sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+num+" is: "+fact);
		int num1=num;
		while(num1>0) {
			 fact1=fact1*num1;
			num1--;
		}
		System.out.println("Factorial of "+num+" is: "+fact1);
//		int num2=num;
//		do {
//			fact2=fact2*num2;
//			num2--;
//		}while(num2>0);
//		System.out.println("Factorial of "+num+" is: "+fact2);
//	
		     int lastd=0,rev = 0;
		        System.out.println("Enter any number : ");
		        int num3 = sc.nextInt();
		        
		        while(num3>0)
		        {
		            lastd=num3%10;
		            rev=rev*10+lastd;
		            num3=num3/10;
		        }
		        System.out.println("Reverse number is : "+rev);
	}

}
