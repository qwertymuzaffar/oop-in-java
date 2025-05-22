package collections;

import java.util.HashMap;

public class OrderManagement {
    private HashMap<Integer, String> orders;

    public OrderManagement() {
        orders = new HashMap<>();
    }

    public void addOrder(int orderId, String customerName) {
        orders.put(orderId, customerName);
    }

    public void displayOrders() {
        System.out.println("Customer Orders:");
        for (int orderId : orders.keySet()) {
            System.out.println("Order ID: " + orderId + ", Customer Name: " + orders.get(orderId));
        }
    }

    public static void main(String[] args) {
        OrderManagement orderManagement = new OrderManagement();
        orderManagement.addOrder(101, "Alice");
        orderManagement.addOrder(102, "Bob");
        orderManagement.displayOrders();
    }
}
