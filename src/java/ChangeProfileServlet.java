/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.SignUpData;

import DAO.UpdateProfile1;
import DTO.RegBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ChangeProfileServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String name=request.getParameter("username");
     String phone=request.getParameter("contact");
     String email=request.getParameter("email");
     String passwd=request.getParameter("password");
     Float addr1=Float.parseFloat(request.getParameter("address1"));
     Float addr2=Float.parseFloat(request.getParameter("address2"));
      PrintWriter out = response.getWriter();  
     
     RegBean reg=new RegBean();
     reg.setName1(name);
     reg.setAdd1(addr1);
     reg.setAdd2(addr2);
     reg.setPh1(phone);
     reg.setEmail(email);
     reg.setPw1(passwd);
     UpdateProfile1 s1=new UpdateProfile1();
     
      String name1= reg.getName1();
            String contact=reg.getPh1();
            String email1=reg.getEmail();
            String password=reg.getPw1();
            Float address1=reg.getAdd1();
            Float address2=reg.getAdd2();
  
        
        boolean b1=s1.update1(reg);
        
     if(b1)
         response.sendRedirect("customer/ChangeProfile.jsp?cont="+contact);
     else{
         out.println("<script type=\"text/javascript\">");
                    out.println("alert('Pls login first');");  
                    out.println("location='customer/ChangeProfile.jsp?cont="+contact+"';");
                    out.println("</script>");
     }
        
 }
}
