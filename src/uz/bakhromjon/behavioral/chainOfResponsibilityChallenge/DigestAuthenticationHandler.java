package uz.bakhromjon.behavioral.chainOfResponsibilityChallenge;

public class DigestAuthenticationHandler extends AuthenticationHandler {

    public DigestAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    public void handlerRequest(String requestType) {
        if (requestType.equals("digest")) {
            System.out.println("Handling digest authentication request.");
        } else {
            super.handlerRequest(requestType);
        }
    }
}
