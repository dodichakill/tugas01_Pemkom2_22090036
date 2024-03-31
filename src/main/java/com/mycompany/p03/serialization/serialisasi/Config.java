/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03.serialization.serialisasi;

import java.io.Serializable;

/**
 *
 * @author dodi
 */

public class Config implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String ID; // Final, tidak bisa diubah setelah di initialisasikan
    private String username;
    private String numberPhone;
    private transient String password; // Transient, tidak bisa diserialkan
    private String bio;

    public Config(String ID, String username, String numberPhone, String password, String bio) {
        this.ID = ID;
        this.username = username;
        this.numberPhone = numberPhone;
        this.password = password;
        this.bio = bio;
    }

    // Getters for all fields
    public String getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    // Setters for username, numberPhone, and bio
    public void setUsername(String username) {
        this.username = username;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
