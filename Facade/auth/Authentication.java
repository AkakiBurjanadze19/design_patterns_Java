package Facade.auth;

public class Authentication {
    public boolean verifyUser(String user, String password) {
        return user.equals("akaki") && password.equals("1234");
    }
}
