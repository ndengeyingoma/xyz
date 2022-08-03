/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz;

/**
 *
 * @author IT Josh
 */
public class User {
    
    private String username;
    private String password;
    private String email;
    private double amount;

    public User() {
    }

    public User(String username, String password, String email, double amount) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.amount = amount;
    }

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}