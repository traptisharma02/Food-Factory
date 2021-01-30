
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
     String date1=request.getParameter("date1");
     String cont=(String)session.getAttribute("contact");
%>
 <div class="limiter" >
     <div  class="container-login"  >
          <div class="wrap-login logwrap" >
          <div class="text-center">
               <div class="container">
                <h2>Add Expense</h2>
                 </div>
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
    <div class="container">
          <form action="../AddTransaction" class="login-form" method="post" name="f1" onsubmit="return validate();">

            <div class="my-2 ml-2"><span>Date</span></div>
            <div class="wrap-input">
                <input type="text" name="date" class="inputcustom" id="date" value="<%= date1%>" required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Restaurent</span>  
            </div>
            <div class="wrap-input">
              <input type="text" name="restaurent" class="inputcustom" required=""/>
            </div>
             <div class="my-2 ml-2"><span>Comment</span></div>
            <div class="wrap-input">
                <input type="text" name="comment" id="comment" class="inputcustom" required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Price</span>  
            </div>
            <div class="wrap-input">
                <input type="text" name="price" id="price" class="inputcustom" required=""/>
            </div>
                   <input type="hidden" name="contact" id="contact" value="<%= cont%>" class="inputcustom" />
             
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
               <div class="text-center w-full b1"><br><center>
                     <input type="submit" value="Add" class="btn btn-ghost"></div>
                  
          </form>
                </div></div></div></div>
           <%
               }
           %>           
<%@include file="footer.jsp" %>
 