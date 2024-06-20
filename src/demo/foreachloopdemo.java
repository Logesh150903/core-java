package demo;

public class foreachloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,30,40,50};
		int sum=0;
		for(int n:a)
		{
			System.out.println(n);
			sum=sum+n;
		}
		System.out.println(sum);
		
		String[]b={"Apple","Banana","Pear"};
		
		for(String m:b)
		{
			System.out.println(m);
		}
	}
}
