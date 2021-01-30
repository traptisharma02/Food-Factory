<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
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
     String date1=request.getParameter("date1");
%>
 <%
             try{
                    PreparedStatement ps=con.prepareStatement("select * from month_expense where contact_no=? and date1=?");
                    ps.setString(1, (String)session.getAttribute("contact"));
                    ps.setString(2, date1);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        %>
 <div class="limiter" >
     <div  class="container-login"  >
          <div class="wrap-login logwrap" >
          <div class="text-center">
               <div class="container">
                <h2>Update Expense</h2>
                
                 </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
          <form action="../ChangeTransaction" class="login-form" method="post" name="f1" onsubmit="return validate();">

            <div class="my-2 ml-2"><span>Date</span></div>
            <div class="wrap-input">
                <input type="text" name="date" class="inputcustom" id="date" value="<%=rs.getString("date1")%>" required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Restaurent</span>  
            </div>
            <div class="wrap-input">
              <input type="text" name="restaurent" class="inputcustom" value="<%=rs.getString("restaurent") %>" required=""/>
            </div>
             <div class="my-2 ml-2"><span>Comment</span></div>
            <div class="wrap-input">
                <input type="text" name="comment" id="comment" class="inputcustom" value="<%=rs.getString("comment") %>"  required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Price</span>  
            </div>
            <div class="wrap-input">
                <input type="text" name="price" id="price" class="inputcustom" value="<%=rs.getString("price") %>"  required=""/>
            </div>
                   <input type="hidden" name="contact" id="contact" class="inputcustom" value="<%=rs.getString("contact_no") %>"/>
             
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
               <div class="text-center w-full b1"><br><center>
                     <input type="submit" value="Update" class="btn btn-ghost"></div>
                  
          </form>
                </div></div></div></div>
          <%
                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    %> 
                    <%
                        }
                    %>
<%@include file="footer.jsp" %>
 