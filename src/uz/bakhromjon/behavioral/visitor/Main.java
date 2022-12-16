package uz.bakhromjon.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main {
    public static void main(String[] args) {
        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        Bank bank = new Bank();
        Company company = new Company();
        List<Client> clients = List.of(bank, company);
        visitor.sendInsuranceMessage(clients);
    }
}
