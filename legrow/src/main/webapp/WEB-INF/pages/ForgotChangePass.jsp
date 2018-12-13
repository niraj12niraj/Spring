<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change</title>


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
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<div class="container row">
<div class="col-sm-4"></div>
		<div class="col-sm-5" style="margin-top: 4%">
		<c:if test="${msg != null}">
		<h4>${msg}</h4></c:if>
		<c:if test="${name=='match'}">
					<form action="${pageContext.request.contextPath}/setNewPassword"
						style="background-color: #F5f5f5; box-shadow: 0px 0px 5px #800000; margin-bottom: 30px"
						method="post">
						<h3  class="text-center" style=" background-color:maroon;height:40px;color:white;padding-top: 5px">Change Your Password</h3>
						<table class="table">
						
							<input type="hidden" name="email1" value="${email }">
							<tr>
								<td>New Password:</td>
								<td><input type="password" class="form-control" id="newpass"name="newPWD" placeholder="Enter New Password"/></td>
							</tr>
							
							<tr>
								<td>Confirm Password:</td>
								<td><input type="password" class="form-control" id="confpass" name="cnfPWD" placeholder="Enter Confirm Password"/></td>
							</tr>
						
							

							<tr>
								<td><!-- <input type="button"
									style="width: 200px; float-right: -1px"
									class="btn btn-primary btn-xl pull-right" value="Edit"
									onclick="myFunction()" /> --></td>
								<td><button id="changePwd" type="submit"
											class="btn btn-info btn-block">
											<span class="glyphicon glyphicon-off"></span>Change
										</button></td>
							</tr>
						</table>
					
					</form>
					</c:if>
					<c:if test="${name=='notmatch'}">
					<!-- <h3>You are not authorized person...</h3> -->
					</c:if>
				</div>
</div>


</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>