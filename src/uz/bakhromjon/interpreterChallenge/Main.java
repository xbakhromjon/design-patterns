package uz.bakhromjon.interpreterChallenge;

public class Main {
    public static void main(String[] args) {
        String context = "this is a sentence.";
        Expression expression = new FirstLetterIsUpperCase();
        context = expression.interpret(context);
        System.out.println(context);
    }
}
