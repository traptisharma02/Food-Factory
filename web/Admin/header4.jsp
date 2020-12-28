<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Omnifood is a premium food delivery service with the mission to bring affordable and healty meals to as many people as possible.">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

        
        <link rel="stylesheet" type="text/css" href="../vendors/css/normalize.css">
        <link rel="stylesheet" type="text/css" href="../vendors/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../vendors/css/ionicons.min.css">
        <link rel="stylesheet" type="text/css" href="../vendors/css/animate.css">
        <link rel="stylesheet" type="text/css" href="../resources/css/style.css">
        <link rel="stylesheet" type="text/css" href="../resources/css/login.css">
        <link rel="stylesheet" type="text/css" href="../resources/css/queries.css">
        <link rel="stylesheet" type="text/css" href="../resources/css/approve.css">
        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>
        <title>Omnifood</title>
        
           <link href="../vendors/css/bootstrap.min.css" rel="stylesheet">

    <link href="../vendors/css/datatables.bootstrap4.min.css" rel="stylesheet">

    <!-- Bootstrap core JavaScript-->
    <script src="../vendors/js/jquery.min.js"></script>

    <!-- Page level plugin JavaScript-->
    <script src="../vendors/js/jquery.datatables.min.js"></script>

    <script src="../vendors/js/datatables.bootstrap4.min.js"></script>
    <script>
        $(document).ready(function () {
            $('#myTable').DataTable();
        });
    </script>
        
    </head>
    <body>
        <header>
            <nav>
                <div class="row " style="margin-left: 7%">
                    <a href="admin.jsp"> <img src="../resources/img/logo-white.png" alt="Omnifood logo" class="logo">
                    <img src="../resources/img/logo.png" alt="Omnifood logo" class="logo-black"></a>
                    <ul class="main-nav js--main-nav" style="text-align: right;width: 90%">
                        <li><a href="TodayDel.jsp">Today's Deliveries</a></li>
                        <li><a href="ApproveC.jsp">Approve user</a></li>
                        <li><a href="ApprovePay.jsp">Approve payment</a></li>
                        <li><a href="ViewCustomer.jsp">View Customers</a></li>
                         <li><a href="../ALoginIn.jsp">logout</a></li>
                    </ul>
                    <a class="mobile-nav-icon js--nav-icon"><i class="ion-navicon-round"></i></a>
                </div>
            </nav>