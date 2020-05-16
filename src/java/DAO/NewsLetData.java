/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DBConnection;
import DTO.NewsLetBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class NewsLetData {
    Connection con=null;
    public boolean check(NewsLetBean bean){
          boolean status=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from newsletter where email=?");
                         String email=bean.getEmail();
			ps.setString(1,email);
			
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}catch(Exception e){}
		return status;
	}
    public boolean insert(NewsLetBean bean){
        int up=0;
        try {
            con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into newsletter values(?,?,?,?,?)");
            String name= bean.getName1();
            String email=bean.getEmail();
            String findUs=bean.getFindus();
            String newslet=bean.getNews();
            String msg=bean.getMsg();
            
            ps.setString(1, name);
            ps.setString(2,email);
            ps.setString(3,findUs);
            ps.setString(4,newslet);
            ps.setString(5,msg);
            
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
