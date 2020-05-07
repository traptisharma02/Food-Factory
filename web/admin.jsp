<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@include file="header3.jsp" %>
            <div class="hero-text-box">
                <h1>WELCOME<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Admin</h1>
                <a class="btn btn-full js--scroll-to-plans" href="#">I'm hungry</a>
                <a class="btn btn-ghost js--scroll-to-start" href="#">Show me more</a>
            </div>
            
</header>
        
        
        <button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
        <section class="section-form" id="planChg">
            <div class="row">
                <h2>Change plans </h2>
            </div>
            <div class="row">
                <form method="post" action="#" class="contact-form">
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="category">Category</label>
                        </div>
                       <div class="col span-2-of-3">
                            <select name="category" id="category">
                                <option value="Pro" selected>Pro</option>
                                <option value="Premium">Premium</option>
                                <option value="Starter">Starter</option>
                            </select>
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
                            <label for="time">Plan's validity</label>
                        </div>
                        <div class="col span-2-of-3">
                            <select name="time" id="time">
                                <option value="/Month" selected>/Month</option>
                                <option value="/Meal">/Day</option>
                            </select>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="mealInt">Meal interval</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="mealInt" id="mealInt" placeholder="Enter meal's interval">
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="orderTime">Order Time</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="orderTime" id="orderTime" placeholder="Order time">
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label>Access to newest creation</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="checkbox" name="access" id="access" checked> Yes, please
                        </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Free delivery</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="checkbox" name="freeD" id="freeD" checked> Yes, please
                        </div>

                    </div>
                         <div class="text-center w-full "><br><center>
                     <a href="#" class="btn btn-ghost">Change plan</a></center></div>
                </form>
                
            </div>
        </section>
        
   
          <!-- Footer Links -->
<%@include file="footer.jsp" %>