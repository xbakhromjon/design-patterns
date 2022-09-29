package uz.bakhromjon.behavioral.interpreterChallenge;

public class EndsWithPeriod implements Expression {
    @Override
    public String interpret(String context) {
        context = HelperMethods.endsWithPeriod(context);
        return context;
    }
}
