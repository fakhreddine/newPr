<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<link
	href="<%=request.getContextPath()%>/resources/navbar/css/font-awesome.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap-responsive.css" />
<link
	href="<%=request.getContextPath()%>/resources/css/header_login.css"
	rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#">Hotels</a></li>
			<li><a href="#">Offres</a></li>
			<li><a href="#">About us</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li>
				<a href="#myModal" data-toggle="modal"> 
					<span class="glyphicon glyphicon-user" ></span>
					Sign up/login
				</a>
				
			</li>
			
		</ul>
	</div>
</nav>

<div class="container">
	<div class="row">
		<div class="bs-example">
			<!-- Button HTML (to Trigger Modal) -->

			<!-- Modal HTML -->
			<div id="myModal" class="modal fade">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h4 class="modal-title">Login & Register</h4>
						</div>

						<div class="modal-body">
							<div class="col-md-6 col-sm-6 no-padng">
								<div class="model-l">
								
								
								<c:url var="conAction" value="connect" ></c:url>
								<form:form method="post" action="${conAction}" commandName="usercon" >
										<ul>
											<li>Email</li>
											<li>
											<form:input path="login"  type="text" placeholder="User ID"
												id="login" name="userName" class="form-control"
												onfocus="checkNullProf();" />
												</li>
											<li>Password</li>
											<li><form:input path="motDePass" type="password" placeholder="Password"
												id="motDePass" name="password" class="form-control"
												onfocus="checkNullProf();" /></li>
											<li><br />
												<button type="button" onclick="userLogin();" id="logBtn"
													class="btn btn-default">Submit</button></li>
											<div style="display: none;" id="loginFail" class="sign">
												<li><font color="red"> Username or password is
														incorrect.</font></li>
											</div>
										</ul>
									</form:form>
									<div class="clearfix"></div>
									<form method="post" id="logFrm1" class="log-frm" name="logFrm1">
										<ul>
											<li><a class="for-got" onclick="ayantoggle();"
												href="javascript:;">Forgot your password?</a>
												<div class="forgot">
													<ul>
														<li><p>Enter your Email Address here to receive a
																link to change password.</p></li>
														<li>Email Id</li>
														<li><input type="text" placeholder="Your email id"
															id="forgetemailId" class="form-control"
															name="forgetemailId"></li>
														<li><button type="button" class="btn btn-default"
																onclick="forgot();">Send Mail</button></li>
													</ul>
												</div></li>
										</ul>
									</form>
								</div>
							</div>
							<div class="col-md-6 col-sm-6 no-padng">
								<div class="model-r">
									<div class="o-r">
										<span>OR</span>
									</div>
									<c:url var="singupAction" value="singup" ></c:url>
								<form:form method="post" action="${singupAction}" commandName="usersing" id="logFrm" class="log-frm" name="logFrm">
										<ul>
											<li>First Name</li>
											<li><form:input path="prenomPers"  type="text" placeholder="First Name"
												name="fName" class="form-control" /></li>
											<li>Last Name</li>
											<li><form:input path="nomPers"  type="text" placeholder="Last Name"
												name="lName" class="form-control" /></li>
											<li>Email</li>
											<li><form:input path="emailPers"  type="text" placeholder="Email Id"
												name="emailId" class="form-control" /></li>
											<li>Password</li>
											<li><form:input path="motDePass"  type="password" placeholder="Password"
												name="password" class="form-control" /></li>
											<li>Confirm Password</li>
											<li><form:input path="motDePass"  type="password"
												placeholder="Confirm Password" name="repassword"
												class="form-control" /></li>
											<br>
											<li><input type="submit" name="userRegBtn"
													class="btn btn-default" value="valider"></input></li>
											<div style="display: none;" class="sign greenglow">
												<li><i class="icon-check"></i><br> <font
													color="red"> User registration successful.<br>
														Your login Url already send to your email.

												</font></li>
											</div>
											<div style="display: none;" id="regnSuc11"
												class="sign redglow">
												<li><i class="icon-mail"></i><br> <font
													color="red"> Email Exist.</font></li>
											</div>
										</ul>
									</form:form>
								</div>
							</div>

							<div class="clearfix"></div>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="<%=request.getContextPath()%>/resources/js/header_login.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/bootstrap/js/jquery-1.11.1.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/inscription/js/inscription.js"></script>

</body>
</html>