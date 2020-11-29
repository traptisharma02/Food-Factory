
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DB.DBConnection"%>
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
    
%> 
 <div class="limiter" style="height: 225%">
      <div  class="container-login"  >
          <div class="wrap-login logwrap" style="margin-top: 20%;width:80%">
          <div class="text-center">
           <div class="container">
                <h2 style="margin-top: -1%;">Today's Deliveries</h2>
          </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
        <table class="table table-bordered" id="myTable" width="100%" cellspacing="0">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Contact-No.</th>
                    <th>Address</th>
                    <th></th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <th>Name</th>
                    <th>Contact-No.</th>
                    <th>Address</th>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
            </tfoot>
            <tbody>
                <%
              Connection con=DBConnection.getConnection();
             try{
                     PreparedStatement ps2=con.prepareStatement("delete from customer_plan where planDueDate < curdate()");
                     
                    PreparedStatement ps=con.prepareStatement("select user.name,user.contact_no,user.address from (( customer_plan join user on user.contact_no=customer_plan.contact_no) join meal on meal.category=customer_plan.plan) where user.payment_status=1 and customer_plan.delivery>0 and customer_plan.last_delivery<curdate();");
                     ps2.executeUpdate();
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("name") %></td>
                    <td><%=rs.getString("contact_no") %></td>
                    <td><%=rs.getString("address") %></td>
                     <td><div class="text-center w-full b1">
                     <a href="ViewDetails.jsp?cont=<%=rs.getString("contact_no")%>" class="bt3">View Details</a></div></td>
                    <td><div class="text-center w-full b1">
                     <a href="todayPerform.jsp?res=<%="deliver"%>&cont=<%=rs.getString("contact_no")%>" class="bt1">Deliver today</a></div></td>
                     <td><div class="text-center w-full b1">
                     <a href="todayPerform.jsp?res=<%="noDeliver"%>&cont=<%=rs.getString("contact_no")%>" class="bt2">No delivery today</a></div></td>
                </tr>
             <%
                        }con.close();
                        }catch(Exception e){e.printStackTrace();}
}
                    %>
            </tbody>
        </table>
    </div></div></div></div></div>
<%@include file="footer4.jsp" %>
 