package uz.bakhromjon.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:17
 **/
public class ChocolateWhite extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> chocolatePackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            ChocolateWhite chocolate = new ChocolateWhite();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " white chocolates has been made!");
        return chocolatePackage;
    }
}
