package pack2;

import java.util.ArrayList;
import java.util.List;

class Insect{
    private String insectName;
    private int insectWeight;
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
}
class Insecticides{
    public List<String> mapInsectstName(List<Insect> list){
        List<String> s=new ArrayList<>();
        for(Insect i:list) {
            s.add(i.getInsectName());
            
        }
        return s;
    }
    
    public List<Insect> getWeight(List<Insect> list){
        List<Insect> s1=new ArrayList<>();
        for(Insect i:list) {
            int weight=i.getInsectWeight();
            if(weight>40 && weight<=100) {
                s1.add(i);
            }
        }
        return s1;
    }
}
public class Insertcollation {

	public static void main(String[] args) {
		List<Insect> l=new ArrayList<>();
	     l.add(new Insect("Ant", 45));
	     l.add(new Insect("Cockroach", 65));
	    l.add(new Insect("bee", 99));
	    l.add(new Insect("paper wasp", 11));
    System.out.println("list"+l);

	}

}
