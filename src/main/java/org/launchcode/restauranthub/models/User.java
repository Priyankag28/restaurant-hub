package org.launchcode.restauranthub.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String pwHash;

    public User(){
    }
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public User(String username, String password){
        this.username = username;
        this.pwHash = encoder.encode(password);
    }
    public String getUsername(){
        return username;
    }
    public boolean isMatchingPassword(String password){
        return encoder.matches(password, pwHash);
    }

    public int getId() {
        return id;
    }

   // public void setId(int id) {
//        this.id = id;
//    }
}
