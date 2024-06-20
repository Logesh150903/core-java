package demo;
abstract class Vehicle1{
    public Vehicle1() {
        System.out.println("Vehicle Constructor");
    }
    abstract void show();//abstract method->without body
    void vehicleBrand() {    //This is my non Abstract method 
        System.out.println("Non abstract method");
    }
    public static void display() {
        System.out.println("Static display method");
    }
    }
class Bike extends Vehicle1{
    @Override
    void show() {
        System.out.println("Bike class");
    }
}
class Car extends Vehicle1{
    @Override
    void show() {
        System.out.println("car");
    }
    
}
public class AbstractClassEx {
    public static void main(String[] args) {
//        Bike b=new Bike();
//        b.show();
//        b.vehicleBrand();
//        Vehicle1.display();
//        Vehicle1 v1=new Car();
//        v1.show();
        Car c=new Car();
        //c.show();
        Vehicle1 vref;//can not create object off abstract class only provide reference
        vref=c;
        vref.show();
    }
}