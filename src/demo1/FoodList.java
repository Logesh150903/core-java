package demo1;

public class FoodList {
	private String fName;
	private String fOrgin;
	private String fPrice;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfOrgin() {
		return fOrgin;
	}

	public void setfOrgin(String fOrgin) {
		this.fOrgin = fOrgin;
	}

	public String getfPrice() {
		return fPrice;
	}

	public void setfPrice(String fPrice) {
		this.fPrice = fPrice;
	}

	public FoodList(String fName, String fOrgin, String fPrice) {
		super();
		this.fName = fName;
		this.fOrgin = fOrgin;
		this.fPrice = fPrice;
	}

	public FoodList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodList [fName=" + fName + ", fOrgin=" + fOrgin + ", fPrice=" + fPrice + "]";
	}

	
}
