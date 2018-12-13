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


<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

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


<link href="resources/css/megamenu.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">

<link href="resources/css/font-awesome.css" rel="stylesheet">

<link rel="stylesheet" href="resources/css/overlay-bootstrap.min.css"
	media="screen">

<link rel="stylesheet" href="resources/css/fullwidth.css"
	media="screen">
<link rel="stylesheet" href="resources/css/settings.css"
	media="screen">

<link rel="stylesheet" href="resources/css/style2.css"
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
<script src="resources/js/wow.js"></script>
<script src="resources/js/demo.js"></script>
<script>new WOW().init();</script>
<script async src="resources/js/functions.js"></script>

<script src="resources/js/megamenu.js"></script>




<script>
        if (window.innerWidth > 768) {
            document.getElementById("fb-like123").innerHTML='<div class="fb-like-box" data-href="https://www.facebook.com/thetechaltum" data-width="310" data-height="auto" data-colorscheme="light" data-show-faces="true" data-header="true" data-stream="true" data-show-border="true"></div>';
        }
    </script>
      <spring:url value="/resources/images" var="images" />

<style>
.bgtcolor {
	position: absolute;
	width: 95%;
}

ul.social {
	float: right;
	list-style: outside none none;
	margin: 10px 15px 0 0;
	padding: 0;
	text-align: right;
	white-space: nowrap;
}

ul.social li {
	display: inline-block;
	height: 32px;
	margin-right: 0;
	position: relative;
	transition: all 0.2s ease 0s;
	width: 32px;
}

ul.social li:nth-of-type(-n+4) {
	margin-right: -30px;
}

ul.social:hover li, .touch ul.social li {
	margin-right: 0;
}

ul.social li:nth-of-type(1) {
	z-index: 5;
}

ul.social li:nth-of-type(2) {
	z-index: 4;
}

ul.social li:nth-of-type(3) {
	z-index: 3;
}

ul.social li:nth-of-type(4) {
	z-index: 2;
}

ul.social li:nth-of-type(5) {
	z-index: 1;
}

ul.social li a {
	border-radius: 32px;
	color: #fff;
	display: inline-block;
	font: bold 16px/1 Arial, Helvetica, sans-serif;
	height: 32px;
	overflow: hidden;
	position: relative;
	text-decoration: none;
	top: -4px;
	transform: rotate(360deg);
	transition: all 0.1s ease-in-out 0s;
	width: 32px;
}

ul.social li a:hover {
	transform: rotate(-360deg);
	transition: all 0.5s ease 0s;
}

ul.social li a::before {
	left: 50%;
	margin-left: -8px;
	margin-top: -8px;
	position: absolute;
	top: 50%;
}

ul.social li:hover a {
	top: -8px;
}

ul.social li a.fb {
	background: #3b5998 none repeat scroll 0 0;
}

ul.social li a.li {
	background: #0073b2 none repeat scroll 0 0;
}

ul.social li a.tt {
	background: #2daae1 none repeat scroll 0 0;
}

ul.social li a.gp {
	background: #f63e28 none repeat scroll 0 0;
}

ul.social li a.ig {
	background: #567ca4 none repeat scroll 0 0;
}

ul.social li a.fb:hover {
	background: #243c79 none repeat scroll 0 0;
}

ul.social li a.li:hover {
	background: #005397 none repeat scroll 0 0;
}

ul.social li a.tt:hover {
	background: #1a8dd4 none repeat scroll 0 0;
}

ul.social li a.gp:hover {
	background: #e13824 none repeat scroll 0 0;
}

ul.social li a.ig:hover {
	background: #385f8a none repeat scroll 0 0;
}

ul.social li a.fb::before {
	content: "f";
	margin-left: -4px;
}

ul.social li a.tt::before {
	content: "t";
}

ul.social li a.gp::before {
	content: "g";
}

ul.social li a.li::before {
	content: "in";
	margin-top: -9px;
}

ul.social li a.ig::before {
	content: "i";
	margin-top: -9px;
}

ul.social li a span {
	display: none;
}

.bgtcolor {
	background-color: #000;
}
.logout{
 height:80px;
 width :200px;
 background-color:green;
 box-shadow: 0px 0px 1px 1px lightgreen;

}
</style>

</head>




<body>

	<div class="bgtcolor" style="background-color: transparent;">
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

	</div>


	<!--Header-->

	<div id="top-bar" class="navbar" style="background-color:#C1BFC0;">
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
		style="background: #2d343E;">
		<div style="width: 100%; height: 12em;">
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-2">
						<a href="#"> <img class="img-responsive"
							style="max-width: 100%; margin-top: 30px; height: auto;"
							src="${images}/logo.png" />
						</a>
					</div>
					<div class="col-sm-6" style="margin-top: 30px;">
						<a href="#"> <img class="img-responsive"
							style="max-width: 100%; margin-left: -40px; padding-left: 2px; margin-top: 50px; height: auto;"
							src="${images}/test1.png" />
						</a>
					</div>
					<div class="col-sm-4">
						<div
							style="float: right; margin-right: 10%; margin-top: 7%; color: #007ec8;">
							<p>Conatct Us: +91-9598962010</p>
							<p></p>
							<p>
							<a href="${pageContext.request.contextPath}/logout" style="color: black;"class="btn btn-success">
							<i class="fa fa-lock" aria-hidden="true">LOGOUT
						</a></i>
						 <a href="#"
									style="color: white;" class="btn btn-danger"><i
									class="fa fa-camera"></i>&nbsp;&nbsp;Photo Gallery</a>
							</p>
							<p><a href="${pageContext.request.contextPath}/admin/changeadminPass" class="btn btn-warning" style="color:black;padding:30px 90-=-px 40px 100px;">CHANGE PASSWORD</a>
					</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>








	<script>
    $(document).ready(function()
    {
        $("#megamenu-button-mobile").click(function() {
            $(".megamenu").slideToggle(400);
        });
    });
</script>



	<nav>
		<div class="container-fluid" style="background-color:#3db4db;">
			<ul class="nav nav-pills">
				

				<li><a href="index.php" style="color: black"><i
						class="fa fa-home" style="font-size: 25px"></i>
					<!--Menu--></a></li>
				<li><a href="#" class="drop-down" style="color: black;">ABOUT
						US</a></li>



				<li><a href="#" class="drop-down" style="color: black;">COURSES</a>
				</li>



				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" style="color: black;">CAREER<b
						class="caret"></b></a>
					<ul class="dropdown-menu" style="">
						<li><a href="#"></a></li>
					</ul></li>
				
				<li><a href="" class="drop-down" style="color: black;">CONTACT
						US</a></li>



				<li><a href="${pageContext.request.contextPath}/admin/returnAdminHome" class="drop-down" style="color: black;">ADMIN
						</a></li>
				
				

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" style="color: black;">STUDENT <b
						class="caret"></b></a>
					<ul class="dropdown-menu" style="">
						<li><a href="${pageContext.request.contextPath}/admin/ExcelListDetail">ATTENDENCE</a></li>
						<li><a href="${pageContext.request.contextPath}/admin/StudentFeeListDetail">FEE DETAILS</a></li>
					</ul></li>


				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" style="color: black;">EMPLOYEE <b
						class="caret"></b></a>	
					<ul class="dropdown-menu" style="">
						<li><a href="#">EMPLOYEE SCHEDULE</a></li>
						<li><a href="#">SALARY</a></li>
					</ul></li>
					<li><li></li>
				
				
				<li><a href="#" class="drop-down" style="color:black;padding:30px 90-=-px 40px 100px;">WELCOME ADMIN</a>
				
				</li>

			</ul>
		</div>
	</nav>

	<script>$('ul.nav li.dropdown').hover(function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(10).fadeIn(200);
}, function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(10).fadeOut(500);
});</script>





	<!-- tiles starts from here-->
	<div class="container-fluid" style="box-shadow: 0 0 10px #000000;text-align:center;margin-left:2.5%; width:95%;">
    <div class="container" style="padding-top:2%;background-color:#d3d8df;">
        <div class="row" >

            <div class="col-md-3">
                <div class="panel panel-default" style="border-style:black 10%;background-color:#99ffdd;" >

                    <div class="panel-body" style="border red 1px solid;">
                        <img src="${images}/student.png" alt="" height="160" width="200;">
                        
                       <div class="panel-default-overlay-down" style="background: rgba(0, 0, 0, 0.8);overflow: hidden;-webkit-transition: all 0.5s;-moz-transition: all 0.5s;-o-transition: all 0.5s;transition: all 0.5s;">
                            <a href="${pageContext.request.contextPath}/admin/AddStudent" style="left: 0;right: 0;top: 20%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 100px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Add Students</a>
                            <a href="${pageContext.request.contextPath}/admin/StudentListDetail" style="left: 0;right: 0;top: 40%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 100px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Student List</a>
                            <a href="${pageContext.request.contextPath}/admin/SearchStudent" style="left: 0;right: 0;top: 60%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 200px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Search Student</a>
                            <a href="${pageContext.request.contextPath}/admin/StudentFeeRegister" style="left: 0;right: 0;top: 80%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 200px;height: 60px;text-align: center;color:#000;font-weight: 700;font-size: 14px;">Student Fee</a>
                        	
                        
                        </div>
					</div>
                </div>
            </div>
			
			
			
			
			
			
            <div class="col-md-3">
                <div class="panel panel-default" style="border-style:black 10%;background-color:#99ffdd;" >

                    <div class="panel-body">
                        <img src="${images}/department.png" alt="" height="160" width="200">
                        
                       <div class="panel-default-overlay-down" style="background: rgba(0, 0, 0, 0.8);overflow: hidden;-webkit-transition: all 0.5s;-moz-transition: all 0.5s;-o-transition: all 0.5s;transition: all 0.5s;">
                            <a href="${pageContext.request.contextPath}/admin/AddEmployee" style="left: 0;right: 0;top: 40%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 100px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Add Employee</a>
                            <a href="${pageContext.request.contextPath}/admin/EmployeeListDetail" style="left: 0;right: 0;top: 60%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 100px;height: 60px;text-align: center;color: #ffb3b3;font-weight: 700;font-size: 14px;">Employee List</a>
                            <a href="${pageContext.request.contextPath}/admin/SearchEmployee" style="left: 0;right: 0;top: 80%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 200px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Search Employee</a>
                        </div>
                    </div>
                </div>
            </div>	
			
			
			  <div class="col-md-3">
                <div class="panel panel-default" style="border-style:black 10%;background-color:#99ffdd;" >

                    <div class="panel-body" style="border red 1px solid;">
                        <img src="${images}/sms.png" alt="" height="160" width="200;">
                        
                       <div class="panel-default-overlay-down" style="background: rgba(0, 0, 0, 0.8);overflow: hidden;-webkit-transition: all 0.5s;-moz-transition: all 0.5s;-o-transition: all 0.5s;transition: all 0.5s;">
                           <a href="${pageContext.request.contextPath}/admin/contactUs.1" style="left: 0;right: 0;top: 40%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 100px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Send Message</a>
                          <a href="${pageContext.request.contextPath}/admin/saveExcel" style="left: 0;right: 0;top: 60%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 100px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Excel Storing for data</a>
                     	   <a href="${pageContext.request.contextPath}/admin/SearchAttedence" style="left: 0;right: 0;top: 80%;margin: -30px auto 0 auto;display: block;position: absolute;z-index: 100;width: 200px;height: 60px;text-align: center;color: #000;font-weight: 700;font-size: 14px;">Search Attedence </a>	
                     </div>
					</div>
                </div>
            </div>
					
           
        </div>
    </div>
  
</div>
	<!--tiles end here -->
	<hr>

	<footer>
		<div class="conttainer" style="background-color:#d3d8df;">
			<div class="row">
				<div class="col-sm-4" id="brand-footer">
					<p>
						<img src="${images}/logo.png" alt="Tech Altum Logo"
							style="color: blue; margin-left: 80px;">
					</p>

					<p style="color: black; margin-left: 100px;">Copyright &copy;
						2016</p>
					

					<p>
						<a class="two" href="" target="_blank" style="margin-left: 103px;">Follow
							on Twitter</a>
					</p>


					<p>
						<a class="two" href="" target="_blank" style="margin-left: 97px;">Follow
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
