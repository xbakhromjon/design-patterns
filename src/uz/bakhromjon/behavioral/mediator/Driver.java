package uz.bakhromjon.behavioral.mediator;

public class Driver {
    public void delivery(String item, int quantity, Customer customer) {
        System.out.println(quantity + " " + item + " out for delivery to " + customer.getAddress());
    }
}
