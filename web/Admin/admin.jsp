<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.DBConnection"%>

<!DOCTYPE html>

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

 <%@include file="header3.jsp" %>
            <div class="hero-text-box">
                <h1>WELCOME<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Admin</h1>
                <a class="btn btn-full js--scroll-to-plans" href="#planChg">Change plan</a>
                <a class="btn btn-ghost js--scroll-to-start" href="#todayM">Add Today's Meal</a>
            </div>
            
</header>
        
        <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
        
        <section class="section-form js--section-plans" id="planChg">
            
            <div class="row">
                <h2>Change plans </h2>
            </div>
            
            <div class="row">
                <%
             
             try{
                    PreparedStatement ps=con.prepareStatement("select * from meal");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>
                <div class="col span-1-of-3">
                    <div class="plan-box js--wp-4">
                        <div>
                            <h3><%=rs.getString("category") %></h3>
                            <p class="plan-price">$<%=rs.getString("price") %><span><%=rs.getString("validity") %></span></p>
                            <%
                                int oneP=0;
                                if(rs.getString("inter").equals("1"))
                                    oneP=(Integer.parseInt(rs.getString("price")));
                                else if(rs.getString("inter").equals("3"))
                                    oneP=(Integer.parseInt(rs.getString("price")))/3;
                                else
                                    oneP=(Integer.parseInt(rs.getString("price")))/30;
                            %>
                            <p class="plan-price-meal">That's only <%= oneP%> per meal</p>
                        </div>
                        <div>
                            <ul>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Total&nbsp;<%=rs.getString("inter") %> meal</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("orderTiming") %></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("accessNew") %></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("freeDelivery") %></li>
                            </ul>
                        </div>
                        <div>
                            <a href="ChngPlan.jsp?category=<%=rs.getString("category") %>" class="btn btn-ghost">Update Plan</a>
                            
                        </div>
                     </div>
               
                            </div>
                    <%
                        }
                       
                        }catch(Exception e){e.printStackTrace();}
                    %>
            </div>
        </section>
             
         <section class="section-steps" id="todayM">
            <div class="row">
                <h2>Add Today's Meal</h2>
            </div>
             <form method="post" action="../TodayMealServlet" class="contact-form" id="todayMe" enctype="multipart/form-data">
                    <div class="row">
                        <center> 
                       <div class="col span-3-of-3" >
                                             <script>
                                     var loadFile = function(event) {
                                             var image = document.getElementById('output');
                                             image.src = URL.createObjectURL(event.target.files[0]);
                                     };
                                     </script>
                                     <div class="container">
                             <p><img id="output" width="200" src="../resources/img/upload.png" /></p>
                              <input type="file" class="inputcustom " accept="image/*"  onchange="loadFile(event)" oninput="this.className = ''" name="ImageFile" id="ImageFile" style="width: 35%">

                                             
                                            <script>
                                                                   var loadFile = function(event) {
                                                                       var image = document.getElementById('output');
                                                                       image.src = URL.createObjectURL(event.target.files[0]);
                                                                   };
                                            </script>
                                     </div></div>
                        </center>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="i1">Item 1</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="i1" id="i1" placeholder="Enter Item 1 name">
                        </div>
                    </div>
                         <div class="row">
                        <div class="col span-1-of-3">
                            <label for="i2">Item 2</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="i2" id="i2" placeholder="Enter Item 2 name">
                        </div>
                    </div>
                <div class="row">
                        <div class="col span-1-of-3">
                            <label for="i3">Item 3</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="i3" id="i3" placeholder="Enter Item 3 name">
                        </div>
                    </div>
                    </div>
                         <div class="text-center w-full "><br><center>
                      <input type="submit" value="Add Meal" class="btn btn-ghost"></center></div>
                </form>
        </section>
   <%
       }
   %>
          <!-- Footer Links -->
<%@include file="../footer.jsp" %>