package uz.bakhromjon.behavioral.chainOfResponsibilityChallenge;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

    public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    public void handlerRequest(String requestType) {
        if (requestType.equals("client certificate")) {
            System.out.println("Handling client certificate authentication request.");
        } else {
            super.handlerRequest(requestType);
        }
    }
}
