package bank.customers;

public class Customer {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void displayInfo() {
        System.out.println("Customer: " + name + " | ID: " + customerId);
    }
}
