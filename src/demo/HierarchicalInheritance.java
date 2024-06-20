package demo;
class Animal1 {
public void showAnimal() {
    System.out.println("I am an animal.");
}
}
class Wild extends Animal1 {
public void showWild() {
    System.out.println("I am a wild animal.");
}
}
class Domestic extends Animal1 {
public void showDomestic() {
    System.out.println("I am a domestic animal.");
}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
    Wild wildAnimal = new Wild();
    Domestic domesticAnimal = new Domestic();
    wildAnimal.showAnimal();   
    wildAnimal.showWild();  
    domesticAnimal.showAnimal();  
    domesticAnimal.showDomestic();
}
}
