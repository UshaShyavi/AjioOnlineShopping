/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajio.com.AjioOnlineShopping.modules;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Shyavi
 */
@Document (collection ="User")
public class User {
    
     private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public User(String email, String password){
    this.email = email;
    this.password = password;
    }
    
    public User(){}
}
