package demo1;
class Customer {
    int id;
    String name;
    double walletBalance;
    String address;

    // Parameterized constructor with public visibility
    public Customer(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }
}

class Item {
    int id;
    String name;
    String companyName;
    double price;
    boolean isInStock;

    // Parameterized constructor with public visibility
    public Item(int id, String name, String companyName, double price, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.isInStock = isInStock;
    }
}
class InsufficientBalanceException extends Exception {

    // Parameterized constructor with public visibility
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ItemOutOfStockException extends Exception {

    // Parameterized constructor with public visibility
    public ItemOutOfStockException(String message) {
        super(message);
    }
}
class ShoppingWebsite {

    // Method to purchase an item
    public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException {
        if (!i.isInStock) {
            throw new ItemOutOfStockException("Item is out of stock");
        }
        if (c.walletBalance < i.price) {
            throw new InsufficientBalanceException("Insufficient balance in wallet");
        }

        // Deduct the price of the item from the customer's wallet balance
        c.walletBalance -= i.price;

        // Update the item's stock status
        i.isInStock = false;

        return "Order Successful";
    }
}

public class Shop {
    public static void main(String[] args) {
        try {
            Customer cusDet = new Customer(927392, "Steve", 5000.0, "USA");
            Item itemDet = new Item(27392, "T-Shirt", "US Polo", 800, true);
            ShoppingWebsite obj = new ShoppingWebsite();
            
            String out = obj.purchaseItem(itemDet, cusDet);
            System.out.println(out);
        } catch (ItemOutOfStockException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e1) {
            System.out.println(e1.getMessage());
        }
    }
}

