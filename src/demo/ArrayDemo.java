package demo;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String fruits[]= {"Apple","Banana","Pear"};
	        System.out.println(fruits[2]);
	        for(int i=0;i<fruits.length;i++)
	        {
	            System.out.println(fruits[i]);    
	        }
	        int num[]=new int[5];
	        num[0]=5;
	        num[1]=51;
	        num[2]=15;
	        num[3]=40;
	        num[4]=32;
	        for(int i=0;i<5;i++)
	        {
	            System.out.println(num[i]);    
	        }
	        
}
}