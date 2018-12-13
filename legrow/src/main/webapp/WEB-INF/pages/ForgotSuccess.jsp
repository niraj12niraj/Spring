
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
   
    <title>Success</title>
      
      <link href="assets/css/bootstrap.css" rel="stylesheet" />
      
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

<link href="resources/css/bootstrap.css" rel='stylesheet' type='text/css'/>
<link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="resources/js/jquery.min.js"></script>
      
<style>
     img{
       height: 300px;
       width: 180px;
     }
</style>
    <style>
       .bg-image {
    position: relative;
}
.bg-image img {
    display: block;
    width: 100%;
    max-width: 1200px; /* corresponds to max height of 450px */
    margin: 0 auto;
}
.bg-image h1 {
    position: absolute;
    text-align: center;
    bottom: 0;
    left: 0;
    right: 0;
    color: white;
}
.nav, .main {
    background-color: #f6f6f6;
    text-align: center;
}
    </style>

</head>

<jsp:include page="header.jsp"></jsp:include>
<body class="sul-home hideCmnSearch">




<div class="container" style="padding-top: 20px;">
		<div class="row">
            <div class="col-md-12">
                <!-- <img src="resources/img/welcome.jpg" style="width:100%;" class="home_banner"/> -->
            </div>
              
            <div class="page_content" >
				 <div class="col-md-12" style="margin-top:30px;">
				  
		 <div class="col-md-2"></div>

    <div class="col-md-8">
 
        <div style=" border: 2px solid rgba(255, 255, 255, 1); -webkit-box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.1);-moz-box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.1); box-shadow: 0 0 4px 2px rgba(0, 0, 0, 0.15); background-color:rgba(255, 255, 255, 1);">
 
                              <div style="background-color: rgba(0,0,0,.1); padding: 0px; text-align: center; /*margin:10px 0px 10px 0px;*/ height:40px;">
                                <h3 style="margin: 0; padding-top:6px; color: #3a87ad">Welcome</h3>
                               </div>

            <div style="width:100%;margin:20px 0px 20px 50px;">


               
                <div style="margin-left: 100px;margin-top: -20px;"> <br><br>
                 <br>
                 <%-- <h4> Seller Email_ID${email}</h4> --%>
                   <br><br>
                   <P>Please check your email and reset your password
                   
              <br><br>
                <h4>Thank You...</h4></div></div>
                	<!-- <form action="paid" method="POST">
        <center>     <input type="submit" style="width: 200px"
									class="btn btn-info btn-xl center-block" value="Payment" /> 
                </form> -->
                
   <%--    <center>        <a href="${pageContext.request.contextPath}/user/showPaymentDetails?name=payment"><input type="button" class="btn btn-info" value="Payment" ></a> </center>
      --%> <br>
                 </div>

            <p>Support Email: <a href="mailto:leggrow.com">info@leggrow.com</a></p>

        </div>
 <div class="col-md-2"></div>
</div>

   </div>

            </div>

    </div>

   
   <br><br><br><br><br>
    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
