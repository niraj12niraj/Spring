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
<!--<link href="css/bootstrap.css" rel="stylesheet"> -->

<link
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<!--Font-awsome -->
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">

<!--GOOGLE icon -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">


<link href="resources/css/megamenu.css"
	rel="stylesheet">
<link href="resources/css/style.css"
	rel="stylesheet">
<!--<link href="css/wow.css" rel="stylesheet"> -->
<link
	href="resources/css/font-awesome.css"
	rel="stylesheet">



<link rel="stylesheet"
	href="resources/css/fullwidth.css"
	media="screen">
<link rel="stylesheet"
	href="esources/css/settings.css"
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
	src="resources/js/resources/javascript/angular.min.js"></script>
<script src="resources/js/javascript/wow.js"></script>
<script
	src="resources/js/javascript/demo.js"></script>
<script>
																	new WOW().init();
																</script>
<script async
	src="resources/js/functions.js"></script>
<script
	src="resources/js/jquery-1.12.0.min.js"></script>

<script
	src="resources/js/javascript/megamenu.js"></script>




<script>
		if (window.innerWidth > 768) {
		document.getElementById("fb-like123").innerHTML = 
		<div class="fb-like-box" data-href="https://www.facebook.com/thetechaltum"
		data-width="310" data-height="auto" data-colorscheme="light"
		data-show-faces="true" data-header="true" data-stream="true"
		data-show-border="true"></div>
		
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


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script
	src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js"></script>
</head>




<body>

	<!-- <div class="bgtcolor" style="background-color: transparent;">
		<ul class="social" style="padding-left: 5%;">
			<li><a href="https://www.facebook.com/" class="fb"
				rel="nofollow" target="_blank"> <span>Facebook</span>
			</a></li>
			<li><a href="https://www.linkedin.com/uas/login" class="li"
				rel="nofollow" target="_blank"> <span>Linked In</span>
			</a></li>
			<li><a href="https://twitter.com/login?lang=en" class="tt"
				rel="nofollow" target="_blank"> <span>Twitter</span>
			</a></li>
			<li><a href="https://www.instagram.com/accounts/login/"
				class="ig" rel="nofollow" target="_blank"> <span>Instagram</span>
			</a></li>
			<li><a href="https://myaccount.google.com/?pli=1" class="gp"
				rel="nofollow" rel="publisher" target="_blank"> <span>Google+</span>
			</a></li>
		</ul>
 
	</div>-->


	<!--Header -->

	<div id="top-bar" class="navbar" style="background-color: #C1BFC0;">
		<div class="container">
			<!--style="line-height:30px;" -->
			<div class="row" style="line-height: 20px; padding-top: 20px;">
				<div class="col-sm-3">
					<i class='fa fa-phone'></i> +91-9415092404 &nbsp;&nbsp;&nbsp;&nbsp;
					<i class='fa fa-envelope'></i> <a href='mailto:info@ducatindia.com'
						style="color: black;">info@vitworld.in</a>
				</div>

				<div class="col-sm-2">
					<!--<i class='fa fa-envelope'></i> <a href='mailto:info@ducatindia.com'>info@ducatindia.com</a> -->
				</div>

				<div class="col-sm-5"></div>
				<div class="col-sm-2"></div>
			</div>
		</div>
	</div>




	<header class="container-fluid"
		style="background: ;">
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
						<p></p>
						<p>

							<a href="#" class="btn btn-primary" style="color: #ffffff;">
								<i class="fa fa-unlock-alt"></i>&nbsp;&nbsp;Login
							</a> <a href="#" style="color: white;" class="btn btn-danger"> <i
								class="fa fa-camera"></i>&nbsp;&nbsp;Photo Gallery
							</a>
						</p>
						<p></p>
					</div>
				</div>
			</div>
		</div>
	</div>
	</header>





	<script>

$(document).ready(function(){
    $('#myTable').DataTable();
});
</script>
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
			

			<li><a href="index.php" style="color: black"> <i
					class="fa fa-home" style="font-size: 25px"></i> <!--Menu -->
			</a></li>
			<li><a href="#" class="drop-down" style="color: black;">ABOUT
					US</a></li>



			<li><a href="#" class="drop-down" style="color: black;">COURSES</a>
			</li>



			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" style="color: black;"> CAREER <b
					class="caret"></b>
			</a>
				<ul class="dropdown-menu" style="">

					<li><a href="#"></a></li>
				</ul></li>

			<li><a href="" class="drop-down" style="color: black;">CONTACT
					US</a></li>



			<li><a href="${pageContext.request.contextPath}/admin/returnAdminHome" class="drop-down"
				style="color: black;">ADMIN</a></li>

			<li><a href="${pageContext.request.contextPath}/admin/returnAdminHome" class="drop-down" style="color: black;">STUDENT</a>
			</li>





			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" style="color: black;"> EMPLOYEE <b
					class="caret"></b>
			</a>
				<ul class="dropdown-menu" style="">
					<li><a href="#">EMPLOYE SCHEDULE</a></li>
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
					style="border: 1px solid; border-radius: 10px; box-shadow: 0 0 10px #888888;">
					<legend
						style="width: 100%; background-color: #d3d8df;height: 15%; border-top-left-radius: 10px; border-top-right-radius: 10px; background-color: #F69876; background: -webkit-gradient(linear, left top, left bottom, color-stop(0, rgba(255, 255, 255, .2)), color-stop(100%, rgba(0, 0, 0, .2))) #09c; background: -webkit-linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; background: -o-linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; background: -ms-linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; background: linear-gradient(top, rgba(255, 255, 255, .2) 0, rgba(0, 0, 0, .2) 100%) #09c; color: #000000; color: #000000; font-size: 180%; padding: 0 0 0 36%;">
						<img
							src="${images}/schedule.png"
							style="width: 45px; height: 35px;"> <i>Employee LIST</i>

					</legend>





					<form style="margin: 5%;" name='schedule'
						action="/VITWorld/j_spring_security_check" method='POST'>

						<table id="myTable" class="table table-striped table-bordered"
							cellspacing="0" width="100%">
							<thead>
								<tr><!-- 
									<td><input type="checkbox" class="checkthis" /></td> -->
									<td>id</td>
									<td>Photo</td>
									<td>Name</td>
									<td>Father Name</td> 
									<td>Email Id</td>
									<td>Mobile No.</td>
									<td>Edit</td>
									<td>Delete</td>
									<td>View</td>

								</tr>

							</thead>

							<tbody>
							<c:forEach items="${emp}" var="em">
							<tr>
							
							<td>${em.id}</td>
							<td>
					<img alt="Upload Image"
						src="${pageContext.request.contextPath}/admin/downloadEmpPhoto/${em.id}"
						style="height: 80px; width: 80px" />
					</td>	
							<td>${em.name}</td>
						    <td>${em.fatherName}</td>
				 			<td>${em.email}</td>	
							<td>${em.mobile}</td>							
							<td><a href="${pageContext.request.contextPath}/admin/updateEmployee?id=${em.id}" class="btn">Update</a></td>					
							<td><a href="${pageContext.request.contextPath}/admin/deleteEmpRegistrationByID/${em.id}" class="btn">delete</a></td>
							<td><a href="${pageContext.request.contextPath}/admin/viewEmployee?id=${em.id}" class="btn">View</a></td>
							</tr>
							</c:forEach>
							</tbody>

						</table>










						<div class="modal fade" id="edit" tabindex="-1" role="dialog"
							aria-labelledby="edit" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">
											<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
										</button>
										<h4 class="modal-title custom_align" id="Heading">Edit
											Your Detail</h4>
									</div>
									<div class="modal-body">
										<div class="form-group">
											<input class="form-control " type="text" placeholder="Mohsin">
										</div>
										<div class="form-group">

											<input class="form-control " type="text" placeholder="Irshad">
										</div>
										<div class="form-group">
											<textarea rows="2" class="form-control"
												placeholder="CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan"></textarea>


										</div>
									</div>
									<div class="modal-footer ">
										<button type="button" class="btn btn-warning btn-lg"
											style="width: 100%;">
											<span class="glyphicon glyphicon-ok-sign"></span>  Update
										</button>
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>



						<div class="modal fade" id="delete" tabindex="-1" role="dialog"
							aria-labelledby="edit" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">
											<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
										</button>
										<h4 class="modal-title custom_align" id="Heading">Delete
											this entry</h4>
									</div>
									<div class="modal-body">

										<div class="alert alert-danger">
											<span class="glyphicon glyphicon-warning-sign"></span> Are
											you sure you want to delete this Record?
										</div>

									</div>
									<div class="modal-footer ">
										<button type="button" class="btn btn-success">
											<span class="glyphicon glyphicon-ok-sign"></span>  Yes
										</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">
											<span class="glyphicon glyphicon-remove"></span>  No
										</button>
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>

						<td colspan="1"></td> <input type="hidden" name="" value="" />

					</form>
				</div>
			</div>






			<div class="col-md-2"></div>

		</div>
	</div>
	<!-- login form end -->

<br>

	<footer>
		<div class="container">
			<div class="row" style="background-color: #d3d8df;"">
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
	