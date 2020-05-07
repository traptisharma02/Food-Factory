<%-- 
    Document   : signup
    Created on : 6 May, 2020, 6:21:18 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body style="margin-top: -.8%">
      <!-- Header -->
      <%@include file="header.jsp" %>
      <!-- Header-->

    <div class="limiter" >
      <div  class="container-login"  >
        <div class="wrap-login" >
          <div class="text-center">
            <div class="container">
                <h2 style="margin-top: -5%;">Sign Up</h2>
          </div>
          <form action="#" class="login-form">

            <div class="my-2 ml-2"><span>Name</span></div>
            <div class="wrap-input">
              <input type="text" name="username" class="inputcustom" />
            </div>
             <div class="my-2 ml-2">
              <span>Contact-No.</span>  
            </div>
            <div class="wrap-input">
              <input type="text" name="contact" class="inputcustom" />
            </div>
             <div class="my-2 ml-2">
              <span>Email-Id</span>  
            </div>
            <div class="wrap-input">
              <input type="email" name="email" class="inputcustom" />
            </div>
             <div class="my-2 ml-2"><span>Password</span></div>
            <div class="wrap-input">
                <input type="password" name="password" class="inputcustom" />
            </div>
             <div class="my-2 ml-2">
              <span>Confirm Password</span>  
            </div>
            <div class="wrap-input">
              <input type="password" name="confirm-password" class="inputcustom" />
            </div>
             <div class="text-center w-full b1"><br><center>
                     <a href="#" class="btn btn-ghost">Sign up now</a></center></div>
            <div class="text-center w-full b2"><center>
              <span class="text2">Already a member?</span>
              <a href="logIn.jsp" class="text2 signup">SIGN In</a></center>
            </div>
          </form>
        </div>
      </div>
    </div>
    </div>
        <!-- Footer -->
 <%@include file="footer.jsp" %>