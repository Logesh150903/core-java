package demo1;
import java.util.ArrayList;

public class Foodoperation {
	public static void main(String[] args) {
		ArrayList<FoodList> dlist=new ArrayList<>();
		FoodList f= new FoodList();
		f.setfName("Sambar");
		f.setfOrgin("tamilnadu");
		f.setfPrice("50");
		dlist.add(f);
		FoodList f1=new FoodList("fish kuri","chennai","100");
		dlist.add(f1);
		System.out.println("My array List "+ dlist);
		dlist.remove(0);
		System.out.println("My array List "+ dlist);
		FoodList f2=new FoodList("chicken kuri","chennai","100");
		dlist.set(0, f2);
		System.out.println("My array List "+ dlist);
		
	
		
		
	}

}