<!DOCTYPE html>
<body style="margin-top: -.5%"> 
<!-- Header -->
      <%@include file="header.jsp" %>
      <!-- Header-->
    <div class="limiter" style="height: 125%">
      <div style="margin-top: -5%;" class="container-login">
        <div class="wrap-login logwrap" style="margin-top: -7%;">
          <div class="text-center">
           <div class="container">
                <h2 style="margin-top: -1%;">Sign In</h2>
          </div>
          <form action="#" class="login-form">
            <div class="my-2 ml-2"><span>Username</span></div>
            <div class="wrap-input">
              <input type="text" name="username" class="inputcustom" />
            </div>
            <div class="my-2 ml-2">
              <span>Password</span>
              <a href="changePassword.jsp" class="forgot ml3">Forgot?</a>
            </div>
            <div class="wrap-input">
              <input type="password" name="password" class="inputcustom" />
            </div>
           <div class="text-center w-full b1"><br><center>
                     <a href="#" class="btn btn-ghost">Sign in now</a></center></div>
                     <div class="text-center w-full"><center>
              <span class="text2">Not a member yet?</span>
              <a href="signup.jsp" class="text2 signup">SIGN UP</a></center>
            </div>
          </form>
        </div>
      </div>
    </div>
    </div>
        <!-- Footer -->
      
 <%@include file="footer.jsp" %>
 
