<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="<%=request.getContextPath()%>/resources/navbar/css/font-awesome.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap-responsive.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/inscription/css/inscription.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/navbar/css/navbar.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/reservation/css/reservation.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/article_chambre_with_galerie.css" />
</head>

<nav class="navbar navbar-default navbar-inverse" role="navigation">
<div class="container-fluid">
	<!-- Brand and toggle get grouped for better mobile display -->

	<!-- Collect the nav links, forms, and other content for toggling -->
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#">Hotels</a></li>
			<li><a href="#">Offres</a></li>

		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">A propos</a></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><b>Login</b> <span class="caret"></span></a>
				<ul id="login-dp" class="dropdown-menu">
					<li>
						<div class="container">
							<div class="row">
								<div class="col-md-4">
									<div class="form-body">
										<ul class="nav nav-tabs final-login">
											<li class="active"><a data-toggle="tab" href="#sectionA">Sign
													In</a></li>
											<li><a data-toggle="tab" href="#sectionB">Join us!</a></li>
										</ul>
										<div class="tab-content">
											<div id="sectionA" class="tab-pane fade in active">
												<div class="innter-form">
													<form class="sa-innate-form" method="post">
														<label>Email Address</label>
														<input type="text" name="username">
														<label>Password</label>
														<input type="password" name="password">
														<button type="submit">Sign In</button>
														<a href="">Forgot Password?</a>
													</form>
												</div>
												<div class="social-login">
													<p>- - - - - - - - - - - - - Sign In With - - - - - - -
														- - - - - -</p>
													<ul>
														<li><a href=""><i class="fa fa-facebook"></i>
																Facebook</a></li>
														<li><a href=""><i class="fa fa-google-plus"></i>
																Google+</a></li>
														<li><a href=""><i class="fa fa-twitter"></i>
																Twitter</a></li>
													</ul>
												</div>
												<div class="clearfix"></div>
											</div>
											<div id="sectionB" class="tab-pane fade">
												<div class="innter-form">
													<form class="sa-innate-form" method="post">
														<label>Name</label>
														<input type="text" name="username">
														<label>Email Address</label>
														<input type="text" name="username">
														<label>Password</label>
														<input type="password" name="password">
														<button type="submit">Join now</button>
														<p>By clicking Join now, you agree to hifriends's User
															Agreement, Privacy Policy, and Cookie Policy.</p>
													</form>
												</div>
												<div class="social-login">
													<p>- - - - - - - - - - - - - Register With - - - - - -
														- - - - - - -</p>
													<ul>
														<li><a href=""><i class="fa fa-facebook"></i>
																Facebook</a></li>
														<li><a href=""><i class="fa fa-google-plus"></i>
																Google+</a></li>
														<li><a href=""><i class="fa fa-twitter"></i>
																Twitter</a></li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

					</li>
				</ul></li>
		</ul>
	</div>
	<!-- /.navbar-collapse -->
</div>
<!-- /.container-fluid --> </nav>









<div class="container">
	<div class="row">
		<div class="col-xs-8 col-xs-offset-2">
			<h4>
				Made with <i class="fa fa-fw fa-heart text-danger"></i> by <a
					href="http://twitter.com/AlexMahrt" class="btn btn-primary btn-xs"
					target="_blank"><i class="fa fa-fw fa-twitter"></i> @AlexMahrt</a>
			</h4>
		</div>
	</div>
	<hr>
		<!-- Begin of rows -->
		<c:forEach items="${listOffres}" var="offre">
			

			<div class="row carousel-row">
				<div class="col-xs-8 col-xs-offset-2 slide-row">
					<div id="carousel-1" class="carousel slide slide-carousel"
						data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#carousel-1" data-slide-to="0" class="active"></li>
							<li data-target="#carousel-1" data-slide-to="1"></li>
							<li data-target="#carousel-1" data-slide-to="2"></li>
						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<div class="item active">
								<img src="http://lorempixel.com/150/150?rand=1" alt="Image">
							</div>
							<div class="item">
								<img src="http://lorempixel.com/150/150?rand=2" alt="Image">
							</div>
							<div class="item">
								<img src="http://lorempixel.com/150/150?rand=3" alt="Image">
							</div>
						</div>
					</div>
					<div class="slide-content">
						<h4>${offre.prixOffre}</h4>
						<p>${offre.hotel.descriptionHotel}</p>
					</div>
					<div class="slide-footer">
						<span class="pull-right buttons">
							<button class="btn btn-sm btn-default">
								<i class="fa fa-fw fa-eye"></i> Show
							</button>
							<button class="btn btn-sm btn-primary">
								<i class="fa fa-fw fa-shopping-cart"></i> Buy
							</button>
							<a class="btn btn-sm btn-primary" href="offre/${offre.idOffre}">consulter</a>
						</span>
					</div>
				</div>
			</div>
		</c:forEach>
	<script
		src="<%=request.getContextPath()%>/resources/bootstrap/js/jquery-1.11.1.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/inscription/js/inscription.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/reservation/js/reservation.js"></script>
	</body>
</html>