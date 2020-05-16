/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DBConnection;
import DTO.todayMBean;
import java.sql.Connection;

import java.sql.PreparedStatement;

/**
 *
 * @author DELL
 */
public class TodayMdata {
    public void delete(todayMBean bean){
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(" delete t.* from todaym t join (select max(id) maxi from todaym) tmax on t.id!=tmax.maxi;");
            ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
      public boolean insert(todayMBean bean){
        int up=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into todaym (image,item1,item2,item3)values(?,?,?,?)");
            String item1= bean.getitem1();
            String item2= bean.getitem2();
            String item3= bean.getitem3();
            String img= bean.getimg();
            
            ps.setString(2, item1);
            ps.setString(3,item2);
            ps.setString(4,item3);
            ps.setString(1,img);
            
            
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
