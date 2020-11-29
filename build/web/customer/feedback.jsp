
<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body style="margin-top: -.8%">
      <!-- Header -->
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
    else{ %>
    <div class="limiter" >
      <div  class="container-login"  >
        <div class="wrap-login" >
          <div class="text-center">
              
            <div class="container">
                <h2 style="margin-top: -5%;">Feedback</h2>
          </div>
              <form action="../feedServlet" class="login-form" enctype="multipart/form-data" method="post">
                <div class="my-2 ml-2"><span>Your picture</span></div>
            <div class="wrap-input">
                        <div class="container">
                             <p><img id="output"  width="200" src="../resources/img/upload.png" /></p>
                              <input type="file" class="inputcustom " accept="image/*" id="ImageFile" onchange="loadFile(event)" oninput="this.className = ''" name="ImageFile"  style="width: 100%">

                                             
                                            <script>
                                                                   var loadFile = function(event) {
                                                                       var image = document.getElementById('output');
                                                                       image.src = URL.createObjectURL(event.target.files[0]);
                                                                   };
                                            </script>
                                     </div>
                 <script>
                                     var loadFile = function(event) {
                                             var image = document.getElementById('output');
                                             image.src = URL.createObjectURL(event.target.files[0]);
                                     };
              </script>
            </div>
              
              <div class="my-2 ml-2"><span>Feedback</span></div>
            <div class="wrap-input">
                <textarea name="feedback" class="inputcustom" style="width: 100%"></textarea>
            </div>
              
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
              
             <div class="text-center w-full b1"><br><center>
                     <input type="submit" value="Send" class="btn btn-ghost"></center></div>
           
          </form>
        </div>
      </div>
    </div>
    </div>
    <% }%>
        <!-- Footer -->
 <%@include file="../footer.jsp" %>