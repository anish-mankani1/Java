package TEST;

class ProductDetails {

    // Fields
    private String productName;
    private double price;
    private int quantity;
    private String category;

    // No-argument constructor
    public ProductDetails() {
        // Default constructor
    }

    // All-argument constructor
    public ProductDetails(String productName, double price, int quantity, String category) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // Display method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }
}

// 🚀 Main Class (outside ProductDetails)
public class Example10 {
    public static void main(String[] args) {
        // Using no-argument constructor and setters
        ProductDetails product1 = new ProductDetails();
        product1.setProductName("Wireless Mouse");
        product1.setPrice(799.99);
        product1.setQuantity(10);
        product1.setCategory("Electronics");

        // Using all-argument constructor
        ProductDetails product2 = new ProductDetails("Notebook", 59.99, 100, "Stationery");
      
        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();
    }
}
