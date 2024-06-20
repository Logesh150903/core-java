package threadprogram;
class Thread1 extends Thread{
	public void run()  {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
	}
}
class Even extends Thread{
	int num;
	public Even(int num) {
		this.num=num;
	}
	public void run() {
		if(num%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
	}
}
class factorial extends Thread{
	int num;
	int fact=1;
	public factorial(int num) {
		this.num=num;
	}
	public void run() {
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
public class ThreadUingInheritance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		t.start();
		Even e = new Even(24);
		e.start();
		factorial f=new factorial(5);
		f.start();
	}

}
