/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class DBConnection implements DBProperties {
    static Connection con;
    public static Connection getConnection(){
        try {
            Class.forName(Driver);
            con=DriverManager.getConnection(url, un, pw);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
