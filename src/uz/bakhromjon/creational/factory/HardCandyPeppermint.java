package uz.bakhromjon.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:18
 **/
public class HardCandyPeppermint extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandyPeppermintPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandyPeppermint hardCandyCandyPeppermint = new HardCandyPeppermint();
            hardCandyPeppermintPackage.add(hardCandyCandyPeppermint);
        }

        System.out.println(quantity + " packages of candy have been made!");
        return hardCandyPeppermintPackage;
    }
}
