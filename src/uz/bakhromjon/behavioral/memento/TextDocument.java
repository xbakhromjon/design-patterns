package uz.bakhromjon.behavioral.memento;

public class TextDocument {
    private final Memento memento = new Memento();
    private String text = "";

    public TextDocument() {
    }

    public void write(String text) {
        this.text += text;
    }

    public void print() {
        System.out.println(text);
    }

    public void save() {
        memento.setState(text);
    }

    public void undo() {
        this.text = memento.getState();
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
