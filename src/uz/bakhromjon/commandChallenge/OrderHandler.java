package uz.bakhromjon.commandChallenge;

public class OrderHandler {

    public void invoke(Command command) {
        command.execute();
    }
}
