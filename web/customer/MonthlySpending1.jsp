<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
      <!-- Header-->
     
     <%@include file="header2.jsp" %>
      <!-- Header-->
      <%
    session=request.getSession(false);
    if(session.getAttribute("contact")==null)
    {
       out.println("<script type=\"text/javascript\">");
                    out.println("alert('Pls login first');");  
                    out.println("location='../logIn.jsp';");
                    out.println("</script>");
    }
    else{ 
     Connection con=DBConnection.getConnection();
     
%>
<div class="limiter" >
      <div  class="container-login"  >
          <div class="wrap-login logwrap" style="width:80%">
          <div class="text-center">
           <div class="container">
                <h2 style="margin-top: -1%;">Monthly Expense</h2>
          </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
        <table class="table table-bordered" id="myTable" width="100%" cellspacing="0">
            <thead>
                <tr>
                    <th>Date</th>
                    <th>Restarent name</th>
                    <th>Comment</th>
                    <th>Price</th>
                    <th></th>
                    <th></th>
                    
                </tr>
            </thead>
            
            <tbody>
                
          
                <%
                try{
                    String content1="";
                    String dt="";
                    int it=0;
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String string  = dateFormat.format(new Date());
                    int sub1=Integer.parseInt(string.substring(5,7));
                    int yr1=Integer.parseInt(string.substring(0,4));
                    PreparedStatement ps=con.prepareStatement("select * from month_expense where contact_no=? order by date1 desc");
                    ps.setString(1, (String)session.getAttribute("contact"));
                   String sp="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        dt=rs.getString("date1");
                        int sub2=Integer.parseInt(dt.substring(5,7));
                         int yr2=Integer.parseInt(dt.substring(0,4));
                        if(sub2!=sub1 || yr1!=yr2){
                              
                           content1+="<pre><h3><b>Date:</b> "+dt+"  |  <b>Restaurent:</b> "+rs.getString("restaurent")+"  |  <b>Comment:</b> "+rs.getString("comment")+"  |  <b>Price:</b> "+rs.getString("price")+"</h3></pre>";
                          
                            it++;  
                             PreparedStatement ps1=con.prepareStatement("delete from month_expense where contact_no=? and date1=?");
                             ps1.setString(1, (String)session.getAttribute("contact"));
                             ps1.setString(2, dt);
                             int rs1=ps1.executeUpdate();
                            }
                        else{
                %>
                <tr>
                    <td><%= dt%></td>
                    <td><%=rs.getString("restaurent") %></td>
                    <td><%=rs.getString("comment") %></td>
                    <td><%=rs.getString("price") %></td>
                     <td><div class="text-center w-full b1">
                    <a href="ChangeTransction.jsp?date1=<%=dt%>" class="bt1" >Change</a></div></td>
                    <td><div class="text-center w-full b1">
                     <a href="DeleteTransaction.jsp?date1=<%=dt%>" class="bt2" >Delete</a></div></td>
                     
                </tr>
                  <%
                      }
}
if(it>1){
     RequestDispatcher rd=request.getRequestDispatcher("../MonthlyEmail1?cont="+(String)session.getAttribute("contact")+"&content1="+content1);
                             rd.forward(request, response);
}
                      PreparedStatement ps2=con.prepareStatement("select sum(price) as sumprice from month_expense where contact_no=? ");
                      ps2.setString(1, (String)session.getAttribute("contact"));
                      ResultSet rs2=ps2.executeQuery();
                      while(rs2.next()){
     %>
      <tr>
                    <td></td>
                    <td></td>
                    <td><b>Sum:</b></td>
                    <td><%=rs2.getString("sumprice") %></td>
                     <td></td>
                    
                </tr>
                 <tr>
                    <td></td>
                    <td colspan="2"><div class="text-center w-full b1">
                    <a href="AddTransaction.jsp?date1=<%=string%>" class="bt3" >Add new expense</a></div></td>
                    <td></td>
                     <td></td>
                    
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
<%@include file="footer.jsp" %>
 