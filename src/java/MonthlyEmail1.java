import DAO.*;
import DB.DBConnection;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.*;

public class MonthlyEmail1 extends HttpServlet {
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         Connection con=DBConnection.getConnection();
        String cont=request.getParameter("cont");
        String content1=request.getParameter("content1");
        String to="";
         try{
                PreparedStatement ps=con.prepareStatement("select * from user where contact_no="+cont);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        to=rs.getString("email_id");
                    }
                    }
             catch(Exception e){System.out.println(e);}
              response.setContentType("text/html;charset=UTF-8");
       
                    String subject = "Last month trasaction";
                    String message =  "Following are last month transaction";
                    String user ="foodFactory432@gmail.com";
                    String pass = "food`1234567890-=";
                    MonthlyEmail.send(to,subject, message, user, pass,cont,content1);
                     out.println("<script type=\"text/javascript\">");
                    out.println("alert('Email is send to your email-id');");  
                    out.println("location='MonthlySpending1.jsp';");
                    out.println("</script>");
                        }
        
    }   