/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayesh
 */
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, Double> items = new HashMap<>();

    public void addItem(String itemName, double price) {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        items.put(itemName, price);
    }

    public void removeItem(String itemName) {
        if (!items.containsKey(itemName)) {
            throw new IllegalArgumentException("Item not found in cart.");
        }
        items.remove(itemName);
    }

    public double calculateTotal(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
        double sum = 0.0;
        for (double price : items.values()) {
            sum += price;
        }
        return sum * (1 - (discountPercentage / 100.0));
    }

    public int getItemCount() {
        return items.size();
    }
}
