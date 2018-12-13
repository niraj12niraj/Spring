<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<!-- <meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="resources/assets/bootstrap/css/bootstrap.min.css">
 -->

<!-- 
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>-->


<%-- <title>Registration</title> 
<jsp:include page="header.jsp"></jsp:include>  --%>


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
</style>

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
						 <a href="#"
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



				<li><a href="" class="drop-down" style="color: black;">ADMIN
						</a></li>
				
				

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" style="color: black;">STUDENT <b
						class="caret"></b></a>
					<ul class="dropdown-menu" style="">
						<li><a href="#">ATTENDENCE</a></li>
						<li><a href="#">FEE DETAILS</a></li>
					</ul></li>


				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" style="color: black;">EMPLOYEE <b
						class="caret"></b></a>
					<ul class="dropdown-menu" style="">
						<li><a href="#">EMPLOYEE SCHEDULE</a></li>
						<li><a href="#">SALARY</a></li>
					</ul></li>
					<li><a href="${pageContext.request.contextPath}/admin/changeadminPass" class="drop-down" style="color:black;padding:30px 90-=-px 40px 100px;">CHANGE PASSWORD</a>
				<li><a href="#" class="drop-down" style="color: black;">LOGOUT
						</a></li>
				
				
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








</head>
<body>

	
<div class="conttainer row">
<div class="col-sm-2"></div>
		<div class="col-sm-10" style="margin-top: 2%">
					<form action="${pageContext.request.contextPath}/saveSignUp"
						style="background-color: #C1BFC0; box-shadow: 0px 0px 5px #800000; margin-bottom: 30px"
						method="post">
						<h3  class="text-center" style=" background-color:maroon;height:40px;color:white;padding-top: 5px">Register Now</h3>
						<table class="table">
							<%-- <tr class="bg-primary">
								<th class="text-center">Register Now</th>
								<th>${user.name}</th>
							</tr> --%>
							<tr>
								<td>Name:</td>
								<td>  <input type="text" class="form-control" name="fullName" placeholder="Enter Name" required/></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input type="email" class="form-control" name="email" placeholder="Enter email"required/></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td> <input type="password" class="form-control" name="password" placeholder="Enter PASSWORD" required/></td>
							</tr>
							<tr>
								<td>Select Role:</td>
								<td> <select class="form-control" name="authority" required/>
                            <option value="">SELECT ROLE</option>
                            <option value="ROLE_STUDENT">STUDENT</option>
                            <!-- <option value="ROLE_CUSTOMER">CUSTOMER</option> -->
                            <option value="ROLE_EMPLOYEE">EMPLOYEE</option>
                           <!--  <option value="ROLE_ADMIN">ADMIN</option> -->
                        </select></td>
							</tr>
							<tr>
								<td>Contact No:</td>
								<td> <input type="text" class="form-control" name="mobileNumber" placeholder="Enter Mobile Number" required /></td>
							</tr>
							<tr>
								<td>Address:</td>
								<td>  <textarea rows="2" class="form-control" name="address" placeholder="Enter Address With Plot Number" required></textarea></td>
							</tr>
							<tr>
								<td>City:</td>
								<td>  <input type="text" class="form-control" name="city" placeholder="Enter City Name" required /></td>
							</tr>
							<tr>
								<td>State:</td>
								<td><select class="form-control" name="state" id="sel1" required>
                        <option value="">STATE</option>
                        <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
                        <option value="Andhra Pradesh">Andhra Pradesh</option>
                        <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                        <option value="Assam">Assam</option>
                        <option value="Bihar">Bihar</option>
                        <option value="Chandigarh">Chandigarh</option>
                        <option value="Chhattisgarh">Chhattisgarh</option>
                        <option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
                        <option value="Daman and Diu">Daman and Diu</option>
                        <option value="Delhi">Delhi</option>
                        <option value="Goa">Goa</option>
                        <option value="Gujarat">Gujarat</option>
                        <option value="Haryana">Haryana</option>
                        <option value="Himachal Pradesh">Himachal Pradesh</option>
                        <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                        <option value="Jharkhand">Jharkhand</option>
                        <option value="Karnataka">Karnataka</option>
                        <option value="Kerala">Kerala</option>
                        <option value="Lakshadweep">Lakshadweep</option>
                        <option value="Madhya Pradesh">Madhya Pradesh</option>
                        <option value="Maharashtra">Maharashtra</option>
                        <option value="Manipur">Manipur</option>
                        <option value="Meghalaya">Meghalaya</option>
                        <option value="Mizoram">Mizoram</option>
                        <option value="Nagaland">Nagaland</option>
                        <option value="Orissa">Orissa</option>
                        <option value="Pondicherry">Pondicherry</option>
                        <option value="Punjab">Punjab</option>
                        <option value="Rajasthan">Rajasthan</option>
                        <option value="Sikkim">Sikkim</option>
                        <option value="Tamil Nadu">Tamil Nadu</option>
                        <option value="Tripura">Tripura</option>
                        <option value="Uttaranchal">Uttaranchal</option>
                        <option value="Uttar Pradesh">Uttar Pradesh</option>
                        <option value="West Bengal">West Bengal</option>
                    </select></td>
							</tr>
							<tr>
								<td>Country :</td>
								<td> <input type="text" placeholder="COUNTRY" class="form-control" value="INDIA" readonly></td>
							</tr>
							<tr>
								<td>Pin Code:</td>
								<td> <input type="text" class="form-control" name="pincode" placeholder="Enter Pincode" required /></td>
							</tr>
							<tr>
								<td>Your Website:</td>
								<td> <input type="url" class="form-control" name="website" placeholder="Enter Website if any"/><p style="font-size: 11px;color:red;">Example :- http:/www.example.com</p></td>
							</tr>

							<tr>
								<td><!-- <input type="button"
									style="width: 200px; float-right: -1px"
									class="btn btn-primary btn-xl pull-right" value="Edit"
									onclick="myFunction()" /> --></td>
								<td><input type="submit" style="width: 200px"
									class="btn btn-info btn-xl center-block" value="Register" /></td>
							</tr>
						</table>
						<%-- <input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" /> --%>
					</form>
				</div>
</div>

<!-- 
				Javascript
				<script src="resources/assets/js/jquery-1.11.1.min.js"></script>
				<script src="resources/assets/bootstrap/js/bootstrap.min.js"></script>
				<script src="resources/assets/js/jquery.backstretch.min.js"></script>
				<script src="resources/assets/js/retina-1.1.0.min.js"></script>
				<script src="resources/assets/js/scripts.js"></script>
 -->
				<!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->
<footer>
		<div class="container" style="background-color:#d3d8df;">
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

 <%-- <jsp:include page="footer.jsp"></jsp:include>  --%>
</body>
</html>