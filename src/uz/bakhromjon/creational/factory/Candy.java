package uz.bakhromjon.creational.factory;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @user: xbakhromjon
 * @since : 29/09/22, Thu, 09:17
 **/
public abstract class Candy {
    abstract List<Candy> makeCandyPackage(int quantity);
}
