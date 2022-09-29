package uz.bakhromjon.behavioral.memento;

public class DocumentViewer {
    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        textDocument.write("Hello ");
        textDocument.write("World ");
        textDocument.save();
        textDocument.print();
        textDocument.write("Java ");
        textDocument.write("C++");
        textDocument.print();
        textDocument.undo();
        textDocument.save();
        textDocument.print();
    }
}
