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
%>
 <div class="limiter" style="height: 225%">
      <div  class="container-login"  >
          <div class="wrap-login logwrap" style="margin-top: 20%;width:80%">
          <div class="text-center">
           <div class="container">
                <h2 style="margin-top: -1%;">view user request</h2>
          </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
        <table class="table table-bordered" id="myTable" width="100%" cellspacing="0">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Contact-No.</th>
                    <th>Email-Id</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <th>Name</th>
                    <th>Contact-No.</th>
                    <th>Email-Id</th>
                    <th></th>
                    <th></th>
                </tr>
            </tfoot>
            <tbody>
                <%
                try{
                    PreparedStatement ps=con.prepareStatement("select * from user where request_status=0");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("name") %></td>
                    <td><%=rs.getString("contact_no") %></td>
                    <td><%=rs.getString("email_id") %></td>
                    
                     <td><div class="text-center w-full b1">
                     <a href="AppCPerform.jsp?res=<%="accept"%>&cont=<%=rs.getString("contact_no")%>" class="bt1" >Accept</a></div></td>
                    <td><div class="text-center w-full b1">
                     <a href="AppCPerform.jsp?res=<%="reject"%>&cont=<%=rs.getString("contact_no")%>" class="bt2">Reject</a></div></td> 
                </tr>
                  <%
                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    %>
               
            </tbody>
        </table>
    </div></div></div></div></div>
                    <%
                        }
                    %>
<%@include file="footer4.jsp" %>
 