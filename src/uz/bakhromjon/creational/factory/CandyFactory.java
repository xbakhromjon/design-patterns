package uz.bakhromjon.creational.factory;

import java.util.List;
import java.util.SplittableRandom;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:17
 **/
public class CandyFactory {
    public Candy getCandy(String section) {
        return switch (section) {
            case "dark" -> new ChocolateDark();
            case "white" -> new ChocolateWhite();
            case "milk" -> new ChocolateMilk();
            case "candy_cane" -> new HardCandyCandyCane();
            case "lollipop" -> new HardCandyLollipop();
            case "peppermint" -> new HardCandyPeppermint();
            default -> new ChocolateMilk();
        };
    }

    public List<Candy> getCandyPackage(int quantity, String type, String section) {
        Candy candy = getCandy(type);
        if (section.equals("hard candy")) {
            if (quantity % 10 != 0) {
                System.out.println("Hard candy must be packaged in multiples of 10.");
                return null;
            }
        }
        return candy.makeCandyPackage(quantity);
    }
}
