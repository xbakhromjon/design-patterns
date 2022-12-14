package uz.bakhromjon.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:18
 **/
public class HardCandy extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandyPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandy hardCandy = new HardCandy();
            hardCandyPackage.add(hardCandy);
        }

        System.out.println(quantity + " packages of candy have been made!");
        return hardCandyPackage;
    }
}
