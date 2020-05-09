<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@include file="header2.jsp" %>
            <div class="hero-text-box">
                <h1>WELCOME<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Trapti</h1>
                <a class="btn btn-full js--scroll-to-plans" href="#">New Plans</a>
                <a class="btn btn-ghost js--scroll-to-start" href="#">Your Plan</a>
            </div>
            
</header>
<button onclick="window.scrollTo(0, 0); " id="myBtn" title="Go to top" ><i class="ion-arrow-up-c"></i></button>
        <section class="section-plans js--section-plans" id="plans">
            <div class="row">
                <h2>Start eating healthy today</h2>
            </div>
            <div class="row">
                <div class="col span-1-of-3">
                    <div class="plan-box js--wp-4">
                        <div>
                            <h3>Premium</h3>
                            <p class="plan-price">$399 <span>/ month</span></p>
                            <p class="plan-price-meal">That's only 13.30$ per meal</p>
                        </div>
                        <div>
                            <ul>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>1 meal every day</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Order 24/7</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Access to newest creations</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Free delivery</li>
                            </ul>
                        </div>
                        <div>
                            <a href="signup.jsp" class="btn btn-full">Select</a>
                        </div>
                    </div>
                </div>
                <div class="col span-1-of-3">
                    <div class="plan-box">
                        <div>
                            <h3>Pro</h3>
                            <p class="plan-price">$149 <span>/ month</span></p>
                            <p class="plan-price-meal">That's only 14.90$ per meal</p>
                        </div>
                        <div>
                            <ul>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>1 meal 10 days/month</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Order 24/7</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Access to newest creations</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Free delivery</li>
                            </ul>
                        </div>
                        <div>
                            <a href="signup.jsp" class="btn btn-ghost">Select</a>
                        </div>
                    </div>
                </div>
                <div class="col span-1-of-3">
                    <div class="plan-box">
                        <div>
                            <h3>Starter</h3>
                            <p class="plan-price">19$ <span>/ meal</span></p>
                            <p class="plan-price-meal">&nbsp;</p>
                        </div>
                        <div>
                            <ul>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>1 meal</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Order from 8 am to 12 pm</li>
                                <li><i class="ion-ios-close-empty icon-small"></i></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Free delivery</li>
                            </ul>
                        </div>
                        <div>
                            <a href="signup.jsp" class="btn btn-ghost">Select</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <section class="section-form" id="Uplan">
            <div class="row">
                <h2>Here are your existing plans </h2>
            </div>
            <div class="row">
                <form method="post" action="#" class="contact-form">
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="category">Category</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="category" id="category" value="Pro" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="price">Price</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="price" id="price" value="$149 " readonly>
                        </div>
                    </div>
                        <div class="row">
                        <div class="col span-1-of-3">
                            <label for="selectedD">Plan selected at</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="selectedD" id="selectedD" value="Price" readonly>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col span-1-of-3">
                            <label for="due">Plan due date</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="due" id="due" value="due" readonly>
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
        </section>
        
   
          <!-- Footer Links -->
<%@include file="../footer.jsp" %>