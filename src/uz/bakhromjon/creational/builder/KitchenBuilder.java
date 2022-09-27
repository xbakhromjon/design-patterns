package uz.bakhromjon.creational.builder;

import java.awt.*;

public class KitchenBuilder {
    private Color wallColor;
    private Integer numberOfDoors;
    private int numberOfWindows;
    private KitchenListBuilder kitchenListBuilder;

    public KitchenBuilder() {
    }

    public KitchenBuilder(KitchenListBuilder kitchenListBuilder) {
        this.kitchenListBuilder = kitchenListBuilder;
    }

    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public KitchenBuilder setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public Kitchen build() {
        return new Kitchen(wallColor, numberOfDoors, numberOfWindows);
    }
}
