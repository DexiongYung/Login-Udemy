package com.bignerdranch.android.udemy.Infrastructure;

/**
 * Created by Dylan on 2017-06-20.
 */

public class User {
    private int id;
    private String userName;
    private String displayeName;
    private boolean isLoggedIn;
    private boolean hasPassword;
    private String email;
    private String password;

    public boolean isHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getDisplayeName() {
        return displayeName;
    }

    public void setDisplayeName(String displayeName) {
        this.displayeName = displayeName;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
