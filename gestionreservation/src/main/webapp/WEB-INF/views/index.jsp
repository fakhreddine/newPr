<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/inscription/css/inscription.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/navbar/css/navbar.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/article_chambre_with_galerie.css" />
</head>
<jsp:include flush="true" page="/logsing" /></td>




<div class="container">

	<hr>
		<!-- Begin of rows -->
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
					<h4>Example product</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
						diam nonumy eirmod tempor invidunt ut labore et dolore magna
						aliquyam erat</p>
				</div>
				<div class="slide-footer">
					<span class="pull-right buttons">
						<button class="btn btn-sm btn-default">
							<i class="fa fa-fw fa-eye"></i> Show
						</button>
						<button class="btn btn-sm btn-primary">
							<i class="fa fa-fw fa-shopping-cart"></i> Buy
						</button>
					</span>
				</div>
			</div>
		</div>
		<div class="row carousel-row">
			<div class="col-xs-8 col-xs-offset-2 slide-row">
				<div id="carousel-2" class="carousel slide slide-carousel"
					data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-2" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-2" data-slide-to="1"></li>
						<li data-target="#carousel-2" data-slide-to="2"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner">
						<div class="item active">
							<img src="http://lorempixel.com/150/150?rand=4" alt="Image">
						</div>
						<div class="item">
							<img src="http://lorempixel.com/150/150?rand=5" alt="Image">
						</div>
						<div class="item">
							<img src="http://lorempixel.com/150/150?rand=6" alt="Image">
						</div>
					</div>
				</div>
				<div class="slide-content">
					<h4>Long text product</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
						diam nonumy eirmod tempor invidunt ut labore et dolore magna
						aliquyam erat, sed diam voluptua. At vero eos et accusam et justo
						duo dolores et ea rebum. Lorem ipsum dolor sit amet, consetetur
						sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore
						et dolore magna aliquyam erat, sed diam voluptua. At vero eos et
						accusam et justo duo dolores et ea rebum. Lorem ipsum dolor sit
						amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor
						invidunt ut labore et dolore magna aliquyam erat, sed diam
						voluptua. At vero eos et accusam et justo duo dolores et ea rebum.
					</p>
				</div>
				<div class="slide-footer">
					<span class="pull-right buttons">
						<button class="btn btn-sm btn-default">
							<i class="fa fa-fw fa-eye"></i> Show
						</button>
						<button class="btn btn-sm btn-primary">
							<i class="fa fa-fw fa-shopping-cart"></i> Buy
						</button>
					</span>
				</div>
			</div>
		</div>
		<div class="row carousel-row">
			<div class="col-xs-8 col-xs-offset-2 slide-row">
				<div id="carousel-3" class="carousel slide slide-carousel"
					data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-3" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-3" data-slide-to="1"></li>
						<li data-target="#carousel-3" data-slide-to="2"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner">
						<div class="item active">
							<img src="http://lorempixel.com/150/150?rand=7" alt="Image">
						</div>
						<div class="item">
							<img src="http://lorempixel.com/150/150?rand=8" alt="Image">
						</div>
						<div class="item">
							<img src="http://lorempixel.com/150/150?rand=9" alt="Image">
						</div>
					</div>
				</div>
				<div class="slide-content">
					<h4>Example product</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
						diam nonumy eirmod tempor invidunt ut labore et dolore magna
						aliquyam erat,</p>
				</div>
				<div class="slide-footer">
					<span class="pull-right buttons">
						<button class="btn btn-sm btn-default">
							<i class="fa fa-fw fa-eye"></i> Show
						</button>
						<button class="btn btn-sm btn-primary">
							<i class="fa fa-fw fa-shopping-cart"></i> Buy
						</button>
					</span>
				</div>
			</div>
		</div>
</div>

<%@include file="footer.jsp" %>



<!-- /.container-fluid --> </nav>
<script
	src="<%=request.getContextPath()%>/resources/bootstrap/js/jquery-1.11.1.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/inscription/js/inscription.js"></script>

</body>
</html>