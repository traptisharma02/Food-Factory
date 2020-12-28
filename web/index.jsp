<%-- 
    Document   : index
    Created on : 6 May, 2020, 5:35:54 PM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.DBConnection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@include file="header.jsp" %>
            <div class="hero-text-box">
                <h1>Goodbye junk food.<br>Hello super healthy meals.</h1>
                <a class="btn btn-full js--scroll-to-plans" href="#">I'm hungry</a>
                <a class="btn btn-ghost js--scroll-to-start" href="#">Show me more</a>
            </div>
            
        </header>
        
        <section class="section-features js--section-features" id="features">
            <div class="row">
                <h2>Get food fast &mdash; not fast food</h2>
                <p class="long-copy">
                    Hello, we're Food factory, your new premium food delivery service. We know you're always busy. No time for cooking. So let us take care of that, we're really good at it, we promise!
                </p>
            </div>
            
            <div class="row js--wp-1">
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-infinite-outline icon-big"></i>
                    <h3>Up to 365 days/year</h3>
                    <p>
                        Never cook again! We really mean that. Our subscription plans include up to 365 days/year coverage. You can also choose to order more flexibly if that's your style.
                    </p>
                </div>
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-stopwatch-outline icon-big"></i>
                    <h3>Ready in 20 minutes</h3>
                    <p>
                        You're only twenty minutes away from your delicious and super healthy meals delivered right to your home. We work with the best chefs in each town to ensure that you're 100% happy.
                    </p>
                </div>
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-nutrition-outline icon-big"></i>
                    <h3>100% organic</h3>
                    <p>
                        All our vegetables are fresh, organic and local. Animals are raised without added hormones or antibiotics. Good for your health, the environment, and it also tastes better!
                    </p>
                </div>
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-cart-outline icon-big"></i>
                    <h3>Order anything</h3>
                    <p>
                        We don't limit your creativity, which means you can order whatever you feel like. You can also choose from our menu containing over 100 delicious meals. It's up to you!
                    </p>
                </div>
            </div>   
        </section>
        
        <section class="section-meals" id="pic">
            <ul class="meals-showcase clearfix">
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/1.jpg" alt="Korean bibimbap with egg and vegetables">
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/2.jpg" alt="Simple italian pizza with cherry tomatoes">
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/3.jpg" alt="Chicken breast steak with vegetables">
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/4.jpg" alt="Autumn pumpkin soup">
                    </figure>
                </li>
            </ul>
            <ul class="meals-showcase clearfix">
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/5.jpg" alt="Paleo beef steak with vegetables">
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/6.jpg" alt="Healthy baguette with egg and vegetables">
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/7.jpg" alt="Burger with cheddar and bacon">
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/img/8.jpg" alt="Granola with cherries and strawberries">
                    </figure>
                </li>
            </ul>
        </section>
        
        
        <section class="section-steps" id="works">
            <div class="row">
                <h2>How it works &mdash; Simple as 1, 2, 3</h2>
            </div>
            <div class="row">
                <div class="col span-1-of-2 steps-box">
                    <img src="resources/img/app-iPhone.png" alt="Omnifood app on iPhone" class="app-screen js--wp-2">
                </div>
                <div class="col span-1-of-2 steps-box">
                    <div class="works-step clearfix">
                        <div>1</div>
                        <p>Choose the subscription plan that best fits your needs and sign up today.</p>
                    </div>
                    <div class="works-step clearfix">
                        <div>2</div>
                        <p>Order your delicious meal using our  website. Or you can even call us!</p>
                    </div>
                    <div class="works-step clearfix">
                        <div>3</div>
                        <p>Enjoy your meal after less than 20 minutes. See you the next time!</p>
                    </div>
                    
                   </div>
            </div>
        </section>
        
         <section class="section-cities" id="cities">
          <div class="row">
                <h2>We're currently in these location</h2>
            </div>
            <div class="row js--wp-3" >
                  <div class="col span-1-of-3 box">
                    
                </div>
                 <div class="col span-1-of-3 box">
                    <img src="resources/img/lisbon-3.png" alt="Lisbon">
                    <div style="margin-left: 25%">
                    <div class="city-feature">
                        <i class="ion-ios-person icon-small"></i>
                        Food Factory
                    </div>
                     <div class="city-feature">
                        <i class="fa fa-phone-square icon-small" aria-hidden="true"></i>
                        9993387574
                    </div>
                    <div class="city-feature">
                        <h4>  &nbsp;&nbsp;<i class="fa fa-map-marker-alt" style="font-size: 20px;color: #e67e22"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="ViewLocation.jsp" class="text2 signup" style="color: #e67e22">View location on map</a>
                        </h4> </div>
                </div>
                 <div class="col span-1-of-3 box">
                 </div></div>
            </div>
            
        </section>
        
        <section class="section-testimonials" id="blog">
            <div class="row">
                <h2>Our customers can't live without us</h2>
            </div>
            
            <div class="row">
                <%
                    Connection con=DBConnection.getConnection();
             try{
                    PreparedStatement ps=con.prepareStatement("select * from feedback limit 3");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>
                <div class="col span-1-of-3">
                    <blockquote>
                        <%=rs.getString("msg") %>
                        <cite><img src="images/<%=rs.getString("image") %>" alt="Customer 1 photo"><%=rs.getString("name") %></cite>
                    </blockquote>
                </div>
             
                 <%
                        }
                        
                        }catch(Exception e){e.printStackTrace();}

                    %>
            </div>
        </section>
        
        
        <section class="section-plans js--section-plans" id="plans">
            <div class="row">
                <h2>Start eating healthy today</h2>
            </div>
            <div class="row">
                <%
             
             try{
                    PreparedStatement ps=con.prepareStatement("select * from meal");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                %>
                <div class="col span-1-of-3">
                    <div class="plan-box js--wp-4">
                        <div>
                            <h3><%=rs.getString("category") %></h3>
                            <p class="plan-price">Rs.<%=rs.getString("price") %><span><%=rs.getString("validity") %></span></p>
                            <%
                                int oneP=0;
                                if(rs.getString("inter").equals("1"))
                                    oneP=(Integer.parseInt(rs.getString("price")));
                                else if(rs.getString("inter").equals("3"))
                                    oneP=(Integer.parseInt(rs.getString("price")))/3;
                                else
                                    oneP=(Integer.parseInt(rs.getString("price")))/30;
                            %>
                            <p class="plan-price-meal">That's only <%= oneP%> per meal</p>
                        </div>
                        <div>
                            <ul>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i>Total <%=rs.getString("inter") %> meal</li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("orderTiming") %></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("accessNew") %></li>
                                <li><i class="ion-ios-checkmark-empty icon-small"></i><%=rs.getString("freeDelivery") %></li>
                            </ul>
                        </div>
                        <div>
                            <a href="customer/welcome.jsp#plans" class="btn btn-ghost">Select</a>
                        </div>
                     </div>
               
                            </div>
                    <%
                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    %>
               
        </section>
        
        <section class="section-form" id="contact">
            <div class="row">
                <h2>We're happy to hear from you</h2>
            </div>
            <div class="row">
                <form method="post" action="NewsLetServlet" class="contact-form">
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="name">Name</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="text" name="name" id="name" placeholder="Your name" required="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="email">Email</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="email" name="email" id="email" placeholder="Your email" required="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label for="find-us">How did you find us?</label>
                        </div>
                        <div class="col span-2-of-3">
                            <select name="find-us" id="find-us" required="">
                                <option value="friends" selected>Friends</option>
                                <option value="search">Search engine</option>
                                <option value="ad">Advertisement</option>
                                <option value="other">Other</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Newsletter?</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="checkbox" name="news" id="news" value="yes" checked> Yes, please
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Drop us a line</label>
                        </div>
                        <div class="col span-2-of-3">
                            <textarea name="message" placeholder="Your message" required=""></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>&nbsp;</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="submit" value="Send it!">
                        </div>
                    </div>
                    
                </form>
                
            </div>
        </section>
        
   
          <!-- Footer Links -->
<%@include file="footer.jsp" %>