import DAO.NewsLetData;
import DTO.NewsLetBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewsLetServlet extends HttpServlet {
     protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String name=request.getParameter("name");
     String email=request.getParameter("email");
     String findUs=request.getParameter("find-us");
     String news="false";
     if(request.getParameter("news")!=null)
         news="true";
     String message=request.getParameter("message");
      PrintWriter out = response.getWriter();  
     
     
     NewsLetBean reg=new NewsLetBean();
     reg.setName1(name);
     reg.setEmail(email);
     reg.setFindus(findUs);
     reg.setNews(news);
     reg.setMsg(message);
     NewsLetData s1=new NewsLetData();
     boolean c1=s1.check(reg);
     if(c1){
         out.println("<script type=\"text/javascript\">");
       out.println("alert('Already requested for newsletter');");
       out.println("</script>");        
       RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
       rd.include(request, response);
     }
     else{
        boolean b1=s1.insert(reg);
     if(b1)
     {
         out.println("<script type=\"text/javascript\">");
       out.println("alert('Requested for newsletter successfully');");
       out.println("</script>");        
       RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
       rd.include(request, response);
     }
     else{
         out.println("<script type=\"text/javascript\">");
       out.println("alert('Requested for newsletter unsuccessful');");
       out.println("</script>");        
       RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
       rd.include(request, response);
     }
        }
    }
  
}
