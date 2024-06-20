package demo;

public class While {

	public static void main(String[] args) {
		int n=123,sum=0;
		int m;
		
		while(n>0)    
		{    
		m=n%10;    
		sum=sum+m;    
		n=n/10;    
		}    
		System.out.println("Sum is : "+sum);  

				
	}

}
