package demo1;

import java.util.ArrayList;

public class BikeOperation {

	public static void main(String[] args) {
		ArrayList<BikeList> b=new ArrayList<> ();
		BikeList b1=new BikeList();
		b1.setbName("Ktm");
		b1.setbBrand("Tvs");
		b1.setbPrice(100000);
		b.add(b1);
		BikeList b2=new BikeList("TVS","Spender",1400000);
		b.add(b2);
		System.out.println("My array list"+b);
		BikeList b3=new BikeList("Ns","pluser",109765);
		b.set(0, b3);
		System.out.println("My array List"+b);

	}

}
