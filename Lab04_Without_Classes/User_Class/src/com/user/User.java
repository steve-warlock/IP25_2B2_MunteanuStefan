package com.user;

import java.time.LocalDate;

public class User {
    private String name;
    private String hashPasswd;
    private int userID;
    private String emailUser;
    private LocalDate dateOfBirth;

    public User(String name, String hashPasswd, int userID, String emailUser, LocalDate dateOfBirth) {
        this.name = name;
        this.hashPasswd = hashPasswd;
        this.userID = userID;
        this.emailUser = emailUser;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setHashPasswd(String newHashPasswd) {
        this.hashPasswd = hashPasswd;
    }

    protected String getHashPasswd() {
        return this.hashPasswd;
    }

    public boolean Login(String userName, String hashPasswd) {
        if (this.getName().equals(userName) || this.getHashPasswd().equals(hashPasswd)) {
            System.out.println("UserName or Password invalid!");
            return false;
        }
        System.out.println("User successfully authenticated!");
        return true;
    }

}
