import DAO.*;
import DB.DBConnection;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.*;

public class SendEmail extends HttpServlet {
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        
        String to=request.getParameter("mail");
              response.setContentType("text/html;charset=UTF-8");
       
                    String subject = "Forget password";
                    String message =  "Reset password using the link given below:";
                    String user ="traptitrisha@gmail.com";
                    String pass = "trapti18c3192@";
                    SendMail.send(to,subject, message, user, pass);
                     out.println("<script type=\"text/javascript\">");
                    out.println("alert('Email is send to your email-id plz chnge your password');");  
                    out.println("location='logIn.jsp';");
                    out.println("</script>");
                        }
        
    }   
