package demo1;
class StockHighException extends Exception {
	 public StockHighException(String msg) {
	     super(msg);
	 }
	}

	class StockLowException extends Exception {
	 public StockLowException(String msg) {
	     super(msg);
	 }
	}
public class Stocks {
 public float stockRate;
 public Stocks(float stockRate) {
     this.stockRate = stockRate;
 }
 public String checkRate(float rate) throws StockHighException, StockLowException {
     float threshold = 0.8f * stockRate;
//     System.out.println(threshold);
     if (rate < threshold) {
         throw new StockLowException("Under Loss");
     } else if (rate > threshold) {
         throw new StockHighException("Under Profit");
     } else {
         return "Hope to raise";
     }
 }
 public static void main(String[] args) {
		Stocks stock = new Stocks(10.0f);
     try {
         System.out.println(stock.checkRate(11.0f));  
     } catch (StockHighException e) {
         System.out.println(e.getMessage());
     }
     catch (StockLowException e1) {
         System.out.println(e1.getMessage());
     }
 }
}

