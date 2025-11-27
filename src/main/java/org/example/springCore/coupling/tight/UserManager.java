package org.example.springCore.coupling.tight;

public class UserManager {

    UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
