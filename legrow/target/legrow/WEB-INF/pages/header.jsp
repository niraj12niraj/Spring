	<%@ page import="java.util.*" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
    <!-- header.jsp -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-hover-dropdown/2.2.1/bootstrap-hover-dropdown.min.js"></script>


   

    
    <spring:url value="/resources/images/lock.png" var="lock" />
     <spring:url value="resources/images/logo.png" var="logo" />

    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }
    </style>

    <style>
        .horizontal
        {
            display: inline;
            padding:20px;
        }

        .CateWapp-Border
        {
            padding-right:10px;
            padding-left:10px;
        }

        .CategoryName
        {
            font-size:13px;
            padding-left:3px;
        }

        .ChangeColor
        {
            text-align: center;
        }

        .ChangeColor:hover
        {
            background: #93d7ff;
            padding-top:20px;
            font-color:white;
            color:white;
        }

        .ChangeColor div:hover
        {
            color:white;
        }
    </style>

    <script>
        $(document).ready(function(){
            $("#flip").click(function(){
                $("#panel").slideToggle("slow");
            });
        });
    </script>

    <style>
        .modal-dialog {
            width: 400px;
        }

        #signLog
        {
            top:10%;
        }
        
         .myHeaderBorder{
         color:#800000
        }
        .mydiv {
  		  background-color:f5f5f5;
		}
		 .panel > .panel-footer {
		    background-image: none;
		    background-color: maroon;
		    color: white;

}
    </style>

    <!--Font-awsome-->
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">

</head>
<body>
<div class="container top-bar" style="margin-top:1%;">
    <div class="row" style="margin-top:1%;">
       
           
       <div class="col-sm-2"></div>
        <div class="col-sm-4"></div>
        <c:if test="${pageContext.request.userPrincipal.name == null}">
            <div class="col-sm-2"></div>
        </c:if>

        <div class="col-sm-1">
      
        </div>

        <c:if test="${pageContext.request.userPrincipal.name == null}">
            <div class="col-sm-2" style="float: right;">
                  <a data-toggle="modal" data-target="#signLog">SignIn/Register</a>
            </div>
        </c:if>
       
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <div class="dropdown col-sm-3">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="font-size:14px;">${userEmail}<b class="caret"></b></a>
                <ul class="dropdown-menu">
                   
                    <li><a href="${pageContext.request.contextPath}/profile">My Profile</a></li>
                  
                    <li><a href="${pageContext.request.contextPath}/logout">Logout<span class="sr-only">(current)</span></a></li>
                </ul>
            </div>
        </c:if>


         <!-- Modal -->
        <div class="modal fade" id="signLog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header" class="myDiv" ng-app="">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<div class="panel panel-default">
    					<div align="center" class="panel-footer"><b><font color="white">Login</font> </b> </div>
				  </div>
                        
                        <div class="loginDiv" ng-hide="showme" ><!-- style="display:none;" -->
                           
                            <c:url value="/j_spring_security_check" var="loginUrl" />
                            <form action="${loginUrl}" method="post" role="form">
                                <input type="text" class="form-control" name="username" placeholder="Email / User ID"/>
                                <input type="password" class="form-control" style="margin-top:5%;" name="password" placeholder="password"/>
                              <center>  <input type="submit" value="Login" class="btn btn-info" style="width:20%;margin-top:15px;"/></center>
                            </form>
                           
                             <form action="forgotPassword">
                           
                           <a href="${pageContext.request.contextPath}/forgotPassword1 "ng-click="showme=true"> Forgot Password?</a>
                           </form>
                           
                            <hr>
                            
                            <% 
							 UUID uuid = UUID.randomUUID();
					        String randomUUIDString = uuid.toString();

					        System.out.println("Random UUID String = " + randomUUIDString);
							
							%>
                          
                           
                            <hr>
                            <p style="margin-top:-7%;">Don't have a LegGrow account?<a href="${pageContext.request.contextPath}/signUpUser "ng-click="showme=true">  Sign up</a></p>
                        </div>
                       
                    </div>
                </div>
            </div>
            
            
            
            
            
        </div>
    </div>
</div>

<header>

 
 
 
    <div class="row" id="panel" style="box-shadow: 1px 5px 15px #ff6600;display:none;background:#ffe6cc;position:relative;left:15%;width:70%;color:#000000;">
        <div class="col-sm-12">
            <input type="text" style="width:70%;margin-top:3%;height:5%;border:1px solid #003366;" class="form-control" placeholder="Type Your City Name"/>
            <h4 style="margin-top:10px;">Popular Cities</h4>
            <div class="row">
                <div class="col-sm-2">
                    <ul>
                        <li><a>Ahmedabad</a></li>
                        <li><a>Gurgaon</a></li>
                        <li><a>Mumbai</a></li>
                    </ul>
                </div>
                <div class="col-sm-2">
                    <ul>
                        <li><a>Bangalore</a></li>
                        <li><a>Hyderabad</a></li>
                        <li><a>NaviMumbai</a></li>
                    </ul>
                </div>
                <div class="col-sm-2">
                    <ul>
                        <li><a>Chandigarh</a></li>
                        <li><a>Jaipur</a></li>
                        <li><a>Noida</a></li>
                    </ul>
                </div>
                <div class="col-sm-2">
                    <ul>
                        <li><a>Chennai</a></li>
                        <li><a>Kochi</a></li>
                        <li><a>Pune</a></li>
                    </ul>
                </div>
                <div class="col-sm-2">
                    <ul>
                        <li><a>Coimbatore</a></li>
                        <li><a>Kolkata</a></li>
                        <li><a>Trivandrum</a></li>
                    </ul>
                </div>
                <div class="col-sm-2">
                    <ul>
                        <li><a>Delhi</a></li>
                        <li><a>Lucknow</a></li>
                        <li><a>More CitiesM</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</header>
</body>
</html>
