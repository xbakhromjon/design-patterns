package uz.bakhromjon.mementoChallenge;

public class Adder {
    private final Memento memento = new Memento();
    private Integer result = 0;

    public Integer getResult() {
        return result;
    }

    public void add(Integer num) {
        result += num;
    }

    public void save() {
        memento.setState(result);
    }

    public void undo() {
        result = memento.getState();
    }
}
