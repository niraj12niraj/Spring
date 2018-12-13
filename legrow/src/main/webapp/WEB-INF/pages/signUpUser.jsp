<%--
  Created by IntelliJ IDEA.
  User: krishna
  Date: 4/14/16
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    <title>Seller Registration</title>
    <%--<style>
        .form-group input[type="checkbox"] {
            display: none;
        }

        .form-group input[type="checkbox"] + .btn-group > label span {
            width: 20px;
        }

        .form-group input[type="checkbox"] + .btn-group > label span:first-child {
            display: none;
        }
        .form-group input[type="checkbox"] + .btn-group > label span:last-child {
            display: inline-block;
        }

        .form-group input[type="checkbox"]:checked + .btn-group > label span:first-child {
            display: inline-block;
        }
        .form-group input[type="checkbox"]:checked + .btn-group > label span:last-child {
            display: none;
        }
    </style>--%>
</head>
<body>
<div class="container">
    <center><h1><span color="red"><b>Register Sellar</b></span></h1></center>
    <%--<h3>Please have the following ready before you begin:</h3>
    <p>&nbsp;&nbsp;&nbsp;&nbsp;1-Your bank account details for receiving payments from Amazon</p>
    <p>&nbsp;&nbsp;&nbsp;&nbsp;2-Tax( VAT/CST/TIN) details of your business if you sell in taxable products</p>--%>
</div>
<div class="container-fluid">
    <div class="col-sm-3"></div>
    <div class="col-sm-5">
        <form action="${pageContext.request.contextPath}/saveSignUpUser" method="post"enctype="multipart/form-data">
            <%--<h3>Please ensure that all the information you submit is accurate.</h3>--%>
            <div class="form-group">
                <label>Name:</label>
                <div>
                    <input type="text" class="form-control" name="fullName" placeholder="Enter Name"/>
                </div>
            </div>
            <div class="form-group">
                <label>Email:</label>
                <div>
                    <input type="email" class="form-control" name="email" placeholder="Enter email"/>
                </div>
            </div>


            <div class="form-group">
                <label>Password:</label>
                <div>
                    <input type="password" class="form-control" name="password" placeholder="Enter PASSWORD"/>
                </div>
            </div>


                <div class="form-group">
                    <label>Role:</label>
                    <div>
                        <select class="form-control" value="authority">
                            <option value="">SELECT ROLE</option>
                            <option value="ROLE_USER">SELLER</option>
                            <option value="ROLE_CUSTOMER">CUSTOMER</option>
                            <option value="ROLE_EMPLOYEE">EMPLOYEE</option>
                        </select>
                    </div>
                </div>



            <div class="form-group">
                <label>Contact Number:</label>
                <div>
                    <input type="text" class="form-control" name="mobileNumber" placeholder="Enter Mobile Number" />
                </div>
            </div>
            <div class="form-group">
                <label>Address:</label>
                <div>
                    <textarea rows="2" class="form-control" name="address" placeholder="Enter Address With Plot Number"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label>City:</label>
                <div>
                    <input type="text" class="form-control" name="city" placeholder="Enter City Name" />
                </div>
            </div>

            <div class="form-group">
                <label>State:</label>
                <div>
                    <select class="form-control" name="state" id="sel1">
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
                    </select>
                </div>
            </div>




                <div class="form-group">
                <label>Country:</label>
                <div>
                    <input type="text" placeholder="COUNTRY" class="form-control" value="INDIA" readonly>
                </div>
            </div>


            <div class="form-group">
                <label>Pincode:</label>
                <div>
                    <input type="text" class="form-control" name="pincode" placeholder="Enter Pincode" />
                </div>
            </div>

                <div class="form-group">
                    <label>Type Of Room:</label>
                    <div>
                        <select class="form-control" name="roomType" id="sel2" >
                            <option value="">ROOM TYPE</option>
                            <option value="One Seater AC">One Seater AC</option>
                            <option value="One Seater Non-AC">One Seater Non-AC</option>
                            <option value="Two Seater AC">two Seater AC</option>
                            <option value="Two Seater Non-AC">Two Seater Non-AC</option>
                            <option value="Three Seater AC">Three Seater AC</option>
                        </select>
                    </div>
                </div>


                <script>

                    function selectType(a)
                    {

                        $.ajax({
                            type : "Get",
                            url : "${pageContext.request.contextPath}/selectType/${a}",
                            success : function(response) {
                                /* alert(response);  */
                                $('#likeDislike').load(document.URL +  ' #likeDislike');
                            },
                            error : function(e) {
                                alert('Error: ' + e);
                            }
                        });
                    }
                </script>



                <%--<div class="form-group">
                    <label>What You Want:</label>
                    <div>
                        <select class="form-control" name="type" id="type" onselect="selectType(this.val());">
                            <option value="">ROOM TYPE</option>
                            <option value="Hostel">Hostel</option>
                            <option value="PG">PG</option>
                            <option value="Hotel">Hotel</option>
                        </select>
                    </div>
                </div>--%>

                <span style="color:#ff0400;">
                        <span id="like" style="float:left;margin-left:5%;color:#ff0500;" class="glyphicon glyphicon-thumbs-up" aria-hidden="true" onclick="selectType('ddd');">

                        </span>
                </span>



                <div class="form-group">
                    <label>When You Are Visit:</label>
                    <div>
                        <input type="text" class="form-control" name="pincode" placeholder="Enter Pincode" />
                    </div>
                </div>


            <div class="form-group">
                <label>Web Site (if any):</label>
                <div>
                    <input type="url" class="form-control" name="website" placeholder="Enter Website if any"/><p style="font-size: 11px;color:red;">Example :- http:/www.example.com</p>
                </div>
            </div>

            <center><h1><font color="red"><input type="submit" class="btn btn-success" value="Submit"></font></h1></center>
            <!-- <input type="submit" class="btn btn-success" value="Submit"> -->
        </form>
    </div>
</div>









</body>
</html>