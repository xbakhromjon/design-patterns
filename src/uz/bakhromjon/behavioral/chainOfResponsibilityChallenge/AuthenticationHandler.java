package uz.bakhromjon.behavioral.chainOfResponsibilityChallenge;

public abstract class AuthenticationHandler {
    private AuthenticationHandler next;

    public AuthenticationHandler(AuthenticationHandler next) {
        this.next = next;
    }

    public void handlerRequest(String requestType) {
        if (next != null) {
            next.handlerRequest(requestType);
        }
    }

}
