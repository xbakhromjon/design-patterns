package uz.bakhromjon.iteratorChallenge;

import java.util.Iterator;

public class StaffList implements Iterable {
    private Employee[] employees;

    public StaffList(Employee... employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public StaffListIterator iterator() {
        return new StaffListIterator(this);
    }
}
