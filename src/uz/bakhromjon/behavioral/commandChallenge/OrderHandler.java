package uz.bakhromjon.behavioral.commandChallenge;

public class OrderHandler {

    public void invoke(Command command) {
        command.execute();
    }
}
