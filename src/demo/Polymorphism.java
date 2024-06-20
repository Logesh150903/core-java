package demo;

public class Polymorphism {
	void area(int side) {
		int area=side*side;
		System.out.println("area of Square: "+area);
	}
	void area(int length,int base) {
		int area=length*base;
		System.out.println("area of Reactangle: "+area);
	}
	void area(float heigth,float base) {
		float area= 0.5f*heigth*base;
		System.out.println("area of trinagle: "+area);
	}
	void area(float radius) {
		float area= 3.14f*radius*radius;
		System.out.println("area ofcircle: "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p= new Polymorphism();
		p.area(4);
		p.area(4, 5);
		p.area(5.12f, 8.0f);
		p.area(8.5f);
	}

}
