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
public class NewsLetBean {
    String username,email,findUs,news,message;
  
   public String getName1() {
        return username;
    }

    public void setName1(String name1) {
        this.username = name1;
    }

    public String getFindus() {
        return findUs;
    }

    public void setFindus(String findUs) {
        this.findUs = findUs;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return  message;
    }

    public void setMsg(String message) {
        this.message = message;
    }
}
