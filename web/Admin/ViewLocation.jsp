<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
  <%@include file="header4.jsp" %>
      <!-- Header-->
      <%
    session=request.getSession(false);
    if(session.getAttribute("contact")==null)
    {
       out.println("<script type=\"text/javascript\">");
                    out.println("alert('Pls login first');");  
                    out.println("location='../ALoginIn.jsp';");
                    out.println("</script>");
    }
    else{ 
     Connection con=DBConnection.getConnection();
     String contact= request.getParameter("cont");
%>
 <%
             try{
                  
                    PreparedStatement ps=con.prepareStatement("select * from user where user.contact_no='"+contact+"'");
                    
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        %>
 <div class="limiter" >
      <div  class="container-login"  >
          <div class="wrap-login logwrap" style="margin-top: 20%;width:80%">
          <div class="text-center">
               <div class="container">
                <h2 style="margin-top: -1%;">View <%=rs.getString("name")%>'s <h3>location</h3></h2>
                
                 </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
                 <iframe width="100%" height="500" src="https://maps.google.com/maps?q=<%=rs.getFloat("latitude")%>,<%=rs.getFloat("longtitude")%>&output=embed"></iframe>
                </div></div></div></div>
          <%
                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    %> 
                    <%
                        }
                    %>
<%@include file="footer4.jsp" %>
 