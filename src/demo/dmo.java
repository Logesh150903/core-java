package demo;

import java.util.Scanner;

public class dmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one = 100;
		int two = 50;
		int add,sub,mul,div,mod;
		add=one+two;
		sub=one-two;
		mul=one*two;
		div=one/two;
		mod=one%two;
		System.out.println("addition :"+add);
		System.out.println("subatraction:"+sub);
		System.out.println("mul:"+mul);
		System.out.println("divions:"+div);
		System.out.println("mod:"+mod);
		
		boolean result;
		result=(one==two);
		System.out.println("Equl to :"+result);
		result=(one!=two);
		System.out.println("Not Equl to :"+result);
		result=(one>two);
		System.out.println("Greater than :"+result);
		result=(one<two);
		System.out.println("Less than :"+result);
		result=(one>=two);
		System.out.println("Greater than Equl to :"+result);
		result=(one<=two);
		System.out.println("Less than Equl to :"+result);
		
		
		double percent =80.00;
		double science = 60.00;
		
		boolean admission=(percent>=70.00)||(science>=70.00);
		System.out.println("admission : "+admission);
		admission=(percent>=70.00)&&(science>=70.00);
		System.out.println("admission : "+admission);
		
		boolean demo = true;
		System.out.println("negation : "+!demo);
		
		int a=12;
        int b=12;
        int res1,res2;
        System.out.println(a);//12
        res1=++a;//Pre Increment 1+a
        System.out.println(res1);//1+12=13
     res2=b++;//b+1,print 12
        System.out.println(res2);//12
        int res3=b++;//13
        
        System.out.println(res3);//13
        int res4=++b;//1+1b,print 15
        System.out.println(res4);
        int res5=a--;//13-1=12,for post increment value will print first then only decrement will happen,so will get 13
        System.out.println(res5);
        int res6=--a;//1-12=11,pre increment 1 will be substract from value first then only print so we will get 11
        System.out.println(res6);
        System.out.println(~res6);
        System.out.println("enter the value: ");
        Scanner obj=new Scanner(System.in); 
        int num=obj.nextInt(); 
        
        while(num!=0)
        {
        int r=num%10;//567%10=7,56%10=6,5%10=5 
        System.out.println(r+" ");//print 7,6,5 
        num=num/10;//567/10=56,56/10=5,5/10=0

        }
        System.out.println("enter the value: ");
        int x=obj.nextInt();
        while(x<10)
        {
        	System.out.println(x);
        	x++;
        }
        System.out.println("enter the value: ");
        int y=obj.nextInt();
        do {
        	System.out.println(y);
        	y++;
        }while(y<5);
              
	}

}
