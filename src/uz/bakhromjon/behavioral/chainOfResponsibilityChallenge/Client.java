package uz.bakhromjon.behavioral.chainOfResponsibilityChallenge;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler chain = new BasicAuthenticationHandler(
                new DigestAuthenticationHandler(
                        new ClientCertificateAuthenticationHandler(null)));
        chain.handlerRequest("basic");
        chain.handlerRequest("client certificate");
        chain.handlerRequest("digest");
    }
}