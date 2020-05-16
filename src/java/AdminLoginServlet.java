
import DAO.AdminLogData;
import DAO.CusLogData;
import DB.DBConnection;
import DTO.CusLogBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLoginServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String phone=request.getParameter("contact");
     String passwd=request.getParameter("password");
      PrintWriter out = response.getWriter();  
      
      CusLogBean reg=new CusLogBean();
      reg.setPh1(phone);
      reg.setPw1(passwd);
      
      AdminLogData cl=new AdminLogData();
     boolean b1=cl.insert(reg);
     if(b1){
           String name="";
            
            Connection con=DBConnection.getConnection();
             try{
                PreparedStatement ps=con.prepareStatement("select * from user where contact_no="+phone);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        name=rs.getString("name");
                    }
                    }
             catch(Exception e){System.out.println(e);}
              HttpSession session=request.getSession();  
            session.setAttribute("contact",phone); 
            session.setAttribute("name",name); 
         response.sendRedirect("Admin/admin.jsp");
     }
     else{
         out.println("<script type=\"text/javascript\">");
       out.println("alert('Invalid username or password');");
       out.println("</script>");        
       RequestDispatcher rd=request.getRequestDispatcher("ALoginIn.jsp");
       rd.include(request, response);
    }
    }
}

