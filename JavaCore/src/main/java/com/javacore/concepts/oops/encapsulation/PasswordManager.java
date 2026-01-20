package com.javacore.concepts.oops.encapsulation;

public class PasswordManager {
    //restricting direct access to the password field
    private String password;

    public PasswordManager(String password) {
        setPassword(password); //using setter for initial validation
    }

    //defining getter and setter for password field
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long and contain a mix of letters and numbers.");
        }
    }

    //simple password validation method to enforce rules
    private boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (hasLetter && hasDigit) {
                return true;
            }
        }
        return false;
    }
}
