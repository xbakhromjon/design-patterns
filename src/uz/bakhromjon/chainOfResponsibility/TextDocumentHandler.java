package uz.bakhromjon.chainOfResponsibility;

public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    public void openDocument(String fileExtension) {
        if (fileExtension.equals("txt")) {
            System.out.println("Opening text document...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
