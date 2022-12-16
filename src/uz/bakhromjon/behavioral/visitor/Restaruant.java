package uz.bakhromjon.behavioral.visitor;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Restaruant extends Client {
    @Override
    public void sendMail() {
        System.out.println("Restaruant");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaruant(this);
    }
}
