package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>SignUp Page</title>\n");
      out.write("<!--mobile apps-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<meta name=\"keywords\" content=\"Tasty Food Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("\tSmartphone Compatible web template, free Webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--mobile apps-->\n");
      out.write("<!--Custom Theme files -->\n");
      out.write("<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("<link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("<!-- //Custom Theme files -->\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script> \n");
      out.write("<!-- //js -->\n");
      out.write("<!--web-fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Stint+Ultra+Condensed' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//web-fonts-->\n");
      out.write("<!--animate-->\n");
      out.write("<link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t new WOW().init();\n");
      out.write("\t</script>\n");
      out.write("<!--//end-animate-->\n");
      out.write("<!-- start-smooth-scrolling-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\t\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("</script>\n");
      out.write("<!--//end-smooth-scrolling-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--banner-->\n");
      out.write("\t<div class=\"banner about-banner\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!--header-->\n");
      out.write("\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<h1 class=\"wow zoomIn animated\" data-wow-delay=\".5s\"><a href=\"index.jsp\">Tasty Food</a></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t\t<span class=\"menu\"><img src=\"images/menu.png\" alt=\"\"/></span>\n");
      out.write("                                        <ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"wow slideInDown animated\" data-wow-delay=\".5s\"><a href=\"admin.jsp\">Admin Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"wow slideInDown animated\" data-wow-delay=\".6s\"><a class=\"active\" href=\"login.jsp\">Login</a></li>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"wow slideInDown animated\" data-wow-delay=\".7s\"><a href=\"signup.jsp\">SignUp</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!-- script-for-menu -->\n");
      out.write("\t\t\t\t\t<script>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t$(\"span.menu\").click(function(){\n");
      out.write("\t\t\t\t\t\t\t$(\".top-nav ul\").slideToggle(\"slow\" , function(){\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- script-for-menu -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<!--//header-->\n");
      out.write("\t\t\t<div class=\"bnr-text wow slideInLeft animated\" data-wow-delay=\".7s\">\n");
      out.write("\t\t\t\t<h2 class=\"bnr-title agileinfo\">SignUp</h2>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<!--//banner--> \n");
      out.write("        \n");
      out.write("        <form action=\"DoSignUp\" method=\"post\" style=\"margin: auto; width: 80%; text-align: center;\">\n");
      out.write("    <br><BR>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name =\"signup\" class=\"form-control\" placeholder=\"username\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"email\" name=\"signup\" class=\"form-control\"  placeholder=\"email\" required>\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("              <input type=\"password\" name=\"signup\" class=\"form-control\" placeholder=\"password\">\n");
      out.write("             <br>\n");
      out.write("              <input type=\"number\" name=\"signup\" class=\"form-control\" placeholder=\"phone\">\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("              <textarea  name=\"signup\" class=\"form-control\"  placeholder=\"address\"></textarea>\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("              <input type=\"submit\" value=\"SignUp\" class=\"btn btn-danger\">\n");
      out.write("              <br><BR>\n");
      out.write("        </form>\n");
      out.write("<!--footer-->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-info\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 footer-grids footer-address\">\n");
      out.write("\t\t\t\t\t<h3 class=\"wow fadeInDown animated\" data-wow-delay=\".5s\">Contact Us:</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"wow slideInLeft animated\" data-wow-delay=\".5s\"><i class=\"glyphicon glyphicon-send\"></i> South Extension, Part-2 <span> New Delhi. </span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"wow slideInLeft animated\" data-wow-delay=\".5s\"><i class=\"glyphicon glyphicon-phone\"></i> +919953943241 <span> +917210525129 </span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"wow slideInLeft animated\" data-wow-delay=\".5s\"><i class=\"glyphicon glyphicon-envelope\"></i> <a href=\"mailto:example@mail.com\"> javedali88055@gmail.com</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 footer-grids\">\n");
      out.write("\t\t\t\t\t<h3 class=\"wow fadeInDown animated\" data-wow-delay=\".5s\">Popular Items</h3>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grd wow zoomIn animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/f1.jpg\" class=\"img-responsive\" alt=\" \">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grd wow zoomIn animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/f2.jpg\" class=\"img-responsive\" alt=\" \">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grd wow zoomIn animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/f3.jpg\" class=\"img-responsive\" alt=\" \">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grd wow zoomIn animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/f4.jpg\" class=\"img-responsive\" alt=\" \">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grd wow zoomIn animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/f5.jpg\" class=\"img-responsive\" alt=\" \">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grd wow zoomIn animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/f6.jpg\" class=\"img-responsive\" alt=\" \">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 footer-grids\">\n");
      out.write("\t\t\t\t\t<h3 class=\"wow fadeInDown animated\" data-wow-delay=\".5s\">Newsletter</h3>\n");
      out.write("\t\t\t\t\t<div class=\"subscribe wow slideInRight animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Go\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"social-icons wow slideInRight animated\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fb\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"in\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"dott\"> </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer-copy wow slideInUp animated\" data-wow-delay=\".5s\">\n");
      out.write("                            <p>© 2016 Tasty Food. All rights reserved | Design by <a><b>Javed</b></a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<!--//footer-->\t\n");
      out.write("\t<!--smooth-scrolling-of-move-up-->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\n");
      out.write("\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t};\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\t<!--//smooth-scrolling-of-move-up-->\n");
      out.write("\t<!--scrolling js-->\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\n");
      out.write("\t<!--//scrolling js-->\n");
      out.write("\t<!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
