package uz.bakhromjon.behavioral.visitor;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Company extends Client {
    @Override
    public void sendMail() {
        System.out.println("Company");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
