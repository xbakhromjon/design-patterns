package uz.bakhromjon.interpreterChallenge;

public class FirstLetterIsUpperCase implements Expression {
    private NotRepeatedWords notRepeatedWords = new NotRepeatedWords();
    @Override
    public String interpret(String context) {
        context =  HelperMethods.firstLetterLowerCase(context);
        return notRepeatedWords.interpret(context);
    }
}
