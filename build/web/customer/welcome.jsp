<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
 <%@include file="header2.jsp" %>
            <div class="hero-text-box">
                
                <h1>WELCOME<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=(String)session.getAttribute("name") %></h1>
                <a class="btn btn-full js--scroll-to-plans" href="#plans">New Plans</a>
                <a class="btn btn-ghost js--scroll-to-start" href="#todayM">Today's meal</a>
            </div>
             
</header>
<button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
        <section class="section-plans js--section-plans" id="plans">
               
            <div class="row">
                <h2>Start eating healthy today</h2>
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
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Total &nbsp;<%=rs.getString("inter") %>meal</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("orderTiming") %></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("accessNew") %></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("freeDelivery") %></li>
                            </ul>
                        </div>
                        <div>
                            <a href="../planSelectServlet?cat=<%=rs.getString("category") %>" class="btn btn-ghost">Select</a>
                        </div>
                     </div>
               
                            </div>
                    <%
                        }
                       
                        }catch(Exception e){e.printStackTrace();}
                    %>
               
        </section>
        
        <section class="section-form" id="Uplan">
            <div class="row">
                <h2>Here are your existing plans </h2>
            </div>
            <div class="row">
                  <%
            
             try{
                   boolean st=false;
                    PreparedStatement ps=con.prepareStatement("select * from customer_plan c join meal where meal.category=c.plan and c.contact_no="+(String)session.getAttribute("contact"));
                    ResultSet rs=ps.executeQuery();
                   
                    while(rs.next()){
                        st=true;
                %>
                <form method="post" action="#" class="contact-form">
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="category">Category</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="category" id="category" value="<%=rs.getString("plan")%>" placeholder="No plan selected" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Price</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="price" id="price" value="<%=rs.getString("price")%> " placeholder="No plan selected" readonly>
                        </div>
                    </div>
                        <div class="row">
                        <div class="col span-1-of-3">
                            <label for="selectedD">Plan selected at</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="selectedD" id="selectedD" placeholder="No plan selected" value="<%=rs.getDate("planSelectDate")%>"readonly>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="due">Plan due date</label>
                        </div>
                         <div class="col span-2-of-3">
                            <input type="text" name="due" id="due"  placeholder="No plan selected"  value="<%=rs.getDate("planDueDate")%>" readonly>
                       
                         </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="exFeatures">Other features</label>
                        </div>
                        <div class="col span-2-of-3">
                            <textarea name="exFeatures" id="exFeatures" placeholder="No plan selected" readonly >Total <%=rs.getString("inter")%>meal. <%=rs.getString("orderTiming")%> . <%=rs.getString("accessNew")%>. <%=rs.getString("freeDelivery")%> . 
                            </textarea>
                        </div>

                    </div>
                    
                </form>
                 <%
                        }
                     if(!st){
                        %>
                        <center><h3>No existing plan...</h3></center>
                        <%
                    }
                
                        }catch(Exception e){e.printStackTrace();}
                    %>
            </div>
        </section>
          <section class="section-steps" id="todayM">
            <div class="row">
                <h2>Today's Meal</h2>
            </div>
           <form method="post" action="#" class="contact-form">
                               <%
                    
             try{
                    PreparedStatement ps=con.prepareStatement("select * from todaym");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>

                    <div class="row">
                        <center> 
                       <div class="col span-3-of-3" >
                                     <div class="container">
                                         <p class="meals-showcase clearfix"><img id="output" width="200" src="../images/<%=rs.getString("image") %>"  /></p>
                                     </div></div>
                        </center>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="i1">Item 1</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="i1" id="i1" placeholder="Enter Item 1 name" value="<%=rs.getString("item1") %>">
                        </div>
                    </div>
                         <div class="row">
                        <div class="col span-1-of-3">
                            <label for="i2">Item 2</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="i2" id="i2" placeholder="Enter Item 2 name" value="<%=rs.getString("item2") %>">
                        </div>
                    </div>
                <div class="row">
                        <div class="col span-1-of-3">
                            <label for="i3">Item 3</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="i3" id="i3" placeholder="Enter Item 3 name" value="<%=rs.getString("item3") %>">
                        </div>
                    </div>
                     
                </form>
            <%
                        }
                        
                        }catch(Exception e){e.printStackTrace();}
}
                    %>
        </section>
   
   
          <!-- Footer Links -->
<%@include file="../footer.jsp" %>