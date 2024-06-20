package demo;
//method overriding-->Runtime polymorphism->late Binding
//Parent-child relation(inheritance)-->method name as well as paramerters are same in p as well as child
class Category{//PArent class
  String cname="Electronics";
  void display() {
      System.out.println("Display for category");
  }
}
class ProductC extends Category{//Child
  String pname="Laptop";
  void display() {
      super.display();//super keyword used to access parent class method
      System.out.println("Display for Product");
  }
}
public class SingleInher {
  public static void main(String[] args) {
      ProductC p=new ProductC();
      System.out.println("Product name : "+p.pname);
      System.out.println("Category name : "+p.cname);
      p.display();
      
  }
}