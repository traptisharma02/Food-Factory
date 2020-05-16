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
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CusLogData {
     public boolean check(CusLogBean bean){
         boolean status=false;
         Connection con=DBConnection.getConnection();
         try{
                    PreparedStatement ps=con.prepareStatement("select * from user where contact_no=? and request_status=0");
                         String contact=bean.getPh1();
			ps.setString(1,contact);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e){}
		return status;
     }
    public boolean insert(CusLogBean bean){
        Connection con=DBConnection.getConnection();
          boolean status=false;
		try{
                    PreparedStatement ps=con.prepareStatement("select * from user where contact_no=? and password=?");
                         String contact=bean.getPh1();
                          String pass=bean.getPw1();
			ps.setString(1,contact);
			ps.setString(2,pass);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}catch(Exception e){}
		return status;
	}
    
}
