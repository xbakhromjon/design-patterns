package uz.bakhromjon.creational.factory;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:17
 **/
public class CandyStore {
    public static void main(String[] args) {
        CandyFactory candyFactory = new CandyFactory();
        candyFactory.getCandyPackage(12, "white", "chocolate");
        candyFactory.getCandyPackage(7, "dark", "chocolate");
        candyFactory.getCandyPackage(14, "lollipop", "hard candy");
        candyFactory.getCandyPackage(20, "peppermint", "hard candy");
    }
}
