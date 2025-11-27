package org.example.springCore.coupling.loose;

public class UserManager {
    UserDatabase userDatabase;

    public UserManager(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
