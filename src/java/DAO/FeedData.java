/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DBConnection;
import DTO.CusLogBean;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author DELL
 */
public class FeedData {
    public boolean insert(CusLogBean bean){
        int up=0;
        try {
            Connection con = DBConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("insert into feedback values(?,?,?,?)");
           String msg=bean.getMsg();
            String img= bean.getImg();
            String contact=bean.getPh1();
            String name=bean.getName();
            
            ps.setString(1,name);
           ps.setString(2,contact);
            ps.setString(3,msg);
            ps.setString(4,img);
          
            
            up=ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        if(up!=0)
            return true;
        else
            return false;
    }
}
