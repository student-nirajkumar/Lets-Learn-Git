/*Problem:
You are tasked with designing a simple Online Shopping System in Java. The system 
should allow users to browse products, add items to their shopping cart, view their 
cart, and place orders.
Instructions:
Write a Java program that consists of several classes: Product, ShoppingCart, Customer,
and OrderSystem.
The Product class should represent individual products with the following attributes and methods:
Attributes:
>id (int)
>name (String)
>price (double)
Methods:
displayDetails() to display the product's details including id, name, and price.
The ShoppingCart class should allow users to add products, remove products, and view 
the items in their cart. It should include the following methods:
Methods:
addItem(Product product) to add a product to the cart.
removeItem(Product product) to remove a product from the cart.
viewCart() to display the items in the cart.
The Customer class should represent users of the online shopping system. It should have
a name attribute and a ShoppingCart attribute.
The OrderSystem class should have the main method to interact with users. It should 
allow users to perform the following operations:
Browse products and add them to their shopping cart.
Remove items from their shopping cart.
View their shopping cart.
Place an order.
Your program should follow these specifications:
>>>The Product class should be appropriately defined with attributes and methods as 
specified above.
>>>The ShoppingCart class should have methods to add items, remove items, and view the
cart contents.
>>>The Customer class should have a name attribute and a ShoppingCart attribute.
>>>The OrderSystem class should take user input for browsing products, adding/removing
items from the cart, and placing orders.
=====================
Sample Input:
1. Add Product to Cart
Product ID: 101
Product Name: Laptop
Price: 999.99
2. Remove Product from Cart
Product ID: 101
3. View Cart
4. Place Order
======================
Sample Output:
1. Product Added to Cart Successfully.
2. Product Removed from Cart Successfully.
3. Your Shopping Cart:
   - Product ID: 101, Name: Laptop, Price: $999.99
4. Order Placed Successfully. Thank you for shopping with us!
*/




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OnlineShoppingSystem {
    // Product class
    static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Product ID: " + id + ", Name: " + name + ", Price: $" + price);
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

    // ShoppingCart class
    static class ShoppingCart {
        private List<Product> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void addItem(Product product) {
            items.add(product);
            System.out.println("Product Added to Cart Successfully.");
        }

        public void removeItem(int productId) {
            boolean removed = items.removeIf(product -> product.getId() == productId);
            if (removed) {
                System.out.println("Product Removed from Cart Successfully.");
            } else {
                System.out.println("Product Not Found in Cart.");
            }
        }

        public void viewCart() {
            if (items.isEmpty()) {
                System.out.println("Your Shopping Cart is empty.");
                return;
            }
            System.out.println("Your Shopping Cart:");
            for (Product product : items) {
                product.displayDetails();
            }
        }
    }

    // Customer class
    static class Customer {
        private String name;
        private ShoppingCart shoppingCart;

        public Customer(String name) {
            this.name = name;
            this.shoppingCart = new ShoppingCart();
        }

        public String getName() {
            return name;
        }

        public ShoppingCart getShoppingCart() {
            return shoppingCart;
        }
    }

    // Main method
    public static void main(String[] args) {
        Map<Integer, Product> productCatalog = new HashMap<>();
        initializeProductCatalog(productCatalog);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

        boolean running = true;
        while (running) {
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProductToCart(scanner, productCatalog, customer);
                    break;
                case 2:
                    removeProductFromCart(scanner, customer);
                    break;
                case 3:
                    customer.getShoppingCart().viewCart();
                    break;
                case 4:
                    placeOrder(customer);
                    running = false;
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void initializeProductCatalog(Map<Integer, Product> productCatalog) {
        // Adding sample products to the catalog
        productCatalog.put(101, new Product(101, "Laptop", 999.99));
        productCatalog.put(102, new Product(102, "Smartphone", 599.99));
        productCatalog.put(103, new Product(103, "Headphones", 199.99));
    }

    private static void addProductToCart(Scanner scanner, Map<Integer, Product> productCatalog, Customer customer) {
        System.out.print("Enter Product ID to add: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product product = productCatalog.get(productId);
        if (product != null) {
            customer.getShoppingCart().addItem(product);
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void removeProductFromCart(Scanner scanner, Customer customer) {
        System.out.print("Enter Product ID to remove: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        customer.getShoppingCart().removeItem(productId);
    }

    private static void placeOrder(Customer customer) {
        customer.getShoppingCart().viewCart();
        System.out.println("Order Placed Successfully. Thank you for shopping with us!");
    }
}
