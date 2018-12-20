<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<%@include file="head_link.jsp" %>
    <link rel="stylesheet" href="style.css">
	<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
</head>
<body>


<div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h5>log in</h5>
					<form method="post" action="./Admin_check">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Your Name</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your Password</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="psw" id="psw"  placeholder="Enter your password"/>
								</div>
							</div>
						</div>
							<div class="form-group ">
							<input type="submit" id="button" value="submit" class="btn btn-primary btn-lg btn-block login-button"/>
						</div>
						
					</form>
				</div>
			</div>
		</div>
</body>
</html>