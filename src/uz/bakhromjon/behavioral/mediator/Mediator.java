package uz.bakhromjon.behavioral.mediator;

public class Mediator {
    private Customer customer;
    private ECommerceSite eCommerceSite;
    private Driver driver;


    public Mediator() {
        this.customer = new Customer("123 Sunny Street");
        this.eCommerceSite = new ECommerceSite();
        this.driver = new Driver();
    }

    public void buy(String item, int quantity) {
        if (eCommerceSite.checkInStock(item, quantity)) {
            eCommerceSite.sell(item, quantity);
            driver.delivery(item, quantity, customer);
        }
    }
}
