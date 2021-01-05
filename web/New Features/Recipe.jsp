<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>WTF Should I Eat For Dinner</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" type="text/css" media="screen" href="assets/css/style.css"/>
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
    <!-- firebase -->
    <script src="https://www.gstatic.com/firebasejs/5.2.0/firebase.js"></script>

    <!-- jQuery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
     <!-- Firebase -->
    <script src="https://www.gstatic.com/firebasejs/5.2.0/firebase.js"></script>
  

</head>

<body>


    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Ingredients</h3>
            </div>

            <ul class="list-unstyled components">
                <p>Choose Ingredients</p>
                <li class="active">                   
    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Ingredients</h3>
            </div>

            <ul class="list-unstyled components">
                <p>Choose Ingredients</p>
                <li class="active">                   
                    <img src="assets/images/milk-eggs.png" alt="Dairy" height="50" width="50" class="Ing_Icon">
                    <a href="#dairySubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Dairy</a>                  
                    <ul class="collapse list-unstyled" id="dairySubmenu">

                         <!--Dairy ingredients will be displayed here-->

                        

                    </ul>
                </li>               
                <li>
                    <img src="assets/images//Vegetables.jpg" alt="Dairy" height="50" width="50" class="Ing_Icon">
                    <a href="#veggieSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Vegetables</a>
                    <ul class="collapse list-unstyled" id="veggieSubmenu">

                            <!--Vegetables ingredients will be displayed here-->

                            

                    </ul>
                </li>
                <li>
                    <img src="assets/images//fruits.jpg" alt="Dairy" height="50" width="50" class="Ing_Icon">
                    <a href="#fruitsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Fruits</a>
                    <ul class="collapse list-unstyled" id="fruitsSubmenu">

                            <!--Fruits ingredients will be displayed here-->

                    </ul>
                </li>
                <li>
                    <img src="assets/images//BakingAndGrains.jpg" alt="Dairy" height="50" width="50" class="Ing_Icon">
                    <a href="#BGSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Baking & Grains</a>
                    <ul class="collapse list-unstyled" id="BGSubmenu">

                            <!--bakery and grains ingredients will be displayed here-->

                    </ul>
                </li>              
            </ul>
            <button id="searchButton" type="submit" class="btn btn-primary">Search</button>
            <button id="favouritesButton" type="submit" class="btn">Favorites</button>
            <button id="randomRecipeButton" type="submit" class="btn btn-info">Random Recipe!</button>
        </nav>

        <!-- Page Content  -->
        <div id="content">
            <img class="col-md-12" class="logo" src = "assets/images/Logo.jpg">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fas fa-align-left"></i>
                        <span>Toggle Sidebar</span>                     
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>
                  
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul id = "pageNumberDiv" class="nav navbar-nav ml-auto">
                            <li class="nav-item active">
                                <a class="nav-link" href="#">1</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">2</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">3</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">4</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <div class="container" style="text-align:center">    
                             

                    <!-- recipe cards will be displayed here -->

            </div>


            <div class="line"></div>
             
            <div class="box">
                <div class="row">
                    <div class="col" id="restaurant-info">
                        
                    </div>
                </div>
                <form>
                    <div class="form-group">
     
                        <label for="restaurants">Restaurants</label>
                        <input type="restaurants" class="form-control" id="restaurants" placeholder="Houston, TX">
                    </div>
                    <button type="submit" class="btn btn-primary" id="findRestaurants">Find Restaurant!</button>
                </form>

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><strong>Restaurants Near You</strong></h3>
                </div>
                <div class="panel-body">
                    <table class="table table-hover" id='restaurant-table'>
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Location</th>
                                <th>Cuisine</th>
                                <th>User Rating</th>
                                <th>Phone Number</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--stuff goes here-->
                        </tbody>
                    </table>
                </div>
            </div>
 
            <br>

         


    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- velocity -->
    <script src="https://cdn.jsdelivr.net/npm/velocity-animate@2.0/velocity.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/velocity-animate@2.0/velocity.ui.min.js"></script>
    <!-- our javascript -->
    <script src="assets/javascript/app.js"></script>

    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->

    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script> 
    <!-- Script -->
    <script src="assets/javascript/app.js"></script>    

 <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
    </body>
    </html>
    

