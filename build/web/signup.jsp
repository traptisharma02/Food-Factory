
<!DOCTYPE html>

 
<body style="margin-top: -.8%">
      <!-- Header -->
      <!-- Header-->
<%@include file="header.jsp" %>
    <div class="limiter" >
      <div  class="container-login"  >
        <div class="wrap-login" >
          <div class="text-center">
              
            <div class="container">
                <h2 style="margin-top: -5%;">Sign Up</h2>
          </div>
              <form action="RegDataServlet" class="login-form" method="post" name="f1" onsubmit="return validate();">

            <div class="my-2 ml-2"><span>Name</span></div>
            <div class="wrap-input">
                <input type="text" name="username" class="inputcustom" id="username" required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Contact-No.</span>  
            </div>
            <div class="wrap-input">
              <input type="text" name="contact" id="contact" class="inputcustom" required="" />
            </div>
             <div class="my-2 ml-2">
              <span>Email-Id</span>  
            </div>
            <div class="wrap-input">
              <input type="email" name="email" class="inputcustom"  required=""/>
            </div>
             <div class="my-2 ml-2"><span>Password</span></div>
            <div class="wrap-input">
                <input type="password" name="password" id="password" class="inputcustom" required=""/>
            </div>
             <div class="my-2 ml-2">
              <span>Confirm Password</span>  
            </div>
            <div class="wrap-input">
                <input type="password" name="confirm-password" id="confirmPassword" class="inputcustom" required=""/>
            </div>
              <div class="my-2 ml-2"><span>Address</span></div>
            <div class="wrap-input">
                <textarea name="address" class="inputcustom" style="width: 100%" required=""></textarea>
            </div>
             
              <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
              
             <div class="text-center w-full b1"><br><center>
                     <input type="submit" value="Sign up now" class="btn btn-ghost"></div>
                    
            <div class="text-center w-full b2"><center>
              <span class="text2">Already a member?</span>
              <a href="logIn.jsp" class="text2 signup">SIGN IN</a></center>
            </div>
             
          </form>
        </div>
      </div>
    </div>
      </div>
        <!-- Footer -->
 <%@include file="footer.jsp" %>