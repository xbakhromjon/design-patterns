package uz.bakhromjon.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:18
 **/
public class HardCandyLollipop extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandyLollipopPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandyLollipop hardCandyCandyLollipop = new HardCandyLollipop();
            hardCandyLollipopPackage.add(hardCandyCandyLollipop);
        }

        System.out.println(quantity + " packages of candy have been made!");
        return hardCandyLollipopPackage;
    }
}
