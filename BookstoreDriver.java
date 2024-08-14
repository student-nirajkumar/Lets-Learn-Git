/*Instructions:Create a Java program for managing customer information and book orders in an online store. Implement two classes: Customer and BookOrder.
Customer Class:
				 Include fields for Customer Name (customerName) and Customer ID (customerID).
				 Create a parameterized constructor to initialize these fields during customer registration. Implement getter methods for both fields by making them private.
BookOrder class: Inherit from the Customer class.
				 Include an additional field for Order Amount (orderAmount).
				 Create a parameterized constructor to initialize all fields during the book order placement
				 Implement a getter method for the Order Amount by making it private.
BookstoreDriver Class:
				 In the main method, create Book Orders for a customer.
				 Ensure that all the order details, including Customer Name, Customer ID, and Order Amount, are initialized during the order placement. and print Book Order Details for Customer as per expected output.
Sample Input-
			Deepak Jha
			TYP00145
			452.35
Sample Output-
			Book Order Details for Customer:
			Customer Name: Deepak Jha
			Customer ID: TYP00145
			Order Amount: $452.35
*/
// Customer.java
// BookstoreDriver.java
public class BookstoreDriver {
    
    public static void main(String[] args) {
        // Sample input
        String customerName = "Deepak Jha";
        String customerID = "TYP00145";
        double orderAmount = 452.35;

        // Create a BookOrder object with the sample input
        BookOrder bookOrder = new BookOrder(customerName, customerID, orderAmount);

        // Print Book Order Details for Customer
        System.out.println("Book Order Details for Customer:");
        System.out.println("Customer Name: " + bookOrder.getCustomerName());
        System.out.println("Customer ID: " + bookOrder.getCustomerID());
        System.out.println("Order Amount: $" + bookOrder.getOrderAmount());
    }

    // Nested Customer class
    static class Customer {
        private String customerName;
        private String customerID;

        // Parameterized constructor
        public Customer(String customerName, String customerID) {
            this.customerName = customerName;
            this.customerID = customerID;
        }

        // Getter methods
        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerID() {
            return customerID;
        }
    }

    // Nested BookOrder class
    static class BookOrder extends Customer {
        private double orderAmount;

        // Parameterized constructor
        public BookOrder(String customerName, String customerID, double orderAmount) {
            super(customerName, customerID); // Initialize fields in the superclass
            this.orderAmount = orderAmount;
        }

        // Getter method for orderAmount
        public double getOrderAmount() {
            return orderAmount;
        }
    }
}
