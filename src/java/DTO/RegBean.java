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
  String username,email,password;
  Float address1,address2;
  String contact;
   public String getName1() {
        return username;
    }

    public void setName1(String name1) {
        this.username = name1;
    }

    public Float getAdd1() {
        return address1;
    }

    public void setAdd1(Float add1) {
        this.address1 = add1;
    }

    public Float getAdd2() {
        return address2;
    }

    public void setAdd2(Float add2) {
        this.address2 = add2;
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

