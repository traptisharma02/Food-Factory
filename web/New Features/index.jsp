<!doctype html>
<html lang="en-us">

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.6-rc.0/css/select2.min.css" rel="stylesheet" />
  <link href="../resources/css/index.css" rel="stylesheet" />
  <title>Food factory</title>
</head>

<body>
  <!-- <body onload="checkSecure();"> -->
  <!-- Top Nav Bar -->
  <nav>
    <a onclick="openNav()">&#9776;</a>
    <span>Where to eat</span>
  </nav>
  <!-- Top Nav Bar Ends -->

  <!-- Settings Side Nav -->
  <div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <!-- Title -->
    <h1>Settings</h1>
    <!-- Latitude -->
    <label for="lat">Latitude: </label>
    <input id="lat" type="text" name="Latitude" placeholder="">
    <!-- Longitude -->
    <label for="lng">Longitude: </label>
    <input id="lng" type="text" name="Longitude" placeholder="">
    <!-- Travel Mode -->
    <label for="travel">Travel mode:</label>
    <select id="travelMode">
      <option value="" selected disabled hidden>Select travel mode</option>
      <option value="driving">Driving</option>
      <option value="walking">Walking</option>
      <option value="bicycling">Bicycling</option>
      <option value="transit">Transit</option>
    </select>
    <!-- Results Count -->
    <label for="results">Results count: (MAX 20)</label>
    <br/>
    <input id="results" type="text" name="Results" placeholder="">
    <!-- Maximum miles -->
    <label for="miles">Maximum miles radius: </label>
    <br/>
    <input id="miles" type="text" name="Miles" placeholder="">
    <!-- Sort -->
    <label for="sort">Sort by:</label>
    <br/>
    <select id="sort">
      <option value="" selected disabled hidden>Selected sort</option>
      <option value="cost">Cost</option>
      <option value="rating">Rating</option>
      <option value="real_distance">Distance</option>
    </select>
    <!-- Order -->
    <label for="results">Order by:</label>
    <select id="order">
      <option value="" selected disabled hidden>Select order</option>
      <option value="asc">Ascending</option>
      <option value="desc">Descending</option>
    </select>
    <button class="btn" onclick="applySettings();"> Apply Settings</button>
  </div>
  <!-- Settings Side Nav ends -->
<div class="container">
  <!-- Queries -->
  <div id="queries">
    <!-- Select Category -->
    <div class="boxes">
      <label for="categories">Filter by categories</label>
      <select id="categories" name="category">
        <option value="" disabled selected hidden>Please choose a category</option>
      </select>
    </div>
    <!-- Select Cuisines -->
    <div class="boxes">
      <label for="cuisines">Filter by cuisines</label>
      <select id="cuisines" name="cuisines">
        <option value="" disabled selected hidden>Please choose a cuisine</option>
      </select>
    </div>
    <!-- Search Query -->
     <button class="btn" onclick="applyAll();">
      <span>Apply any!</span>
    </button>
  </div>
  <!-- Queries end -->

  
  <!-- Map Canvas -->
  <div id="map-canvas">
    <h3>Loading.... Please wait...</h3>
  </div>
  <!-- Map Canvas end -->
  </div>

  <!-- Restaurants -->
  <div class="cardCont">
  <div class="card" id="restaurants">

  </div></div>
  <!-- Restaurants end -->
  <!-- Scripts -->
  <script src="cordova.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAN9Dwitb2cjEuouUSW2As_Ot5vrzLmhY0&libraries=geometry"></script>
  <script src="../resources/js/index.js"></script>
  <!-- End of body -->
</body>

</html>