<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Five Star Hotel</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=request.getContextPath()%>/resources/five-star-hotel/css/style.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/five-star-hotel/css/layout.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/resources/five-star-hotel/js/maxheight.js" type="text/javascript"></script>
<!--[if lt IE 7]>
<link href="ie_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, #header .row-2, #header .nav li a, #content, .gallery li');</script>
<![endif]-->

<script src="<%=request.getContextPath()%>/resources/five-star-hotel/js/inscription.js" type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/resources/five-star-hotel/css/inscription.css" rel="stylesheet" type="text/css" />

</head>
<body id="page1" onload="new ElementMaxHeight();">
<div id="main">
  <!-- header -->
  <div id="header">
    <div class="row-1">
      <div class="wrapper">
        <div class="logo">
          <h1><a href="#">Five Star</a></h1>
          <em>Hotel</em> <strong>True Luxury</strong> </div>
        <div class="phones"> 1-800-412-45-56<br />
          1-800-542-64-48 </div>
      </div>
    </div>
    <div class="row-2">
      <div class="indent">
        <!-- header-box begin -->
        <div class="header-box">
          <div class="inner">
            <ul class="nav">
              <li><a href="index.jsp" class="current">Home page</a></li>
              <li><a href="services.jsp">Services</a></li>
              <li><a href="gallery.jsp">Gallery</a></li>
              <li><a href="restaurant.jsp">Restaurant</a></li>
              <li><a href="testimonials.jsp">Testimonials</a></li>
              <li><a href="booking.jsp">Booking</a></li>
            </ul>
          </div>
        </div>
        <!-- header-box end -->
      </div>
    </div>
  </div>
  <!-- content -->
  <div id="content">

  <div class="stepwizard">
    <div class="stepwizard-row setup-panel">
      <div class="stepwizard-step">
        <a href="#step-1" type="button" class="btn btn-primary btn-circle">1</a>
        <p>Account</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled">2</a>
        <p>Plan</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled">3</a>
        <p>Service Provider</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-4" type="button" class="btn btn-default btn-circle" disabled="disabled">4</a>
        <p>Actions</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-5" type="button" class="btn btn-default btn-circle" disabled="disabled">5</a>
        <p>Email Templates</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-6" type="button" class="btn btn-default btn-circle" disabled="disabled">6</a>
        <p>Preview & Submit</p>
      </div>
    </div>
  </div>
  <form role="form">
    <div class="row setup-content" id="step-1">

      <div class="col-xs-12">
        <div class="col-md-12">
          <h3> Account Info</h3>
          <!-- Select Basic -->
          <div class="form-group">

            <fieldset>
              <div id="legend">
                <legend class="">Register</legend>
              </div>

              <div class="col-xs-6">
                <div class="control-group">
                  <!-- Username -->
                  <label class="control-label" for="username">Username</label>
                  <div class="controls">
                    <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
                    <span class="help-block">Username can contain any letters or numbers, without spaces</span>
                  </div>
                </div>

                <div class="control-group">
                  <!-- E-mail -->
                  <label class="control-label" for="email">E-mail</label>
                  <div class="controls">
                    <input type="text" id="email" name="email" placeholder="" class="input-xlarge">
                    <span class="help-block"></span>
                  </div>
                </div>

                <div class="control-group">
                  <!-- Password-->
                  <label class="control-label" for="password">Password</label>
                  <div class="controls">
                    <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                    <p class="help-block">Password should be at least 4 characters</p>
                  </div>
                </div>

                <div class="control-group">
                  <!-- Password -->
                  <label class="control-label" for="password_confirm">Password (Confirm)</label>
                  <div class="controls">
                    <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge">
                    <p class="help-block"></p>
                  </div>
                </div>

              </div>
              <div class="col-xs-6">


                <div class="control-group">
                  <!-- Password-->
                  <label class="control-label" for="password">Company</label>
                  <div class="controls">
                    <input type="text" id="company" class="input-xlarge">
                    <p class="help-block">The name of your company or organization</p>
                  </div>
                </div>

                <div class="control-group">
                  <!-- Password -->
                  <label class="control-label" for="password_confirm">Telephone (optional)</label>
                  <div class="controls">
                    <input type="password" id="tel" " placeholder=" " class="input-xlarge ">
        <p class="help-block ">Help us give you better support.</p>
      </div>
    </div>
    
    </div>
    
    
 
 
  </fieldset>


</div>

                <button class="btn btn-primary nextBtn btn-lg pull-right " type="button " >Next</button>
            </div>
        </div>
    </div>
    <div class="row setup-content " id="step-2 ">
        <div class="col-xs-12 ">
            <div class="col-md-12 ">
                <h3> Plan Details</h3>
               <!-- File Button --> 


<div class="col-xs-6 ">
<div class="form-group ">
  <label class="col-md-4 control-label " for="possible_instances ">Selected Plan</label>
  <div class="col-md-5 ">
    <select id="possible_instances " name="possible_instances " class="form-control ">
      <option value="0 ">Free Trial</option>
      <option value="-1 ">Tier 1</option>
       <option value="-1 ">Tier 2</option>
        <option value="-1 ">Tier 3</option>
    </select>
  </div>
</div>
</div>
<h3> Plan Details</h3>
<div class="col-xs-6 ">
<div class="form-group ">
<table>
  <thead>
    <tr>
      <th> </th>
      <th>Product 1</th>
      <th>Product 2</th>
      <th>Product 3</th>
    </tr>
  </thead>
  <tbody>
    <tr class="visible-xs " aria-hidden="true ">
      <td> </td>
      <td colspan="3 ">Feature 1</td>
    </tr>
    <tr>
      <td>Feature 1</td>
      <td><b class="check ">✔</b></td>
      <td><b class="check ">✔</b></td>
      <td><b class="check ">✔</b></td>
    </tr>
    <tr class="visible-xs " aria-hidden="true ">
      <td> </td>
      <td colspan="3 ">Feature 2</td>
    </tr>
    <tr>
      <td>Feature 2</td>
      <td>—</td>
      <td><b class="check ">✔</b></td>
      <td><b class="check ">✔</b></td>
    </tr>
    <tr class="visible-xs " aria-hidden="true ">
      <td> </td>
      <td colspan="3 ">Feature 3</td>
    </tr>
    <tr>
      <td>Feature 3</td>
      <td>—</td>
      <td>—</td>
      <td><b class="check ">✔</b></td>
    </tr>
    <tr class="visible-xs " aria-hidden="true ">
      <td> </td>
      <td colspan="3 ">Feature 4</td>
    </tr>
    <tr>
      <td>Feature 4</td>
      <td>—</td>
      <td>—</td>
      <td><b class="check ">✔</b></td>
    </tr>
  </tbody>
</table>

</div>

</div>
<br><br>

                <button class="btn btn-primary nextBtn btn-lg pull-right " type="button " >Next</button>
            </div>
        </div>
    </div>
    <div class="row setup-content " id="step-3 ">
        <div class="col-xs-12 ">
            <div class="col-md-12 ">
                <h3> Service Provider</h3>
                

<!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="sd_modulepath ">SD ModulePath</label>  
  <div class="col-md-5 ">
  <input id="sd_modulepath " name="sd_modulepath " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>
<br>
<br>
<!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="sd_filename ">SD File Name</label>  
  <div class="col-md-5 ">
  <input id="sd_filename " name="sd_filename " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>
<br>
<br>
                 <button class="btn btn-primary nextBtn btn-lg pull-right " type="button " >Next</button>
            </div>
        </div>
    </div>
    <div class="row setup-content " id="step-4 ">
        <div class="col-xs-12 ">
            <div class="col-md-12 " >
                <h3> Actions</h3>
                <div id="field ">
                <div id="field0 ">
<!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="action_id ">Action Id</label>  
  <div class="col-md-5 ">
  <input id="action_id " name="action_id " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>
<br><br>
<!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="action_name ">Action Name</label>  
  <div class="col-md-5 ">
  <input id="action_name " name="action_name " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>
<br><br>
       <!-- File Button --> 
<div class="form-group ">
  <label class="col-md-4 control-label " for="action_json ">Action JSON File</label>
  <div class="col-md-4 ">
              <input type="file " id="action_json " name="action_json " class="input-file " accept=".txt,.json ">
     <div id="action_jsondisplay "></div>
  </div>
</div>

</div>
</div>
<!-- Button -->
<div class="form-group ">
  <div class="col-md-4 ">
    <button id="add-more " name="add-more " class="btn btn-primary ">Add More</button>
  </div>
</div>
<br><br>
                <button class="btn btn-primary nextBtn btn-lg pull-right " type="button " >Next</button>
            </div>
        </div>
    </div>
    <div class="row setup-content " id="step-5 ">
        <div class="col-xs-12 ">
            <div class="col-md-12 ">
                <h3> Email Templates</h3>
                
                <!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="emailType ">Email Type</label>  
  <div class="col-md-5 ">
  <input id="emailType " name="emailType " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>

<br>
<br>
<!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="description ">Description</label>  
  <div class="col-md-5 ">
  <input id="description " name="description " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>
<br>
<br>

<!-- Text input-->
<div class="form-group ">
  <label class="col-md-4 control-label " for="subject ">Subject</label>  
  <div class="col-md-5 ">
  <input id="subject " name="subject " type="text " placeholder=" " class="form-control input-md ">
    
  </div>
</div>
<br>
<br>

<!-- Textarea -->
<div class="form-group ">
  <label class="col-md-4 control-label " for="body ">Body</label>
  <div class="col-md-4 ">                     
    <textarea class="form-control " id="body " name="body "></textarea>
  </div>
</div>

                 <button class="btn btn-primary nextBtn btn-lg pull-right " type="button " >Next</button>
            </div>
        </div>
    </div>
    <div class="row setup-content " id="step-6 ">
        <div class="col-xs-12 ">
            <div class="col-md-12 ">
                <h3> Preview & Submit</h3>
                <button class="btn btn-success btn-lg pull-right " type="submit ">Submit</button>
            </div>
        </div>
    </div>
</form>
  </div>
  <!-- footer -->
  <div id="footer">
    <ul class="nav">
      <li><a href="#">Home</a>|</li>
      <li><a href="#">Services</a>|</li>
      <li><a href="#">Gallery</a>|</li>
      <li><a href="#">Restaurant</a>|</li>
      <li><a href="#">Testimonials</a>|</li>
      <li><a href="#">Booking</a></li>
    </ul>
    <div class="wrapper">
      <div class="fleft">Copyright &copy; 2009 <a href="#">Name Here</a>. All Rights Reserved</div>
      <div class="fright">Designed by TemplateMonster - <a href="http://www.templatemonster.com/">website templates</a> provider</div>
    </div>
  </div>
</div>
</body>
</html>
