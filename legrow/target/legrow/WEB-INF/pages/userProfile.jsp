

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<%@ page import="java.util.*"%>
<%@ page import="java.security.*"%>




<%!public boolean empty(String s) {
		if (s == null || s.trim().equals(""))
			return true;
		else
			return false;
	}%>
<%!public String hashCal(String type, String str) {
		byte[] hashseq = str.getBytes();
		StringBuffer hexString = new StringBuffer();
		try {
			MessageDigest algorithm = MessageDigest.getInstance(type);
			algorithm.reset();
			algorithm.update(hashseq);
			byte messageDigest[] = algorithm.digest();

			for (int i = 0; i < messageDigest.length; i++) {
				String hex = Integer.toHexString(0xFF & messageDigest[i]);
				if (hex.length() == 1)
					hexString.append("0");
				hexString.append(hex);
			}

		} catch (NoSuchAlgorithmException nsae) {
		}

		return hexString.toString();
	}%>
<%
	String merchant_key = "gtKFFx";
	String salt = "eCwWELxi";
	String action1 = "";
	//	String base_url="https://secure.payu.in";
	String base_url = "https://test.payu.in";
	int error = 0;
	String hashString = "";

	Enumeration paramNames = request.getParameterNames();
	Map<String, String> params = new HashMap<String, String>();
	while (paramNames.hasMoreElements()) {
		String paramName = (String) paramNames.nextElement();

		String paramValue = request.getParameter(paramName);
		params.put(paramName, paramValue);
	}
	String txnid = "";
	if (empty(params.get("txnid"))) {
		Random rand = new Random();
		String rndm = Integer.toString(rand.nextInt()) + (System.currentTimeMillis() / 1000L);
		txnid = hashCal("SHA-256", rndm).substring(0, 20);
	} else
		txnid = params.get("txnid");
	String txn = "abcd";
	String hash = "";
	String hashSequence = "key|txnid|amount|productinfo|firstname|email|udf1|udf2|udf3|udf4|udf5|udf6|udf7|udf8|udf9|udf10";
	if (empty(params.get("hash")) && params.size() > 0) {
		if (empty(params.get("key")) || empty(params.get("txnid")) || empty(params.get("amount"))
				|| empty(params.get("firstName")) || empty(params.get("email"))
				|| empty(params.get("phoneNumber")) || empty(params.get("productinfo"))
				|| empty(params.get("surl")) || empty(params.get("furl")))

			error = 1;
		else {
			String[] hashVarSeq = hashSequence.split("\\|");

			for (String part : hashVarSeq) {
				hashString = (empty(params.get(part)))
						? hashString.concat("")
						: hashString.concat(params.get(part));
				hashString = hashString.concat("|");
			}
			hashString = hashString.concat(salt);

			hash = hashCal("SHA-512", hashString);
			action1 = base_url.concat("/_payment");
		}
	} else if (!empty(params.get("hash"))) {
		hash = params.get("hash");
		action1 = base_url.concat("/_payment");
	}
%>


<html>
<script>
    var hash='<%=hash%>';
	function submitPayuForm() {

		if (hash == '')
			return;
		var payuForm = document.forms.payuForm;
		payuForm.submit();
	}
</script>


<head>

<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
href="https://cdn.datatables.net/1.10.10/css/dataTables.bootstrap.min.css">
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<script
src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
<script
src="https://cdn.datatables.net/1.10.10/js/dataTables.bootstrap.min.js"></script>
</head> 


 <%@include file="header.jsp"%>


<script>
    $(document).ready(function() {

        $('#changePwd').click(function(event){

            data = $('#newpass').val();
            var len = data.length;

            if(len < 1) {
                alert("Password cannot be blank");
                // Prevent form submission
                event.preventDefault();
            }

            if($('#newpass').val() != $('#confpass').val()) {
                alert("Password and Confirm Password don't match");
                // Prevent form submission
                event.preventDefault();
            }
            else{
                confirm("Are you sure ? to change your password !");
            }

        });
    });
</script>

<!-- <script type="text/javascript">
	$(document).ready(function() {
		$('input[type="radio"]').click(function() {
			if ($(this).attr("value") == "red") {
				$(".box").not(".red").hide();
				$(".red").show();
			}
			if ($(this).attr("value") == "green") {
				$(".box").not(".green").hide();
				$(".green").show();
			}
			if ($(this).attr("value") == "blue") {
				$(".box").not(".blue").hide();
				$(".blue").show();
			}
		});
	});
</script>
 -->




 <script type="text/javascript">
	$(document).ready(function() {
		$('#example').DataTable({
			sort : false,
			bFilter : false,
			bInfo : false,
// 			"paging": false,
			"ordering" : false,
			"info" : true
		});
	});
</script>


<%--  <jsp:include page="header.jsp"></jsp:include> --%>

<body onload="submitPayuForm();">
<style>
._sidebar {
	float: left;
	width: 100%;
	padding: 5px 5px 5px 5px;
}

.white_box {
	border-right: 2px solid #D6D6D6;
	border-bottom: 2px solid #D6D6D6;
	background: #ffffff;
	margin-top: 7px;
}
</style>
	


	<div class="container-fluid"  style="margin-top: 10px;">
		<%--    <div class="row">--%>
		<div class="container-fluid" style="background-color: rgb(242, 242, 242);">
			<div class="row">

				<div class="col-md-2">


					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/showPaymentDetails?name=payment"
								class="">Payment</a>
							</strong>
						</div>
					</div>

					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/hostelRegistration?name=hostel">Hostel
									Registration</a>
							</strong>
						</div>
					</div>

					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/pgRegistration?name=pg">PG
									Registration</a>
							</strong>
						</div>
					</div>

					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/hotelRegistration?name=hotel">Hotel
									Registration</a>
							</strong>
						</div>
					</div>

					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/editHostel?name=editHostel">Edit Hostel
									</a>
							</strong>
						</div>
					</div>
					
					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/editHostel?name=editHotel">Edit Hotel
									</a>
							</strong>
						</div>
					</div>
					
					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a
								href="${pageContext.request.contextPath}/user/editPG?name=editPG">Edit PG
									</a>
							</strong>
						</div>
					</div>
					

					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a href="${pageContext.request.contextPath}/user/showNotifications?name=notifications"
								class="">Registration Notifications<span style="color: red;"><i class="mdi-social-notifications"><small class="notification-badge">${notification}</small></i></span></a>
							</strong>
						</div>
					</div>
					
					<div class="_sidebar white_box" style="font-size: 14px;">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name"> <a href="${pageContext.request.contextPath}/user/showSellerInquiryDetails?name=inquiryDetails"
								class="">Query Notifications<span style="color: red;"><i class="mdi-social-notifications"><small class="notification-badge">${sellerInquiries}</small></i></span></a>
							</strong>
						</div>
					</div>
					

					<div class="_sidebar white_box" style="">
						<div>
							<%-- class="filter_panel_tabs1"--%>
							<strong class="left-side-filter-name" style="font-size: 14px;">Manage
								My Account</strong>
						</div>

						<div>
							<a
								href="${pageContext.request.contextPath}/user/updateProfile?name=updateProfile">Update
								Profile </a>
						</div>
						<div>
							<a
								href="${pageContext.request.contextPath}/user/changePassword?name=updatePassword">Update
								Password </a>
						</div>

					</div>

					<!--</div>-->
				</div>
				<!--sidebar end-->


				<div class="col-md-8" style="margin-top: 8px; background-color: rgb(242, 242, 242);">
					<c:if test="${name =='payment'}">
						<div class="row">
							<div class="heading" style="height: 50px;">
								<p 
									style="text-align: center; background-color:#800000; color:white;font-size: 18px; padding-top: 5px;">Payment
									Details</p>
							</div>
						</div>

						<div class="row"
							style="background-color: #ffffff; margin-top: -5px;">
							<div class="col-md-12" style="box-shadow: 0px 0px 5px #006600;">

								
							</div>

						</div>

					</c:if>


					<c:if test="${name =='hostel'}">
						<img style="width: 130%; height: 29%; background-color: white;"
							src="1.jpg" alt="www.legrow.com" />
					</c:if>


					<c:if test="${name =='pg'}">
						<img style="width: 130%; height: 29%; background-color: white;"
							src="1.jpg" alt="www.legrow.com" />
					</c:if>

					<c:if test="${name =='hotel'}">
						<img style="width: 130%; height: 29%; background-color: white;"
							src="1.jpg" alt="www.legrow.com" />
					</c:if>

					<c:if test="${name =='queryList'}">
						<div class="row">
							<div class="heading" style="height: 50px;">
								<p class="bg-primary"
									style="text-align: center; font-size: 18px; padding-top: 5px;">Notification
									Details</p>
							</div>
						</div>

						<div class="row"
							style="box-shadow: 0px 0px 5px #006600; background-color: #ffffff;">
							<div class="col-md-12">
								<h4>data from database</h4>
							</div>
						</div>

					</c:if>
					
		<c:if test="${name == 'notifications'}">

						<table class="table" id="example" style="background-color: white">
							<thead>
								<tr style="background-color: #800000; color: white">
									<th>Id</th>
									<th>Full Name</th>
									<th>Email Id</th>
									<th>Contact No</th>
									<!-- <th>QUERY</th> -->
									<th>Visiting Date</th>
									<th>Action</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${inqueryList}" var="st">
									<tr>
										<td>${st.id}</td>
										<td>${st.fullName}</td>
										<td>${st.emailId}</td>
										<td>${st.contactNo}</td>
										<%-- <td>${st.query}</td> --%>
										<td>${st.visitingDate}</td>
										<td><a class="btn btn-danger"
											href="${pageContext.request.contextPath}/user/deleteInquery?name=${st.id}">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</c:if>

					<c:if test="${name=='inquiryDetails'}">


						<table class="table" id="example" style="background-color: white">
							<thead>
								<tr style="background-color: #800000; color: white">
									<th>Id</th>
									<th>Full Name</th>
									<th>Email Id</th>
									<th>Contact No</th>
									<th>QUERY</th>
									
									<th>Action</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${inqueryList}" var="st">
									<tr>
										<td>${st.id}</td>
										<td>${st.fullName}</td>
										<td>${st.emailId}</td>
										<td>${st.contactNo}</td>
										 <td>${st.query}</td> 
										<%-- <td>${st.visitingDate}</td> --%>
										<td><a class="btn btn-danger"
											href="${pageContext.request.contextPath}/user/deleteSellerInquery?name=${st.id}">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</c:if>

					<c:if test="${name =='updateProfile'}">
					<div class="col-sm-10" style="margin-top: -13px;">
						
					</div>
					</c:if>
			<c:if test="${name=='failed'}">
							
					
					<div class="row">
							<div class="heading" style="height: 50px;">
								<p class="bg-primary"
									style="text-align: center; font-size: 18px; padding-top: 5px;">Update
									Password</p>
							</div>
						</div>

						<div class="row" style="background-color: #ffffff">
							<div class="col-md-12">
								<div class="grid-4">
									<legend style="border: 0px solid #0f8200; width: 100%; height: 5%; border-top-left-radius: 10px; border-top-right-radius: 10px; background: #0f8200; color: #FFFFFF; font-size: 150%;">
										<b><center>Change Your Password</center></b>
									</legend>
									<p style="text-align: center; color:gray; font-size: 20px;">${change}</p>
									<form class="form-inline" style="margin: 5%;" name='loginForm'
										action="${pageContext.request.contextPath}/user/updatePassword"
										method='POST'>
										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-user"></span>Email ID</p>
													
											</div>
											<div class="col-md-8">
												<input type="text" class="form-control" style="width: 100%"
													id="email" name="email" placeholder="Enter enroll"
													value="${userEmail}" readonly="readonly">
											</div>
										</div>
										<br>

										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-eye-open"></span>
													Current Password</p>
													
											</div>
											<div class="col-md-8">
                                                <p style="color: red">${notEqual}</p>
												<input type="Password" class="form-control"
													style="width: 100%" id="psw1" name="oldPassword"
													placeholder="Enter old password">
													
											</div>
										</div>
										<br>

										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-eye-open"></span>New
													Password</p>
											</div>
											<div class="col-md-8">
												<input type="Password" class="form-control"
													style="width: 100%" id="newpass" name="newPassword"
													placeholder="Enter new password">
											</div>
										</div>
										<br>

										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-eye-open"></span>Confirm
													Password</p>
											</div>
											<div class="col-md-8">
												<input type="Password" class="form-control"
													style="width: 100%" id="confpass" name="confirmPassword"
													placeholder="Enter new password">
											</div>
										</div>
										<br>

										<button id="changePwd" type="submit"
											class="btn btn-success btn-block">
											<span class="glyphicon glyphicon-off"></span>Change
										</button>
									</form>
								</div>
							</div>
						</div>
					
             </c:if>
					<c:if test="${name =='updatePassword'}">

						<!-- <div class="row">
							<div class="heading" style="height: 50px;">
								<p class="bg-primary"
									style="text-align: center; font-size: 18px; padding-top: 5px;">Update
									Password</p>
							</div>
						</div> -->

						<div class="row" style="background-color: #ffffff">
							<div col-md-12>
								<div class="grid-4">
									<legend style="border: 0px solid #800000; width: 100%; height: 5%; border-top-left-radius: 10px; border-top-right-radius: 10px; background: #800000; color: #FFFFFF; font-size: 150%;">
										<b><center>Change Your Password</center></b>
									</legend>
									<p style="text-align: center; color:gray; font-size: 20px;">${change}</p>
									<form class="form-inline" style="margin: 5%;" name='loginForm'
										action="${pageContext.request.contextPath}/user/updatePassword"
										method='POST'>
										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-user"></span>Email ID</p>
													
											</div>
											<div class="col-md-8">
												<input type="text" class="form-control" style="width: 100%"
													id="email" name="email" placeholder="Enter enroll"
													value="${userEmail}" readonly="readonly">
											</div>
										</div>
										<br>

										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-eye-open"></span>
													Current Password</p>
													 <p style="color: red">${notEqual}</p>
											</div>
											<div class="col-md-8">

												<input type="Password" class="form-control"
													style="width: 100%" id="psw1" name="oldPassword"
													placeholder="Enter old password">
											</div>
										</div>
										<br>

										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-eye-open"></span>New
													Password</p>
											</div>
											<div class="col-md-8">
												<input type="Password" class="form-control"
													style="width: 100%" id="newpass" name="newPassword"
													placeholder="Enter new password">
											</div>
										</div>
										<br>

										<div class="row">
											<div class="col-md-4">
												<p><span class="glyphicon glyphicon-eye-open"></span>Confirm
													Password</p>
											</div>
											<div class="col-md-8">
												<input type="Password" class="form-control"
													style="width: 100%" id="confpass" name="confirmPassword"
													placeholder="Enter new password">
											</div>
										</div>
										<br>

										<button id="changePwd" type="submit"
											class="btn btn-info btn-block">
											<span class="glyphicon glyphicon-off"></span>Change
										</button>
									</form>
								</div>
							</div>
						</div>

					</c:if>
					
					
				</div>

			</div>
			<br>

			<%-- <div class="row" style="background-color: white; margin-left: 0px;">
				<div class="col-md-12" style="margin-left: -13px;">
					<c:if test="${name =='hostel'}">
						<jsp:include page="hostelRegistration.jsp"></jsp:include>
					</c:if>

					<c:if test="${name =='pg'}">
						<jsp:include page="pgRegistration.jsp"></jsp:include>
					</c:if>

					<c:if test="${name =='hotel'}">
						<jsp:include page="hotelRegistration.jsp"></jsp:include>
					</c:if>
				</div>

			</div>
 --%>



		</div>
	</div>




	<!-- Footer Start -->
	<%-- <jsp:include page="footer.jsp"></jsp:include> --%>
	<!-- 
 <div class="container-fluid">
	   <div class="row">
	   <div class="col-md-12">
	      <footer>
	<div class="s1-footer">
		<div class="footer-wrap cm-wrap">
			<div class="footer-main">
				<div>
					
				</div>
				
			</div>
			<div class="footer-bottom">
			<div class="footer-wrap cm-wrap">
			<div class="footer-main">
			<div><span>
			<h4>Corporate</h4><ul>
						<li><a title="About us" href="about.html">About
								us</a></li>
						<li><a title="Contact us" href="#">Contact
								us</a></li>
										
						<li><a title="Terms &amp; conditions" 
							href="#">Terms &amp; conditions</a></li>
						<li><a title="Privacy policy" href="#">Privacy
								policy</a></li>
						<li><a title="Copyright policy"
							href="#">Copyright policy</a></li>
					</ul></span></div></div></div>
				<span>&copy; 2016 Copyright LeGrow. All Rights Reserved.</span>
				
			</div>
		</div>
	</div>
	
	
	<div class="sticky-chat">
		<div class="mob-call">
			<div class="callus">
				<span class="des-txt">Connect with us</span><span class="call-icon">
				 <i	class="ic-callus"></span></i><a class="mob-txt" href="tel:1800-3000-3232">Call</a>
				 <span class="des-txt">+919650436124</span>
			</div>
		</div>
	</div>



</footer>
	   </div>
	   
	   </div>
	</div> -->
	
<jsp:include page="footer.jsp"></jsp:include>	
</body>
</html>