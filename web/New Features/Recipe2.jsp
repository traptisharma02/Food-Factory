<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>Food factory</title>

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
    
 <nav>
    <a onclick="openNav()" class='openBtn'>&#9776;</a>
    <span>Where to eat</span>
  </nav>    <!-- Sidebar  -->
        <nav id="sidebar">
             <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a><br><br>
            <div class="sidebar-header">
                <h2>Ingredients</h2>
                  
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
          
            <center>
            <div class="container" style="width: 95%">    
                             

                    <!-- recipe cards will be displayed here -->
               
            </div>
            </center>

       

         


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
    

