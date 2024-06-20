package demo1;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int u=36*1000/3600;
		int a=5;
		Scanner s=new Scanner(System.in);
//		System.out.println("enter the time 1");
		int t1=s.nextInt();
//		System.out.println("enter the time 2");
		int t2=s.nextInt();
		int d=u*t1+((a*t1*t1)/2);
		int d2=u*t2+((a*t2*t2)/2);
		System.out.println(d);
		System.out.println(d2);

	}

}
