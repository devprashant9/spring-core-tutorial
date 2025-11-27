package org.example.springCore.coupling.tight;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println("From Tight Coupling: " +userManager.getUserInfo());;
    }
}

// Components Are Highly Dependent on Each Other
// To Make One Change, It Requires Changes in Different Parts of Code