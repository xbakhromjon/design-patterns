package uz.bakhromjon.creational.prototype;

public class Rabbit implements Cloneable {

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit(String name) {
        this.owner = new Person(name);
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit clone = (Rabbit) super.clone();
            clone.owner = owner.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
