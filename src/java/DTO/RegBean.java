/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package DTO;

/**
 *
 * @author DELL
 */
public class RegBean {
  String username,email,password,address;
  String contact;
   public String getName1() {
        return username;
    }

    public void setName1(String name1) {
        this.username = name1;
    }

    public String getAdd1() {
        return address;
    }

    public void setAdd1(String add1) {
        this.address = add1;
    }

    public String getPh1() {
        return contact;
    }

    public void setPh1(String ph1) {
        this.contact = ph1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw1() {
        return  password;
    }

    public void setPw1(String pw1) {
        this.password = pw1;
    }

    
    
    
}

