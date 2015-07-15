package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addPhoto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n<html>\r\n<meta charset=\"utf-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n<meta name=\"description\" content=\"\">\r\n<meta name=\"author\" content=\"\">\r\n\r\n<title>Design</title>\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "source.jsp", out, false);
      out.write("\r\n</head>\r\n<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "myNavbar.jsp", out, false);
      out.write("\r\n<div id=\"wrapper\">\r\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\r\n    <div align=\"center\">\r\n        <form method=\"POST\" enctype=\"multipart/form-data\" action=\"/admin/upload/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${albumId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n            File to upload: <input id=\"input-2\" type=\"file\" class=\"file\" multiple=\"true\" name=\"file\" data-show-upload=\"false\" data-show-caption=\"true\"><br /> Name:\r\n            <input type=\"text\" name=\"photoName\"><br /> <br /> <input type=\"submit\"\r\n                                                                     value=\"Upload\"> Press here to upload the file!\r\n        </form>\r\n    </div>\r\n    <script>\r\n        $(\"#menu-toggle\").click(function(e) {\r\n            e.preventDefault();\r\n            $(\"#wrapper\").toggleClass(\"toggled\");\r\n        });\r\n    </script>\r\n</div>\r\n</body>\r\n</html>\r\n");
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
