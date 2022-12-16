package uz.bakhromjon.behavioral.visitor;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public interface Visitor {
    void visitBank(Bank bank);
    void visitCompany(Company company);
    void visitResident(Resident resident);
    void visitRestaruant(Restaruant restaruant);
}
