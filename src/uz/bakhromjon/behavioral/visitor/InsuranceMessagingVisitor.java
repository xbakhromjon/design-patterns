package uz.bakhromjon.behavioral.visitor;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMessage(List<Client> clients) {
        for (Client client: clients) {
            client.accept(this);
        }
    }

    public void visitBank(Bank bank) {
        System.out.println("Bank");
    }

    public void visitCompany(Company company) {
        System.out.println("Company");
    }

    public void visitResident(Resident resident) {
        System.out.println("Resident");
    }

    public void visitRestaruant(Restaruant restaruant) {
        System.out.println("Restaruant");
    }
}
