package uz.bakhromjon.iterator;

import javax.swing.*;
import java.util.Iterator;

public class StockIterator implements Iterator {

    private Inventory inventory;
    private int index;

    public StockIterator(Inventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public boolean hasNext() {
        Item[] items = inventory.getItems();
        if (index < items.length) {
            return true;
        }
        return false;
    }

    @Override
    public Item next() {
        Item[] items = inventory.getItems();
        if (hasNext()) {
            return items[index++];
        }
        return null;
    }

    @Override
    public void remove() {

    }
}
