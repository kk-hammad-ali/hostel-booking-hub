/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooseproject_model;

/**
 *
 * @author KK
 */
public class User_Model {
    private String id;
    private String name;
    private String email;
    private String username;
    private String password;
    private String cnic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public User_Model(String id,String name, String email, String username, String password, String cnic) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.cnic = cnic;
        this.id = id;
    }
    
    public User_Model(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    } 
}
