package uz.bakhromjon.chainOfResponsibility;

public abstract class DocumentHandler {
    private DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    public void openDocument(String fileExtension) {
        if (next != null) {
            next.openDocument(fileExtension);
        }
    }

}
