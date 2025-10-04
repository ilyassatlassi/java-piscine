import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // your code here
        if (!inventory.containsKey(productId)) {
            return -1;
        }
        return inventory.get(productId);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // your code here
        List<String> list = new ArrayList<>();
        if (inventory.size() == 0) {
            return list;
        }
        for (String entry : inventory.keySet()) {
            if (getProductPrice(inventory, entry) == price) {
                list.add(entry);
            }
        }
        return list;
    }
}