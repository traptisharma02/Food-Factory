/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DB.DBConnection;
import DTO.RegBean;
import java.io.PrintWriter;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class UpdateProfile1 {
    Connection con=null;
  
    public boolean update1(RegBean bean){
        int up=0;
        try {
            con=DBConnection.getConnection();
            String name= bean.getName1();
            String contact=bean.getPh1();
            String email=bean.getEmail();
            String password=bean.getPw1();
            Float address1=bean.getAdd1();
            Float address2=bean.getAdd2();
            
            PreparedStatement ps=con.prepareStatement("UPDATE user SET name=?,email_id=?,password=?,latitude=?,longtitude=? where contact_no=?");
            
            
            ps.setString(1, name);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setFloat(4,address1);
            ps.setFloat(5,address2);
            ps.setString(6,contact);
            
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
