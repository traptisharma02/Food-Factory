/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DB.DBConnection;
import DTO.RegBean;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class SignUpData {
    Connection con=null;
    public boolean check(RegBean bean){
          boolean status=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user where contact_no=?");
                         String contact=bean.getPh1();
			ps.setString(1,contact);
			
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}catch(Exception e){}
		return status;
	}
    public boolean insert(RegBean bean){
        int up=0;
        try {
            con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?,0,0)");
            String name= bean.getName1();
            String contact=bean.getPh1();
            String email=bean.getEmail();
            String password=bean.getPw1();
            Float address1=bean.getAdd1();
            Float address2=bean.getAdd1();
            
            ps.setString(1, name);
            ps.setString(2,contact);
            ps.setString(3,email);
            ps.setString(4,password);
            ps.setFloat(5,address1);
            ps.setFloat(6,address2);
            
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
