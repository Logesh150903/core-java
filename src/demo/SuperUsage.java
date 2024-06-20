package demo;
class Animal{
    String type="animal";
    String  eat;
    void stay() {
        System.out.println("Animal staying in Forest and city");
    }
    Animal(String eat){
        this.eat=eat;
    }
}
class Dog extends Animal{
    String color;
    Dog(String eat,String color) {
        super(eat);
        this.color=color;
        // TODO Auto-generated constructor stub
    }
    String type="domesticanimal";
    void typeAnimal() {
        System.out.println("Type for dog :"+type);
        System.out.println("Type for animal :"+super.type);    
    }
    void stay() {
        super.stay();
        System.out.println(color+"Dog staying in houeses and ate "+eat );
    }
}
public class SuperUsage {
    public static void main(String[] args) {
        Dog d=new Dog("Milk", "Black");
        d.typeAnimal();
        d.stay();
    }
}