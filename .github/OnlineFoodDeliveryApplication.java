import java.util.List;
import java.util.Scanner;

public class OnlineFoodDeliveryApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<FoodItem> cart = new ArrayList<>();
        Restaurant restaurant = new Restaurant();
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Welcome to our online food delivery service!");
            System.out.println("1. View menu");
            System.out.println("2. Add an item to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    restaurant.viewMenu();
                    break;
                case 2:
                    System.out.print("Enter item ID: ");
                    int itemId = input.nextInt();
                    FoodItem item = restaurant.getFoodItem(itemId);
                    if (item != null) {
                        cart.add(item);
                        System.out.println(item.getName() + " added to cart.");
                    } else {
                        System.out.println("Invalid item ID.");
                    }
                    break;
                case 3:
                    System.out.println("Your cart:");
                    for (FoodItem i : cart) {
                        System.out.println(i.getName() + " - $" + i.getPrice());
                    }
                    break;
                case 4:
                    double total = 0;
                    for (FoodItem i : cart) {
                        total += i.getPrice();
                    }
                    System.out.println("Your total: $" + total);
                    System.out.println("Thank you for using our online food delivery service!");
                    exit = true;
                    break;
                case 5:
                    System.out.println("Thank you for visiting our online food delivery service!");
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

class FoodItem {
    private int id;
    private String name;
    private double price;
    
    public FoodItem(int id, String name, double price) {
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

class Restaurant {
    private List<FoodItem> menu = new ArrayList<>();
    
    public Restaurant() {
        menu.add(new FoodItem(1, "Pizza", 12.99));
        menu.add(new FoodItem(2, "Burger", 8.99));
        menu.add(new FoodItem(3, "Sushi", 15.99));
        menu.add(new FoodItem(4, "Salad", 9.99));
    }
    
    public void viewMenu() {
        System.out.println("Menu:");
        for (FoodItem i : menu) {
            System.out.println(i.getId() + ". " + i.getName() + " - $" + i.getPrice());
        }
    }
    
    public FoodItem getFoodItem(int id) {
        for (FoodItem i : menu) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
}

