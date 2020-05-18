
import DB.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class chngpassServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
             String email=request.getParameter("email");
             String pass=request.getParameter("new_password");
             if(email!=null){
             Connection con=DBConnection.getConnection();
             PrintWriter out = response.getWriter();  
             
             try{
                    PreparedStatement ps=con.prepareStatement("update user set password='"+pass+"' where email_id='"+email+"'");
                    
                    int i=ps.executeUpdate();
                   if(i > 0)
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Password changed');");  
                    out.println("location='logIn.jsp';");
                    out.println("</script>");
                    }
                    else
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Problem in changing password');");
                   out.println("location='logIn.jsp';");
                     out.println("</script>");
                    }
}
                    catch(Exception e){}
}
     
    }

}
