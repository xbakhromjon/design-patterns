package uz.bakhromjon.creational.singleton;

public class PrintSpoiler {
    private static final PrintSpoiler instance = new PrintSpoiler();

    private PrintSpoiler() {
    }

    public void init() {

    }

    public static synchronized PrintSpoiler getInstance() {
        return instance;
    }
}
