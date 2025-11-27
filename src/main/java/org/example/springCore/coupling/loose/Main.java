package org.example.springCore.coupling.loose;

public class Main {
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        UserManager userManager = new UserManager(userDatabase);
        System.out.println("From Loose Coupling: " +userManager.getUserInfo());
    }
}

// Components Are Less Dependent on Each Other
// To Make One Change, It Requires Minimal or No Changes
