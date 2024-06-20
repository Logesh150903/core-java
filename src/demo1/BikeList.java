package demo1;

public class BikeList {
	private String bName;
	private String bBrand;
	private int bPrice;
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbBrand() {
		return bBrand;
	}
	public void setbBrand(String bBrand) {
		this.bBrand = bBrand;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	public BikeList(String bName, String bBrand, int bPrice) {
		super();
		this.bName = bName;
		this.bBrand = bBrand;
		this.bPrice = bPrice;
	}
	public BikeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BikeList [bName=" + bName + ", bBrand=" + bBrand + ", bPrice=" + bPrice + "]";
	}

}
