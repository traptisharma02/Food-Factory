<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <%@include file="header3.jsp" %>
         
        <div class="limiter" style="height: 155%">
      <div  class="container-login"  >
          <div class="wrap-login " >
         
        
      
            <div class="row">
                <h2>View Existing Customers </h2>
            </div>
        <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
            <div class="row">
                <form method="post" action="#" >
                  <div class="row">
                        <div class="col span-1-of-3">
                            <label for="Name">Name</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="name" id="name" placeholder="Enter Name">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Contact-No.</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="contact" id="contact" placeholder="Enter Contact Number">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="email">Email</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="email" id="email" placeholder="Enter Email">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="planc">Plan</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="planc" id="planc" placeholder="Enter plan category">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Price</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="price" id="price" placeholder="Enter Price">
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="selectedD">Plan selected at</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="selectedD" id="selectedD" value="Selection date" readonly>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="due">Plan due date</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="due" id="due" value="Due Date" readonly>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="exFeatures">Other features</label>
                        </div>
                        <div class="col span-2-of-3">
                            <textarea name="exFeatures" id="exFeatures" rows"2" readonly >1 meal 10 days/month.  Order 24/7.  
                            Free delivery</textarea>
                        </div>

                    </div>
                </form>
                
            </div>
            </div></div></div></div>
   
          <!-- Footer Links -->
<%@include file="../footer.jsp" %>