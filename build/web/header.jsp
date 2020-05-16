<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Omnifood is a premium food delivery service with the mission to bring affordable and healty meals to as many people as possible.">
        
        <link rel="stylesheet" type="text/css" href="vendors/css/normalize.css">
        <link rel="stylesheet" type="text/css" href="vendors/css/grid.css">
        <link rel="stylesheet" type="text/css" href="vendors/css/ionicons.min.css">
        <link rel="stylesheet" type="text/css" href="vendors/css/animate.css">
        <link rel="stylesheet" type="text/css" href="resources/css/style.css">
        <link rel="stylesheet" type="text/css" href="resources/css/login.css">
        <link rel="stylesheet" type="text/css" href="resources/css/queries.css">
        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>
        <title>Omnifood</title>
        
        <link rel="apple-touch-icon" sizes="57x57" href="/resources/favicons/apple-touch-icon-57x57.png">
        <link rel="apple-touch-icon" sizes="60x60" href="/resources/favicons/apple-touch-icon-60x60.png">
        <link rel="apple-touch-icon" sizes="72x72" href="/resources/favicons/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="76x76" href="/resources/favicons/apple-touch-icon-76x76.png">
        <link rel="apple-touch-icon" sizes="114x114" href="/resources/favicons/apple-touch-icon-114x114.png">
        <link rel="apple-touch-icon" sizes="120x120" href="/resources/favicons/apple-touch-icon-120x120.png">
        <link rel="apple-touch-icon" sizes="144x144" href="/resources/favicons/apple-touch-icon-144x144.png">
        <link rel="apple-touch-icon" sizes="152x152" href="/resources/favicons/apple-touch-icon-152x152.png">
        <link rel="apple-touch-icon" sizes="180x180" href="/resources/favicons/apple-touch-icon-180x180.png">
        <link rel="icon" type="image/png" href="/resources/favicons/favicon-32x32.png" sizes="32x32">
        <link rel="icon" type="image/png" href="/resources/favicons/favicon-194x194.png" sizes="194x194">
        <link rel="icon" type="image/png" href="/resources/favicons/favicon-96x96.png" sizes="96x96">
        <link rel="icon" type="image/png" href="/resources/favicons/android-chrome-192x192.png" sizes="192x192">
        <link rel="icon" type="image/png" href="/resources/favicons/favicon-16x16.png" sizes="16x16">
        <link rel="manifest" href="/resources/favicons/manifest.json">
        <link rel="shortcut icon" href="/resources/favicons/favicon.ico">
        <meta name="msapplication-TileColor" content="#da532c">
        <meta name="msapplication-TileImage" content="/resources/favicons/mstile-144x144.png">
        <meta name="msapplication-config" content="/resources/favicons/browserconfig.xml">
        <meta name="theme-color" content="#ffffff">
        <script>
                    function validate(){
                    var pass=document.f1.password.value;
                    var pass1=document.f1.confirmPassword.value;
                    var num=document.f1.contact.value;
                    var first=num.charAt(0);
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
                    if(isNaN(num) || num.length<10 && num.length>=0) 
                    {
                            alert("please enter valid number");
                            status= false;
                    }

                    else if(!(first=="7" || first=="8" || first=="9"))
                    {
                            alert("please enter valid number");
                            status= false;
                    }
                    else{
                        status=true;
                    }
                    return status;
                    },1);
                    
                 
                    }

</script>
    </head>
    <body>
        <header>
            <nav>
                <div class="row">
                    <a href="index.jsp"> <img src="resources/img/logo-white.png" alt="Omnifood logo" class="logo">
                    <img src="resources/img/logo.png" alt="Omnifood logo" class="logo-black"></a>
                    <ul class="main-nav js--main-nav">
                        <li><a href="index.jsp#features">Food delivery</a></li>
                        <li><a href="index.jsp#works">How it works</a></li>
                        <li><a href="index.jsp#cities">Our cities</a></li>
                        <li><a href="index.jsp#plans">Select Plan</a></li>
                        <li><a href="signup.jsp">Sign Up</a></li>
                        
                    </ul>
                    <a class="mobile-nav-icon js--nav-icon"><i class="ion-navicon-round"></i></a>
                </div>
            </nav>