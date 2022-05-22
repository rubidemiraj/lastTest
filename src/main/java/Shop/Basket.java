package Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Basket {
    // private List<Product> items = new ArrayList<>();
    private HashMap<Product, Integer> items = new HashMap<>();

    public void add(Product product) {
        items.put(product, items.containsKey(product) ? items.get(product) + 1 : 1);
    }

    public void remove(Product product) {
        items.remove(product);
    }

    public void remove(Product product, int quantity) {
        if (quantity < 1) {
            System.out.println("Provida a positive value for the quantity");
            return;
        }

        if (items.containsKey(product)) {
            int actualQuantity = quantity > 0 ? items.get(product) - quantity : items.get(product) - quantity;
            if (actualQuantity > 0)
                items.put(product, actualQuantity);
            else {
                remove(product);
            }
        }
         else {
                System.out.println("Product not present in Basket");

        }

    }

    public List<Product> getItems () {
        return new ArrayList<>(items.keySet());
    }

    public HashMap<Product, Integer> getProductList() {
        return new HashMap<>(items);
    }
}


