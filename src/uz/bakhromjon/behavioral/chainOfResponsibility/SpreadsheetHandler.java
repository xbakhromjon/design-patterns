package uz.bakhromjon.behavioral.chainOfResponsibility;

public class SpreadsheetHandler extends DocumentHandler {

    public SpreadsheetHandler(DocumentHandler next) {
        super(next);
    }

    public void openDocument(String fileExtension) {
        if (fileExtension.equals("xls")) {
            System.out.println("Opening excel document...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
