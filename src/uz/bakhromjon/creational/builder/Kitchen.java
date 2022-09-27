package uz.bakhromjon.creational.builder;

import java.awt.*;

public class Kitchen {
    private Color wallColor;
    private Integer numberOfDoors;
    private int numberOfWindows;

    public Kitchen(Color wallColor, Integer numberOfDoors, int numberOfWindows) {
        this.wallColor = wallColor;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "wallColor=" + wallColor +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}
