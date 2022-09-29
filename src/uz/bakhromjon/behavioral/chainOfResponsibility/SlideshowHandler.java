package uz.bakhromjon.behavioral.chainOfResponsibility;

public class SlideshowHandler extends DocumentHandler {

    public SlideshowHandler(DocumentHandler next) {
        super(next);
    }

    public void openDocument(String fileExtension) {
        if (fileExtension.equals("ppt")) {
            System.out.println("Opening slideshow document...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
