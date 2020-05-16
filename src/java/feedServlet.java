/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.FeedData;
import DTO.CusLogBean;
import com.oreilly.servlet.MultipartRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class feedServlet extends HttpServlet {
    private final String UPLOAD_DIRECTORY = "F:\\Food Factory\\Food Factory\\web\\images\\";
 int maxFileSize = 500000 * 1024;
  int maxMemSize = maxFileSize;
      protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          HttpSession session=request.getSession(false);  
             String Uname=(String)session.getAttribute("name");  
             String phone=(String)session.getAttribute("contact");  
             MultipartRequest mreq = new MultipartRequest(request, UPLOAD_DIRECTORY, maxFileSize);
            String msg=mreq.getParameter("feedback");
           
            PrintWriter out=response.getWriter();
            CusLogBean tb=new CusLogBean();
             tb.setMsg(msg);
             tb.setName(Uname);
             tb.setPh1(phone);
             Enumeration files = mreq.getFileNames();
            while (files.hasMoreElements()) { 
			   String name =(String)files.nextElement();
		       String fileName = mreq.getFilesystemName(name);
		      tb.setImg(fileName);
		       	}
             FeedData td=new FeedData();
         
             boolean d=td.insert(tb);
               if(d)
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Feedback added successfully');");  
                    out.println("location='customer/feedback.jsp';");
                    out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Problem in giving feedback');");
                    out.println("location='customer/feedback.jsp';");
                    out.println("</script>");
                }
      }
}
