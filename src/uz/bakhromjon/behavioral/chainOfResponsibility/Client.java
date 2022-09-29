package uz.bakhromjon.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        DocumentHandler chain = new SlideshowHandler(
                new TextDocumentHandler(
                        new SpreadsheetHandler(null)));
        chain.openDocument("txt");
        chain.openDocument("xls");
        chain.openDocument("ppt");
    }
}