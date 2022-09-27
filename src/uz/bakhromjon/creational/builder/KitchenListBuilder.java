package uz.bakhromjon.creational.builder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KitchenListBuilder {
    private ArrayList<Kitchen> kitchens;

    public KitchenListBuilder addList() {
        this.kitchens = new ArrayList<>();
        return this;
    }

    public KitchenListBuilder addKitchen(Kitchen kitchen) {
        kitchens.add(kitchen);
        return this;
    }

    public KitchenBuilder addKitchen() {
        return new KitchenBuilder(this);
    }

    public List<Kitchen> build() {
        return kitchens;
    }
}
