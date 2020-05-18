<%-- 
    Document   : changePassword
    Created on : 17 Mar, 2020, 1:56:34 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script>
                    function validate(){
                    var pass=document.f1.new_password.value;
                    var pass1=document.f1.confirm_new_password.value;
                    var status=false;
                    setTimeout(function()
                    {
                    if (pass.length<6) 
                    {
                            alert("please enter 6 digit password");
                            status= false;
                    }
                    else{
                        status=true;
                    }
                    if(pass1!=pass)
                    {
                            alert("please enter same password");
                            status= false;
                    }
                    else{
                        status=true;
                    }
                  
                    return status;
                    },1);
                    
                 
                    }

</script>
        <%@include file="header.jsp" %>
       
        <div class="limiter" style="height: 125%">
            <div class="container-login">
                <div class="wrap-login" style="margin-top: -7%;">
                    <div class="text-center"> 
                         <div class="container">
                              <%
    String st="";
    try{
    st=request.getParameter("st");
    if(st.equals("1")){
%>
                <h2 style="margin-top: -1%;">Change password</h2>
          </div>
             <%
                 String m=request.getParameter("email");
             %>   
             <form action="chngpassServlet?email=<%= m%>" class="login-form" method="post" name="f1" onsubmit="return validate();">
                           
                            <div class="my-2 ml-2"><span>New Password</span></div>
                            <div class="wrap-input">
                                <input type="password" name="new_password" id="new_password" class="inputcustom" />
                            </div>
                            <div class="my-2 ml-2"><span>Confirm New Password</span></div>
                            <div class="wrap-input">
                                <input type="password" name="confirm_new_password" class="inputcustom" />
                            </div>
                            
                            <div class="text-center w-full b1"><br><center>
                     <input type="submit" value="Change password" class="btn btn-ghost"></center></div>
                            
                        </form>               
                    </div>
                </div>
            </div>
        </div>
       
        <%@include file="footer.jsp" %>
         <%
            }
  else{
                 out.println("<script type=\"text/javascript\">");
                out.println("alert('Not allowed');");
                out.println("</script>");        
            }
}
catch(Exception e){
out.print("not allowed");
}
          
        %>
    </body>
</html>
