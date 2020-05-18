
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>

 
<body style="margin-top: -.8%">
      <!-- Header -->
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
<%@include file="header3.jsp" %>
    <div class="limiter" >
      <div  class="container-login"  >
        <div class="wrap-login" >
          <div class="text-center">
              
            <div class="container">
                <h2 style="margin-top: -5%;">Sign Up</h2>
          </div>
                <%
                    String category=request.getParameter("category");
            try{
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from meal where category='"+category+"'" );
                    while(rs.next()){
                %>
           <form method="post" action="../adminChngServlet" >
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="category">Category</label>
                        </div>
                      <div class="col span-2-of-3">
                          <input type="text" name="category" id="category" value="<%=rs.getString("category") %>" readonly="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Price</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="price" id="price" value="<%=rs.getString("price") %>">
                        </div>
                    </div>
                        <div class="row">
                        <div class="col span-1-of-3">
                            <label for="time">Plan's validity</label>
                        </div>
                        <div class="col span-2-of-3">
                            
                            <input type="text" name="validity" id="validity" value="<%=rs.getString("validity") %>">
                      
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="mealInt">Meal interval</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="mealInt" id="mealInt" value="<%=rs.getString("inter") %>">
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="orderTime">Order Time</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="orderTime" id="orderTime" value="<%=rs.getString("orderTiming") %>">
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label>Access to newest creation</label>
                        </div>
                         <div class="col span-2-of-3">
                            <input type="text" name="accessN" id="accessN" value="<%=rs.getString("accessNew") %> ">
                        </div>
                     </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Free delivery</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="freeD" id="freeD" value="<%=rs.getString("freeDelivery") %>">
                        </div>

                    </div>
                         <div class="text-center w-full "><br><center>
                                 <input type="submit" value="Change Plan" class="btn btn-ghost"></center></div>
                </form>
        </div>
      </div>
    </div>
           <%
                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    %>
      </div>
        <!-- Footer -->
        <%
            }
        %>
 <%@include file="../footer.jsp" %>