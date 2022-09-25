package uz.bakhromjon.mediator;

import java.util.HashMap;

public class ECommerceSite {
    private HashMap<String, Integer> stock;

    public ECommerceSite() {
        stock = new HashMap<>();
        stock.put("pens", 100);
        stock.put("pencils", 50);
        stock.put("erasers", 75);
    }

    public boolean checkInStock(String item, int quantity) {
        if (stock.containsKey(item) && stock.get(item) > quantity) {
            return true;
        }
        return false;
    }

    public void sell(String item, int quantity) {
        int newQuantity = stock.get(item) - quantity;
        stock.put(item, newQuantity);
    }
}
