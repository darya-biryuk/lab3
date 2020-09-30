package Lab1;

public class Admin extends User {
    @Override
    public void login(String login, int code) {
        return;
    }

    @Override
    public int generateCode(String phone) {
        return 0;
    }
}
