/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.TodayMdata;
import DB.DBConnection;
import DTO.todayMBean;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
/**
 *
 * @author DELL
 */
public class TodayMealServlet extends HttpServlet {

    private final String UPLOAD_DIRECTORY = "F:\\Food Factory\\Food Factory\\web\\images\\";
 int maxFileSize = 500000 * 1024;
  int maxMemSize = maxFileSize;

    
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             MultipartRequest mreq = new MultipartRequest(request, UPLOAD_DIRECTORY, maxFileSize);
            String item1=mreq.getParameter("i1");
             String item2=mreq.getParameter("i2");
             String item3=mreq.getParameter("i3");
            String mimg=mreq.getParameter("ImageFile");
            
            PrintWriter out=response.getWriter();
             todayMBean tb=new todayMBean();
             tb.setitem1(item1);
             tb.setitem2(item2);
             tb.setitem3(item3);
             
             Enumeration files = mreq.getFileNames();
            while (files.hasMoreElements()) { 
			   String name =(String)files.nextElement();
		       String fileName = mreq.getFilesystemName(name);
		      tb.setimg(fileName);
		       	}
             
             TodayMdata td=new TodayMdata();
         
             boolean d=td.insert(tb);
               if(d)
                {
                    td.delete(tb);
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Meal added successfully');");  
                    out.println("location='Admin/admin.jsp#todayMe';");
                    out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Problem in updation');");
                    out.println("location='Admin/admin.jsp#todayMe';");
                    out.println("</script>");
                }
           
        
    }


   
  
    }
