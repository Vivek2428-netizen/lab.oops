import java.util.HashMap;
import java.util.Map;

public class BillingSystem {

    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();
        items.put("Item1", 10.0);
        items.put("Item2", 20.0);
        items.put("Item3", 30.0);

        double totalBill = calculateTotalBill(items);
        System.out.println("Total Bill: $" + totalBill);
    }

    public static double calculateTotalBill(Map<String, Double> items) {
        double total = 0.0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}