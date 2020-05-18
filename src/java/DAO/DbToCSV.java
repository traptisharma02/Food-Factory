/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DBConnection;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class DbToCSV {
     public static void main(String args[]) throws SQLException, IOException {
      //Getting the connection
      
      Connection con = DBConnection.getConnection();
      System.out.println("Connection established......");
      //Creating the Statement
      Statement stmt = con.createStatement();
      //Query to retrieve records
      String query = "Select * from user";
      //Executing the query
      stmt.executeQuery("use foodfactory1");
      ResultSet rs = stmt.executeQuery(query);
      //Instantiating the CSVWriter class
      CSVWriter writer = new CSVWriter(new FileWriter("D://output.csv"));
      ResultSetMetaData Mdata = rs.getMetaData();
      Mdata.getColumnName(1);
      //Writing data to a csv file
      String line1[] = {Mdata.getColumnName(1), Mdata.getColumnName(2), Mdata.getColumnName(3), Mdata.getColumnName(4), Mdata.getColumnName(5), Mdata.getColumnName(6), Mdata.getColumnName(7)};
      writer.writeNext(line1);
      String data[] = new String[7];
      while(rs.next()) {
         data[0] = rs.getString("name");
         data[1] = rs.getString("contact_no");
         data[2] = rs.getString("email_id");
        
         data[3] = rs.getString("password");
         data[4] = rs.getString("address");
         data[5] = rs.getString("request_status");
         data[6] = rs.getString("payment_status");
         writer.writeNext(data);
      }
      //Flushing data from writer to file
      writer.flush();
      System.out.println("Data entered");
   }

    
}
