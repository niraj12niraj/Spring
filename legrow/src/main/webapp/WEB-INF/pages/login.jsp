<%--
  Created by IntelliJ IDEA.
  User: krishna
  Date: 4/4/16
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title> Home Page </title>
    <!-- login.jsp -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>


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

        #gchauhan
        {
            top:10%;
        }
    </style>

</head>


<body>

<%@include file="header.jsp"%>


<br/><br/><br/><br/>


<!-- Login start -->
<div class="container">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-5" style="margin-left:4%;"><!-- position:absolute;top:20%;margin-left:18%;padding: 0px 0px 40px 0px;padding-top:0px; -->
            <div class="grid_4" style="border:1px solid #800000;border-radius:10px;box-shadow: 0 0 10px #800000;">
                <legend style="border:0px solid #0f8200;width:100%;height:5%;border-top-left-radius:10px;border-top-right-radius:10px; background-color: maroon;color:#FFFFFF;font-size:180%;padding:0 0 0 35%;"><img src="${lock}"/><b>&nbsp;&nbsp;&nbsp;Login</b></legend>
                <c:if test="${not empty error}">
                    <div class="error" style="text-align:center;width:100%;color:#ff0000;">${error}</div>
                </c:if>
                <c:if test="${not empty error}">
                    <div class="error" style="text-align:center;width:100%;color:#ff0000;">${aa}</div>
                </c:if>

                <c:if test="${not empty msg}">
                    <div class="msg" style="width:50%;">${msg}</div>
                </c:if>
                <c:url value="/j_spring_security_check" var="loginUrl" />
                <form style="margin:5%;" name='loginForm' action="${loginUrl}" method='POST'>
                    <table>
                        <tr>
                            <td><!-- Mail ID: -->&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td>
                                <div class="form-group form-inline">
                                    <label for="email">User Email :</label>
                                    <input type="text" class="form-control" name="username" id="email">
                                </div>
                                <!-- <div class="input-group">
                                      <input type="text" class="form-control" name="username" placeholder="Recipient's username" aria-describedby="basic-addon2">
                                </div> -->
                            </td>
                        </tr>
                        <tr style="padding:5% 0 0;">
                            <td><!-- Password: -->&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td style="padding:5% 0 0;">
                                <div class="form-group 	form-inline">
                                    <label for="pwd">Password</label><span>&nbsp;&nbsp;:</span>
                                    <input type="password" name="password" class="form-control" id="pwd">
                                </div>
                                <!-- <input type="password" name="password" class="form-control" id="pwd" placeholder="Recipient's password"> -->
                            </td>
                        </tr>
                        <tr style="align:center;">
                            <td><!-- Password: -->&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td colspan="2" style="padding:5% 0 0 20%;">
                                <input name="submit" type="submit" value="Login" class="btn btn-info"style="margin-left:10%;"/>
                            </td>
                        </tr>
                    </table>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                </form>
            </div>
        </div>

        <div class="col-md-4"></div>
    </div>
</div><br><br><br><br><br><br><br><br><br><br><br>
<!-- login form end -->


<br><br><br><br>


<!-- Footer Start -->


<%@include file="footer.jsp"%>
</body>
</html>