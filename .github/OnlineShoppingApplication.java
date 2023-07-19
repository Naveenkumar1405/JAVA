import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShoppingApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Product> cart = new ArrayList<>();
        Store store = new Store();
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Welcome to our online store!");
            System.out.println("1. View products");
            System.out.println("2. Add a product to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    store.viewProducts();
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int productId = input.nextInt();
                    Product product = store.getProduct(productId);
                    if (product != null) {
                        cart.add(product);
                        System.out.println(product.getName() + " added to cart.");
                    } else {
                        System.out.println("Invalid product ID.");
                    }
                    break;
                case 3:
                    System.out.println("Your cart:");
                    for (Product p : cart) {
                        System.out.println(p.getName() + " - $" + p.getPrice());
                    }
                    break;
                case 4:
                    double total = 0;
                    for (Product p : cart) {
                        total += p.getPrice();
                    }
                    System.out.println("Your total: $" + total);
                    System.out.println("Thank you for shopping with us!");
                    exit = true;
                    break;
                case 5:
                    System.out.println("Thank you for visiting our online store!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        input.close();
    }

}

class Product {
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

class Store {
    private List<Product> products = new ArrayList<>();
    
    public Store() {
        products.add(new Product(1, "Shirt", 29.99));
        products.add(new Product(2, "Jeans", 39.99));
        products.add(new Product(3, "Shoes", 49.99));
        products.add(new Product(4, "Watch", 99.99));
    }
    
    public void viewProducts() {
        System.out.println("Products available:");
        for (Product p : products) {
            System.out.println(p.getId() + ". " + p.getName() + " - $" + p.getPrice());
        }
    }
    
    public Product getProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
