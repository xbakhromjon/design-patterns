package uz.bakhromjon.creational.builder;

import java.awt.*;
import java.util.List;

public class Architect {
    public static void main(String[] args) {
        BedRoom bedRoom = new BedRoomBuilder().setDimension(new Dimension(200, 100)).setCeilingHeight(132).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(true).createBedRoom();

        Kitchen k1 = new KitchenBuilder().setWallColor(Color.yellow).build();
        Kitchen k2 = new KitchenBuilder().setWallColor(Color.yellow).build();

        List<Kitchen> list = new KitchenListBuilder().addList().addKitchen(k1).addKitchen(k2).build();
    }
}
