<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>

<%@page import="DB.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
          <div class="wrap-login " >
         
        
      
            <div class="row">
                <h2>View Existing Customers </h2>
            </div>
        <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
            <div class="row">
               
                <form method="post" action="#" >
                     <%
             try{
                  String contact= request.getParameter("cont");
                    PreparedStatement ps=con.prepareStatement("select * from (( customer_plan join user on user.contact_no=customer_plan.contact_no) join meal on meal.category=customer_plan.plan) where user.contact_no='"+contact+"'");
                    
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>
                
                  <div class="row">
                        <div class="col span-1-of-3">
                            <label for="Name">Name</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="name" id="name" placeholder="Enter Name" value="<%=rs.getString("name")%>" readonly="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Contact-No.</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="contact" id="contact" placeholder="Enter Contact Number" value="<%=rs.getString("contact_no")%>" readonly="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="email">Email</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="email" id="email" placeholder="Enter Email" value="<%=rs.getString("email_id")%>" readonly="">
                        </div>
                    </div>
                   
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="planc">Plan</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="planc" id="planc" placeholder="Enter plan category" value="<%=rs.getString("plan")%>" readonly="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Price</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="price" id="price" placeholder="Enter Price" value="<%=rs.getString("price")%>" readonly="">
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="selectedD">Plan selected at</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="selectedD" id="selectedD" value="<%=rs.getString("planSelectDate")%>" readonly>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="due">Plan due date</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="due" id="due" value="<%=rs.getString("planDueDate")%>" readonly>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="exFeatures">Other features</label>
                        </div>
                        <div class="col span-2-of-3">
                            <textarea name="exFeatures" id="exFeatures"  readonly >Total &nbsp;<%=rs.getString("inter")%>meal. <%=rs.getString("orderTiming")%> . <%=rs.getString("accessNew")%>. <%=rs.getString("freeDelivery")%> . </textarea>
                        </div>

                    </div>
                         <div class="row">
                        <div class="col span-1-of-3">
                            <label>Address</label>
                        </div>
                        <div class="col span-2-of-3">
                            <div class="text-center w-full b2">
                                <h4><a href="ViewLocation.jsp?cont=<%=rs.getString("contact_no")%>" class="text2 signup" style="color: #e67e22"><i class="fa fa-map-marker-alt" style="font-size: 20px"></i>&nbsp;&nbsp;View location on map</a></h4>
                              </div>
                        </div>
                    </form> </div>
                <%
                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    %> 
            </div>
            </div></div>
   <%
       }
   %>
          <!-- Footer Links -->
<%@include file="../footer.jsp" %>