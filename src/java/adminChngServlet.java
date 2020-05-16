
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
public class adminChngServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String category=request.getParameter("category");
             String price=request.getParameter("price");
             String validity=request.getParameter("validity");
             String inter=request.getParameter("mealInt");
             String orderTiming=request.getParameter("orderTime");
             String accessNew=request.getParameter("accessN");
             String freeDelivery=request.getParameter("freeD");
             if(category!=null){
             Connection con=DBConnection.getConnection();
             PrintWriter out = response.getWriter();  
             
             try{
                    PreparedStatement ps=con.prepareStatement("update meal set category=?,price=?,validity=?,inter=?,orderTiming=?,accessNew=?,freeDelivery=? where category='"+category+"'");
                    ps.setString(1, category);
                    ps.setString(2, price);
                    ps.setString(3, validity);
                    ps.setString(4, inter);
                    ps.setString(5,orderTiming);
                    ps.setString(6,accessNew);
                    ps.setString(7,freeDelivery);
                    int i=ps.executeUpdate();
                   if(i > 0)
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Plan updated sucessfully');");  
                    out.println("location='Admin/admin.jsp#planChg';");
                    out.println("</script>");
                    }
                    else
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Problem in updation');");
                   out.println("location='Admin/ChngPlan.jsp';");
                     out.println("</script>");
                    }
}
                    catch(Exception e){}
}
     
    }

}
