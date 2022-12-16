package uz.bakhromjon.behavioral.visitor;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Bank extends Client {
    @Override
    public void sendMail() {
        System.out.println("Bank");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
