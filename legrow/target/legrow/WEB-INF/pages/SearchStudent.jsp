<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" type="image/x-icon" href="resources/img/favicon.ico" />
<title>VIT World Computers</title>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!--<link href="css/bootstrap.css" rel="stylesheet">-->

<link
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<!--Font-awsome-->
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">

<!--GOOGLE icon-->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">


<link href="resources/css/megamenu.css"
	rel="stylesheet">
<link href="resources/css/style.css"
	rel="stylesheet">
	<link href="resources/css/jquery.css"
	rel="stylesheet">

<link
	href="resources/css/font-awesome.css"
	rel="stylesheet">



<link rel="stylesheet"
	href="resources/css/fullwidth.css"
	media="screen">
<link rel="stylesheet"
	href="resources/css/settings.css"
	media="screen">

<link rel="stylesheet"
	href="resources/css/style2.css"
	media="screen">


<!-- jQuery library -->
<script
	src="resources/js/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="resources/js/bootstrap.min.js"></script>

<script
	src="resources/js/jquery.easing.min.js"></script>

<script
	src="resources/js/angular.min.js"></script>
<script src="resources/javascript/wow.js"></script>
<script
	src="resources/js/demo.js"></script>
<script>
	new WOW().init();
</script>
<script async
	src="resources/js/functions.js"></script>

<script
	src="resources/js/megamenu.js"></script>




<script>
	if (window.innerWidth > 768) {
		document.getElementById("fb-like123").innerHTML = '<div class="fb-like-box" data-href="https://www.facebook.com/thetechaltum" data-width="310" data-height="auto" data-colorscheme="light" data-show-faces="true" data-header="true" data-stream="true" data-show-border="true"></div>';
	}
</script>
 <spring:url value="/resources/images" var="images" />


</head>




<body>

	<!-- <div class="bgtcolor" style="background-color: transparent;">
		<ul class="social" style="padding-left: 5%;">
			<li><a href="https://www.facebook.com/" class="fb"
				rel="nofollow" target="_blank"><span>Facebook</span></a></li>
			<li><a href="https://www.linkedin.com/uas/login" class="li"
				rel="nofollow" target="_blank"><span>Linked In</span></a></li>
			<li><a href="https://twitter.com/login?lang=en" class="tt"
				rel="nofollow" target="_blank"><span>Twitter</span></a></li>
			<li><a href="https://www.instagram.com/accounts/login/"
				class="ig" rel="nofollow" target="_blank"><span>Instagram</span></a></li>
			<li><a href="https://myaccount.google.com/?pli=1" class="gp"
				rel="nofollow" rel="publisher" target="_blank"><span>Google+</span></a></li>
		</ul>

	</div> -->


	<!--Header-->

	<div id="top-bar" class="navbar" style="background-color: #C1BFC0;">
		<div class="container">
			<!--style="line-height:30px;"-->
			<div class="row" style="line-height: 20px; padding-top: 20px;">
				<div class="col-sm-3">
					<i class='fa fa-phone'></i> +91-9415092404 &nbsp;&nbsp;&nbsp;&nbsp;
					<i class='fa fa-envelope'></i> <a href='mailto:info@ducatindia.com'
						style="color: black;">info@vitworld.in</a>
				</div>

				<div class="col-sm-2">
					<!--<i class='fa fa-envelope'></i>
                <a href='mailto:info@ducatindia.com'>info@ducatindia.com</a>-->
				</div>

				<div class="col-sm-5"></div>
				<div class="col-sm-2"></div>
			</div>
		</div>
	</div>




	<header class="container-fluid"
		style="background: #2d343E">
	<div style="width: 100%; height: 12em;">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-2">
					<a href=""> <img class="img-responsive"
						style="max-width: 100%; margin-top: 30px; height: auto;"
						src="${images}/logo.png" />
					</a>
				</div>
				<div class="col-sm-6" style="margin-top: 30px;">
					<a href="/VITWorld/index"> <img class="img-responsive"
						style="max-width: 100%; margin-left: -40px; padding-left: 2px; margin-top: 50px; height: auto;"
						src="${images}/test1.png" />
					</a>
				</div>
				<div class="col-sm-4">
					<div
						style="float: right; margin-right: 10%; margin-top: 7%; color: #007ec8;">
						<p>Conatct Us: +91-9598962010</p>
						<p><a href="#"
								style="color: white;" class="btn btn-danger"><i
								class="fa fa-camera"></i>&nbsp;&nbsp;Photo Gallery</a>
						</p>
						<p></p>
					</div>
				</div>
			</div>
		</div>
	</div>
	</header>








	<script>
		$(document).ready(function() {
			$("#megamenu-button-mobile").click(function() {
				$(".megamenu").slideToggle(400);
			});
		});
	</script>



	<nav>
	<div class="container-fluid" style="background-color: #3db4db;">
		<ul class="nav nav-pills">
			
			<li><a href="index.php" style="color: black"><i
					class="fa fa-home" style="font-size: 25px"></i> <!--Menu--></a></li>
			<li><a href="#" class="drop-down" style="color: black;">ABOUT
					US</a></li>



			<li><a href="#" class="drop-down" style="color: black;">COURSES</a>
			</li>



			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" style="color: black;">CAREER <b
					class="caret"></b></a>
				<ul class="dropdown-menu" style="">

					<li><a href="#"></a></li>
				</ul></li>

			<li><a href="" class="drop-down" style="color: black;">CONTACT
					US</a></li>



			<li><a href="${pageContext.request.contextPath}/admin/returnAdminHome"class="drop-down"
				style="color: black;">ADMIN</a></li>


			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" style="color: black;">STUDENT <b
					class="caret"></b></a>
				<ul class="dropdown-menu" style="">
					<li><a href="#">MANAGE STUDENT</a></li>
					<li><a href="#">ATTENDENCE</a></li>
					<li><a href="#">FEE DETAILS</a></li>
				</ul></li>


			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" style="color: black;">EMPLOYEE <b
					class="caret"></b></a>
				<ul class="dropdown-menu" style="">
					<li><a href="#">MANAGE EMPLOYEE</a></li>
					<li><a href="#">ATTENDENCE</a></li>
					<li><a href="#">SALARY</a></li>
				</ul></li>

		</ul>
	</div>
	</nav>

	<script>
		$('ul.nav li.dropdown').hover(
				function() {
					$(this).find('.dropdown-menu').stop(true, true).delay(200)
							.fadeIn(200);
				},
				function() {
					$(this).find('.dropdown-menu').stop(true, true).delay(200)
							.fadeOut(500);
				});
	</script>





	<!-- Login start -->
	<div class="container-sm-12">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10" style="padding: 20px;">
				<div class="grid_3"
					style="border:1px solid;background-color:#d3d8df;border-radius:10px;box-shadow: 0 0 10px #888888;">
					<legend
						style="width: 100%; height: 15%; border-top-left-radius: 10px; border-top-right-radius: 10px; background-color: #F69876; background: -webkit-gradient(linear, left top, left bottom, color-stop(0, rgba(255, 255, 255, .2)), color-stop(100%, rgba(0, 0, 0, .2))) #09c; background: -webkit-linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; background: -o-linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; background: -ms-linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; background: linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; color: #000000; color: #000000; font-size: 180%; padding: 0 0 0 40%;">
						<img src="${images}/signup.png"
							style="width: 45px; height: 35px;"><i
							style="padding: 5px 0 5px 0;">&nbsp;Search Student</i>
					</legend>


 <form action="${pageContext.request.contextPath}/admin/getStudentByID">
   





 
  <div class="form-group">
    <label for="email">Student Roll No:</label>
    <input type="text" class="form-control" name="niraj">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>

<%-- 
					 <form style="margin: 5%;" action="${pageContext.request.contextPath}/admin/getStudentByID/{id}"  enctype="multipart/form-data" method='GET'>
						<input class="form-control" type="text" name="stuId" pl>
						
					</form>  --%>
									
				</div>
			</div>


			<div class="col-md-1"></div>

		</div>
	</div>
	<!-- login form end -->






	<footer>
		<div class="container">
			<div class="row" style="background-color: #d3d8df;">
				<div class="col-sm-4" id="brand-footer">
					<p>
						<img src="${images}/logo.png" alt="Tech Altum Logo"
							style="color: blue; margin-left: 80px;">
					</p>

					<p style="color: black; margin-left: 105px;">Copyright &copy;
						2016</p>
					

					<p>
						<a class="two" href="" target="_blank" style="margin-left: 107px;">Follow
							on Twitter</a>
					</p>


					<p>
						<a class="two" href="" target="_blank" style="margin-left: 100px;">Follow
							on Facebook</a>
					</p>

				</div>
				<div class="col-sm-4" id="contacts-footer">
					<h4>Contact US</h4>

					<ul itemscope itemtype="#">
						<li><i class="icon-home"></i> <span itemprop="address">VISHAAL
								INFOTECH WORLD WELFARE SOCIETY</span></li>
						<li><i class="icon-home"></i> <span itemprop="address">Village
								& Post Bhuili Khas (Adalhat)</span></li>
						<li><i class="icon-home"></i> <span itemprop="address">Tahseel
								Chunar</span></li>
						<li><i class="icon-home"></i> <span itemprop="address">District
								Mirzapur,U.P (231302)</span></li>
						<li><i class="icon-phone"></i> Telephone: <span
							itemprop="telephone">+91-9598962010</span></li>
						<li><i class="icon-phone"></i> Telephone: <span
							itemprop="telephone">+91-9415092404</span></li>
						<li><i class="icon-envelope"></i> Email: <a href="">info@vitworld.in</a>
						</li>
					</ul>
					<hr>


					<!--Bottom Left Link-->

				</div>
				<div class="col-sm-4" id="quick-links">
					<h4>Quick links</h4>
					<ul>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Our Profile</a></li>
						<li><a href="#">Our Services</a></li>
						<li><a href="#">Our Branches</a></li>
						<li><a href="#">Our Courses</a></li>

						<li><a href="#">Our Certificates</a></li>

					</ul>
					<hr>
					<ul>
						<li style="padding: 0 0 3px 0;"><a href="#">A.D.C.A</a></li>
						<li style="padding: 3px 0 3px 0;"><a href="#">A.D.C.F.A</a>
						</li>
						<li style="padding: 3px 0 3px 0;"><a href="">A.D.F.A</a></li>
						<li style="padding: 3px 0 3px 0;"><a href="">A.D.D.A</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
	<!--Bottom Left Link end here-->


	<section>
		<div class="row"
			style="background-color:#C1BFC0; margin-left: 0; width: 100%;">
			<div class="navbar-header col-lg-2">
				<a class="navbar-brand"
					style="font-family: 'RBNo2Light'; font-size: 36px; letter-spacing: 2px; font-weight: bold;"
					href="#">VIT</a>
			</div>
			<div class="col-lg-3">
				<a class="navbar-brand" href="#" style="font-size: 12px;">Reg.
					No.UP358//434/VIT/0809/1314</a>
			</div>
			<div class="col-lg-5">
				<a class="navbar-brand" href="http://www.supersoftitsolutions.com"
					target="_blank">Designed & Developed by Supersoft IT Solutions</a>
			</div>
			<div class="navbar-header col-lg-2">
				<a class="navbar-brand"
					style="font-family: 'RBNo2Light'; font-size: 36px; margin-top: -10px; font-weight: bold;"
					href="http://www.supersoftitsolutions.com" target="_blank"> <img
					src="${images}/unnamed.png" width="30" height="30"
					alt="Supersoft IT Solutions Noida" />
				</a>
			</div>
		</div>
	</section>


	<section>
		<div class="row"
			style="text-align: center; margin-left: 0; width: 100%;">
			<p style="margin: 0 0 0 0; padding: 10px;">Copyright © 2016 VIT
				World All Right Reserved.</p>
		</div>
	</section>
	<div id="fb-root"></div>


</body>
</html>
