package com.company.entities;

public class CreateAccount extends User {
    private String newUsername;
    private String newEmail;
    private String newPassword;

    public CreateAccount(String username, String password, String email) {
        super(username, password, email);
        this.newUsername = username;
        this.newEmail = email;
        this.newPassword = password;
    }

    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "CreateAccount{" +
                "newUsername='" + newUsername + '\'' +
                ", newEmail='" + newEmail + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
