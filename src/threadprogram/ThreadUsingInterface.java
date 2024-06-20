package threadprogram;
class Thread11 implements Runnable{
    @Override
    public void run() {
        for(int i=5;i<=10;i++) {
            System.out.println(i);
        }
    }
}
class ThreadEven implements Runnable{
	int num;
	public ThreadEven(int num) {
		this.num=num;
	}
	@Override
	public void run() {
		if(num%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}

		
	}
	
}
public class ThreadUsingInterface {
    public static void main(String[] args) {
        Thread11 t1=new Thread11();
        Thread t=new Thread(t1);
        t.start();
        ThreadEven e=new ThreadEven(22);
        Thread t11=new Thread(e);
        t11.start();
    }
}