package demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	     String word=sc.nextLine();
	     String rev="";
	     for(int i = word.length()-1;i>=0;i--) {
	         rev+=word.charAt(i);
	         System.out.println(i);
	     }
	     System.out.println("reverse "+rev);
	     
	 }
	 
	}