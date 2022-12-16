package uz.bakhromjon.behavioral.visitor;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Resident extends Client {
    @Override
    public void sendMail() {
        System.out.println("Resident");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }
}
