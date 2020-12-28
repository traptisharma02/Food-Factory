<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
  <%@include file="header2.jsp" %>
      <!-- Header-->
       <script> 
		function getlocation(){ 
				navigator.geolocation.getCurrentPosition(showLoc); 
		} 
		function showLoc(pos){ 
				document.getElementById("address1").value=pos.coords.latitude;
				document.getElementById("address2").value= pos.coords.longitude;         
			} 
		</script>
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
          <div class="wrap-login logwrap" >
          <div class="text-center">
               <div class="container">
                <h2>Update <%=rs.getString("name")%>'s details</h2>
                
                 </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
          <form action="../ChangeProfileServlet" class="login-form" method="post" name="f1" onsubmit="return validate();">

            <div class="my-2 ml-2"><span>Name</span></div>
            <div class="wrap-input">
                <input type="text" name="username" class="inputcustom" id="username" value="<%=rs.getString("name")%>" required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Contact-No.</span>  
            </div>
            <div class="wrap-input">
              <input type="text" name="contact" id="contact" class="inputcustom" value="<%=rs.getString("contact_no")%> " readonly="" />
            </div>
             <div class="my-2 ml-2">
              <span>Email-Id</span>  
            </div>
            <div class="wrap-input">
              <input type="email" name="email" class="inputcustom" value="<%=rs.getString("email_id")%>" required=""/>
            </div>
             <div class="my-2 ml-2"><span>Password</span></div>
            <div class="wrap-input">
                <input type="password" name="password" id="password" class="inputcustom" value="<%=rs.getString("password")%>"  required=""/>
            </div>
            
              <div class="my-2 ml-2"><span>Address</span></div>
            <div class="wrap-input">
                <input type="text" name="address1" id="address1" class="inputcustom" value="<%=rs.getString("latitude")%>"  style="width:48%" />
                <input type="text" name="address2" id="address2" class="inputcustom" value="<%=rs.getString("longtitude")%>"  style="width:48%;margin-top: -40px;margin-left: 50%"  />
             </div>  
                 <div class="text-center w-full b1">
                         <i class="fa fa-map-marker-alt" style="font-size: 20px"></i>&nbsp<input type="button" onclick="getlocation()" value="Select current location"  class="btn btn-ghost"></div>
            
             
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
 