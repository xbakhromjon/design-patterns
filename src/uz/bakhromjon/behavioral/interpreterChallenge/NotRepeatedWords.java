package uz.bakhromjon.behavioral.interpreterChallenge;

public class NotRepeatedWords implements Expression {
    private EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    @Override
    public String interpret(String context) {
        context = HelperMethods.noRepeatedWords(context);
        return endsWithPeriod.interpret(context);
    }
}
