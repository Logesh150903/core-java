package demo;
class Animal2 {
    public void showAnimal2() {
        System.out.println("There are two type of Animal");
    }
}
class Wild1 extends Animal2 {
    public void showWild2() {
        System.out.println("1.Lion is Wild");
    }
}
class Domestic1 extends Wild1 {
    public void showDomestic() {
        System.out.println("2.Dog is Domestic");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
    	Domestic1 d= new Domestic1();
    	d.showAnimal2();
    	d.showWild2();
    	d.showDomestic();
    }
}
