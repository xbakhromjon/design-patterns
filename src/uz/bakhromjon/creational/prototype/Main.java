package uz.bakhromjon.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Sally");
        rabbit.setAge(10);
        Rabbit clone = rabbit.clone();
        clone.getOwner().setName("Alex");
        System.out.println(rabbit.getOwner().getName());
        System.out.println(clone.getOwner().getName());
    }
}
