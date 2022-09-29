package uz.bakhromjon.behavioral.chainOfResponsibilityLesson;

public class Client {
    public static void main(String[] args) {
        File file = new File("ppt");
        SpreadsheetHandler spreadsheetHandler = new SpreadsheetHandler();
        TextDocumentHandler textDocumentHandler = new TextDocumentHandler();
        SlideshowHandler slideshowHandler = new SlideshowHandler();
        if (file.getExtension().equals("ppt")) {
            slideshowHandler.openDocument();
        } else if (file.getExtension().equals("txt")) {
            textDocumentHandler.openDocument();
        } else if (file.getExtension().equals("xls")) {
            spreadsheetHandler.openDocument();
        }
    }
}
