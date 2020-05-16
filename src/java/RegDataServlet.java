/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.SignUpData;
import DTO.RegBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegDataServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String name=request.getParameter("username");
     String phone=request.getParameter("contact");
     String email=request.getParameter("email");
     String passwd=request.getParameter("password");
     String addr=request.getParameter("address");
      PrintWriter out = response.getWriter();  
     
     
     RegBean reg=new RegBean();
     reg.setName1(name);
     reg.setAdd1(addr);
     reg.setPh1(phone);
     reg.setEmail(email);
     reg.setPw1(passwd);
     SignUpData s1=new SignUpData();
     boolean c1=s1.check(reg);
     if(c1){
         out.println("<script type=\"text/javascript\">");
       out.println("alert('Information submitted is already present in database');");
       out.println("</script>");        
       RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
       rd.include(request, response);
     }
     else{
        boolean b1=s1.insert(reg);
     if(b1)
         response.sendRedirect("PendingReq.jsp");
     else{
         out.println("<script type=\"text/javascript\">");
       out.println("alert('insertion unsucessfull');");
       out.println("</script>");        
       RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
       rd.include(request, response);
     }
        }
    }
}
