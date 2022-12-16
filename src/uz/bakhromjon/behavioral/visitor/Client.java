package uz.bakhromjon.behavioral.visitor;

/**
 * @author : Bakhromjon Khasanboyev
 **/

public abstract class Client {
    private String name;
    private String address;
    private String number;


    public abstract void accept(Visitor visitor);

    public abstract void sendMail();

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
