package uz.bakhromjon.creational.factory;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:17
 **/
public class CandyFactory {
    public Candy getCandy(String type) {
        return switch (type) {
            case "hard candy" -> new HardCandy();
            case "chocolate" -> new Chocolate();
            default -> null;
        };
    }

    public List<Candy> getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        return candy.makeCandyPackage(quantity);
    }
}
