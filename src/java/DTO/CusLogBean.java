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
public class CusLogBean {
    String contact,password,name;
    String fimg,fmsg;
    
    
     public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }
    
     public String getPh1() {
        return contact;
    }

    public void setPh1(String ph1) {
        this.contact = ph1;
    }
     public String getPw1() {
        return  password;
    }
     
     
    public void setPw1(String pw1) {
        this.password = pw1;
    }

    public void setMsg(String fmsg) {
        this.fmsg = fmsg;
    }
     public String getMsg() {
        return fmsg;
    }

     public void setImg(String fimg) {
        this.fimg = fimg;
    }
   
     public String getImg() {
        return  fimg;
    }

}
