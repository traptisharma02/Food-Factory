<%-- 
    Document   : changePassword
    Created on : 17 Mar, 2020, 1:56:34 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%@include file="header.jsp" %>
        <div class="limiter" style="height: 125%">
            <div class="container-login">
                <div class="wrap-login" style="margin-top: -7%;">
                    <div class="text-center"> 
                         <div class="container">
                <h2 style="margin-top: -1%;">Change password</h2>
          </div>
                        <form action="#" class="login-form">
                            <div class="my-2 ml-2"><span>Current Password</span></div>
                            <div class="wrap-input">
                                <input type="password" name="current_password" class="inputcustom" />
                            </div>
                            <div class="my-2 ml-2"><span>New Password</span></div>
                            <div class="wrap-input">
                                <input type="password" name="new_password" class="inputcustom" />
                            </div>
                            <div class="my-2 ml-2"><span>Confirm New Password</span></div>
                            <div class="wrap-input">
                                <input type="password" name="confirm_new_password" class="inputcustom" />
                            </div>
                            
                            <div class="text-center w-full b1"><br><center>
                     <a href="#" class="btn btn-ghost">Change password</a></center></div>
                            
                        </form>               
                    </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
