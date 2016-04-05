<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en-us">
        <head>
                <meta charset="utf-8">
                <title>Flex Admin - Responsive Admin Template - Live Preview - WrapBootstrap</title>
                <meta name="description" content="Live preview for Flex Admin - Responsive Admin Template at WrapBootstrap">
                <meta name="viewport" content="width=1024">
                <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
                <link rel="stylesheet" type="text/css" media="screen" href="//d85wutc1n854v.cloudfront.net/live/css/screen_preview.css">
                <!--<script src="//cdn.optimizely.com/js/233905874.js"></script>-->
                <script src="//d85wutc1n854v.cloudfront.net/live/js/behavior.js"></script>
                <script type="text/javascript">
                        var _gaq = _gaq || [];
                        _gaq.push(['_setAccount', 'UA-28871117-1']);
                        _gaq.push(['_setDomainName', 'wrapbootstrap.com']);
                        _gaq.push(['_trackPageview']);
                        (function() {
                                var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
                                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                                var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
                        })();
                </script>
                <link rel="shortcut icon" href="//d85wutc1n854v.cloudfront.net/live/imgs/favicon.ico">
        </head>
        <body>
                <div id="main">
                        <div id="tray" class="topbar" sty1le="width: auto;">
                                <div class="fill">
                                        <div class="container">
                                                <a class="brand" href="https://wrapbootstrap.com/"><img src="//d85wutc1n854v.cloudfront.net/live/imgs/logo.png"></a>
                                                <h1 id="item_name"><a href="https://wrapbootstrap.com/theme/flex-admin-responsive-admin-template-WB032SCB1">Flex Admin - Responsive Admin Template</a></h1>
                                                    <div class="remove"><a class="btn" href="http://themes.startbootstrap.com/flex-admin-v1.2/" title="Remove this frame">Remove this frame &raquo;</a></div>
                                        </div>
                                </div>
                        </div>
                            <iframe id="preview" src="http://themes.startbootstrap.com/flex-admin-v1.2/" frameborder="0" width="100%"></iframe>
                </div>
                <script>
                        $(document).ready(function(){
                                function fix_height(){
                                        var h = $("#tray").height();   
                                        $("#preview").attr("height", (($(window).height()) - h) + "px");
                                }
                                $(window).resize(function(){ fix_height(); }).resize();
                                //$("#preview").contentWindow.focus();
                        });
                </script>
        </body>
</html>
