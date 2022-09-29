package uz.bakhromjon.behavioral.iteratorChallenge;

public class Main {
    public static void main(String[] args) {
        Employee zak = new Employee("Zak");
        Employee sara = new Employee("Sara");
        Employee jack = new Employee("Jack");

        StaffList staffList = new StaffList(zak, sara, jack);
        StaffListIterator iterator = staffList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
