package uz.bakhromjon.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        String context = "_Int";
        Expression expression = new FirstLetterNotUnderscore();
        context = expression.interpret(context);
        System.out.println(context);
    }
}
