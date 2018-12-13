
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
   
    <title>Contact US</title>
      
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
                <img src="" style="width:100%;" class="home_banner"/>
            </div>
              <div class="col-md-12"> <h3 style="text-align:center; background-color:#800000;border-radius:10px 10px 10px 10px; height:50px; line-height:50px;color:#ffffff;">CONTACT US</h3>

              </div>       
            <div class="page_content" >
				 <div class="col-md-12" style="margin-top:30px;">
				  
				   <div class="col-md-6" style=" border: 2px solid rgba(255, 255, 255, 1); -webkit-box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.1);-moz-box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.1); box-shadow: 0 0 4px 2px rgba(0, 0, 0, 0.15); background-color:rgba(255, 255, 255, 1);">
				 
                              <div style="background-color: rgba(0,0,0,.1); width:105%; margin-left:-15px; padding: 0px; text-align: center; /*margin:10px 0px 10px 0px;*/ height:40px;">
                                <h3 style="margin: 0; padding-top:6px; color: #3a87ad">Stay in touch</h3>
                               </div>
                
                    
                    <div class="row" style="margin-top: 10px;">
                    
                     <form action="http://www.smsjust.com/blank/sms/user/urlsms.php?" class="form-horizontal"  method="post" name="my_form" target="popup"  onsubmit="window.open('', this.target,    'width=15px,height=3px,resizable,scrollbars=no'); return true;window.close().TimeRanges(1000)">
    <input type="hidden" class="form-control" name="username" value="Leggrow" placeholder="ENTER USERNAME" required/>


                <input type="hidden" class="form-control" name="pass" value="1234" placeholder="ENTER PASSWORD" required>
           
					
               <input type="hidden" class="form-control" name="senderid" value="LEGGRO" placeholder="ENTER SENDER ID" required/>
<!-- 9971493685 -->
                <form tyle="margin: 5%;" action="${pageContext.request.contextPath}/admin/getStudentById/{id}"  enctype="multipart/form-data" method='POST'>
                
                <div class="col-md-4"><input type="number" class="form-control" name="mobile" value = "${stu.mobile}" placeholder="ENTER RECIPIENT NUMBER" required/></div>
          <div class="form-group">
            </form>
            
             <form style="margin: 5%;" action="${pageContext.request.contextPath}/admin/getMobileByID"  enctype="multipart/form-data" method='POST'>
						<table style="width: 100%;">
							<tr>					
								  <td>Student Id</td>
								  <input type="text" class="form-control" name="vivek" size="10">
								  <button type="submit" class="btn btn-default">Get Phone</button>
								
            </form>
                    
							<!-- <label for="name" class="col-sm-2 control-label">Contact No</label> -->
							<!-- <div class="col-sm-8">
								<input type="hidden" id="txtInput" class="form-control" id="name" name="dest_mobileno" placeholder="Contact Number" value = "9911938869" required/>  9971493685 
							</div> -->
						</div>
           
            <input type="hidden" name="messagetype" value="TXT"/>

		<div class="form-group">
					<label for="message" class="col-sm-2 control-label">Message</label>
							<div class="col-sm-8">
                     <textarea type="hidden" rows="4" name="message" id="txtComment" class="form-control" onKeyPress=check_length(this.form); onKeyDown=check_length(this.form); cols="50" maxlength="160" value=""></textarea>
			</div>
		</div>

                <script language=JavaScript>
            
                </script>

                <input type="hidden" name="response"  value="Y"/>

            
           <div class="form-group">
								<div class="col-sm-10 col-sm-offset-2">
              <input  type="submit" class="btn btn-info" value=" Submit" id="btnsubmit" onclick="submitForm()"/>
		</div>
            </div>
      
                    
        
    </form>
             
     
                    
     <script>
        function submitForm() {
        	   // Get the first form with the name
        	   // Hopefully there is only one, but there are more, select the correct index
        	   var frm = document.getElementsByName('contact-form')[0];
        	   frm.submit(); // Submit
        	   frm.reset();  // Reset
        	   return false; // Prevent page refresh
        	}
        </script>    
                        
                    
                 <!--    
                   <form class="form-horizontal" role="form" method="post" action="index.php">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Name</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="name" name="name" placeholder="First & Last Name" value="">
							</div>
						</div>
	
						<div class="form-group">
							<label for="message" class="col-sm-2 control-label">Message</label>
							<div class="col-sm-8">
								<textarea class="form-control" rows="4" name="message" placeholder="Type your message with contact no."></textarea>
							</div>
						</div>
							<div class="form-group">
								<div class="col-sm-10 col-sm-offset-2">
									<input id="submit" name="submit" type="submit" value="Send" class="btn btn-info">
								</div>
	                         </div>
						
                 </form>    -->

         
        </div>

</div>
<div class="col-md-6">

        <div style=" border: 2px solid rgba(255, 255, 255, 1); -webkit-box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.1);-moz-box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.1); box-shadow: 0 0 4px 2px rgba(0, 0, 0, 0.15); background-color:rgba(255, 255, 255, 1);">
 
                              <div style="background-color: rgba(0,0,0,.1); padding: 0px; text-align: center; /*margin:10px 0px 10px 0px;*/ height:40px;">
                                <h3 style="margin: 0; padding-top:6px; color: #3a87ad">Address</h3>
                               </div>

            <div style="width:100%;margin:20px 0px 20px 50px;">


               
                   <div><b>India:</b></div>
                <div style="margin-left: 100px;margin-top: -20px;"><p>C-54,3rd Floor,  <br />Sector 2, Noida<br /> Pincode-201301  <br />Uttar Pradesh,India <br />Contact Number:+919205714491.  </p></div>
                  
                <br><br><br>
                 </div>

            <p>Support Email: <a href="mailto:vitworld.com">info@vitworld.in</a></p>

        </div>

	</div>



    
   </div>

            </div>

    </div>

   
   <br><br><br><br><br>
    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
