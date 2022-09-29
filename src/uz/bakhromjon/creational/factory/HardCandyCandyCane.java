package uz.bakhromjon.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:18
 **/
public class HardCandyCandyCane extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandyCanePackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandyCandyCane hardCandyCandyCane = new HardCandyCandyCane();
            hardCandyCanePackage.add(hardCandyCandyCane);
        }

        System.out.println(quantity + " packages of candy have been made!");
        return hardCandyCanePackage;
    }
}
