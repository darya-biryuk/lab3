package Lab1;

public interface Authorizer extends Generator {
    void login(String login, int code);
}
