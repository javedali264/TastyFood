<%-- 
    Document   : signup
    Created on : Nov 24, 2017, 11:26:37 AM
    Author     : Sameer Alam
--%>

<!DOCTYPE html>
<html>
<head>
<title>SignUp Page</title>
<!--mobile apps-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="keywords" content="Tasty Food Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	Smartphone Compatible web template, free Webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--mobile apps-->
<!--Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script> 
<!-- //js -->
<!--web-fonts-->
<link href='//fonts.googleapis.com/css?family=Stint+Ultra+Condensed' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!--//web-fonts-->
<!--animate-->
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
<script src="js/wow.min.js"></script>
	<script>
		 new WOW().init();
	</script>
<!--//end-animate-->
<!-- start-smooth-scrolling-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<!--//end-smooth-scrolling-->
</head>
<body>
	<!--banner-->
	<div class="banner about-banner">
		<div class="container">
			<!--header-->
			<div class="header">
				<div class="logo">
					<h1 class="wow zoomIn animated" data-wow-delay=".5s"><a href="index.jsp">Tasty Food</a></h1>
                                </div><br><br><br>
				<div class="top-nav">
					<span class="menu"><img src="images/menu.png" alt=""/></span>
                                        <ul>
						<li class="wow slideInDown animated" data-wow-delay=".5s"><a href="admin.jsp">Admin Login</a></li>
						<li class="wow slideInDown animated" data-wow-delay=".6s"><a class="active" href="login.jsp">Login</a></li>					
						<li class="wow slideInDown animated" data-wow-delay=".7s"><a href="signup.jsp">SignUp</a></li>
						
					</ul>
					<!-- script-for-menu -->
					<script>					
						$("span.menu").click(function(){
							$(".top-nav ul").slideToggle("slow" , function(){
							});
						});
					</script>
					<!-- script-for-menu -->
				</div>
				<div class="clearfix"> </div>
			</div>	
			<!--//header-->
			<div class="bnr-text wow slideInLeft animated" data-wow-delay=".7s">
				<h2 class="bnr-title agileinfo">SignUp</h2>
			</div>	
		</div>	
	</div>	
	<!--//banner--> 
        
        <form action="DoSignUp" method="post" style="margin: auto; width: 80%; text-align: center;">
    <br><BR>
            
            <input type="text" name ="signup" class="form-control" placeholder="username">
            <br>
            
            <input type="email" name="signup" class="form-control"  placeholder="email" required>
              <br>
              
              <input type="password" name="signup" class="form-control" placeholder="password">
             <br>
              <input type="number" name="signup" class="form-control" placeholder="phone">
              <br>
              
              <textarea  name="signup" class="form-control"  placeholder="address"></textarea>
              <br>
              
              <input type="submit" value="SignUp" class="btn btn-danger">
              <br><BR>
        </form>
<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-info">
				<div class="col-md-4 footer-grids footer-address">
					<h3 class="wow fadeInDown animated" data-wow-delay=".5s">Contact Us:</h3>
					<ul>
						<li class="wow slideInLeft animated" data-wow-delay=".5s"><i class="glyphicon glyphicon-send"></i> South Extension, Part-2 <span> New Delhi. </span></li>
						<li class="wow slideInLeft animated" data-wow-delay=".5s"><i class="glyphicon glyphicon-phone"></i> +919953943241 <span> +917210525129 </span></li>
						<li class="wow slideInLeft animated" data-wow-delay=".5s"><i class="glyphicon glyphicon-envelope"></i> <a href="mailto:example@mail.com"> javedali88055@gmail.com</a></li>
					</ul>
				</div>
				<div class="col-md-4 footer-grids">
					<h3 class="wow fadeInDown animated" data-wow-delay=".5s">Popular Items</h3>
					<div class="footer-grd wow zoomIn animated" data-wow-delay=".5s">
						<a href="single.jsp">
							<img src="images/f1.jpg" class="img-responsive" alt=" ">
						</a>
					</div>
					<div class="footer-grd wow zoomIn animated" data-wow-delay=".5s">
						<a href="single.jsp">
							<img src="images/f2.jpg" class="img-responsive" alt=" ">
						</a>
					</div>
					<div class="footer-grd wow zoomIn animated" data-wow-delay=".5s">
						<a href="single.jsp">
							<img src="images/f3.jpg" class="img-responsive" alt=" ">
						</a>
					</div>
					<div class="clearfix"> </div>
					<div class="footer-grd wow zoomIn animated" data-wow-delay=".5s">
						<a href="single.jsp">
							<img src="images/f4.jpg" class="img-responsive" alt=" ">
						</a>
					</div>
					<div class="footer-grd wow zoomIn animated" data-wow-delay=".5s">
						<a href="single.jsp">
							<img src="images/f5.jpg" class="img-responsive" alt=" ">
						</a>
					</div>
					<div class="footer-grd wow zoomIn animated" data-wow-delay=".5s">
						<a href="single.jsp">
							<img src="images/f6.jpg" class="img-responsive" alt=" ">
						</a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 footer-grids">
					<h3 class="wow fadeInDown animated" data-wow-delay=".5s">Newsletter</h3>
					<div class="subscribe wow slideInRight animated" data-wow-delay=".5s">
						<form>
							<input type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
							<input type="submit" value="Go">
						</form>
						<div class="clearfix"> </div>
					</div>
					<div class="social-icons wow slideInRight animated" data-wow-delay=".5s">
						<ul>
							<li><a href="#"> </a></li>
							<li><a href="#" class="fb"> </a></li>
							<li><a href="#" class="in"> </a></li>
							<li><a href="#" class="dott"> </a></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="footer-copy wow slideInUp animated" data-wow-delay=".5s">
                            <p>� 2016 Tasty Food. All rights reserved | Design by <a><b>Javed</b></a></p>
			</div>
		</div>	
	</div>	
	<!--//footer-->	
	<!--smooth-scrolling-of-move-up-->
	<script type="text/javascript">
		$(document).ready(function() {
		
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->
	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>