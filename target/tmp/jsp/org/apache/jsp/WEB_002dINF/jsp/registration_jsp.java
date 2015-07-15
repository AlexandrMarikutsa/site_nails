package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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

      out.write("<!DOCTYPE html>\r\n\r\n<html lang=\"en\">\r\n<head>\r\n    <title>Registration</title>\r\n    <link href=\"/resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n    <link href=\"/resources/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n    <link href=\"/resources/css/bootstrap-them.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n    <script src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n    <script src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n</head>\r\n<body>\r\n<h1>Registration</h1>\r\n\r\n<form class=\"login-form well\" action=\"/registration\" method=\"post\">\r\n\r\n    <div class=\"form-group\">\r\n        <span class=\"must\">*</span><label for=\"email\">Email address</label>\r\n        <input type=\"email\" maxlength=\"39\" class=\"form-control js-email\" id=\"email\" name=\"email\" placeholder=\"Enter email\">\r\n    </div>\r\n    <div class=\"form-group \">\r\n        <span class=\"must\">*</span><label for=\"firstName\">First Name</label>\r\n        <input type=\"text\" maxlength=\"24\" class=\"form-control js-name\" id=\"firstName\" name=\"firstName\" placeholder=\"Enter your first name\">\r\n    </div>\r\n    <div class=\"form-group\">\r\n        <span class=\"must\">*</span><label for=\"lastName\">Last Name</label>\r\n        <input type=\"text\" maxlength=\"24\" class=\"form-control js-name\" id=\"lastName\" name=\"lastName\" placeholder=\"Enter your last name\">\r\n    </div>\r\n\r\n    <div class=\"form-group\">\r\n        <span class=\"must\">*</span><label for=\"password\">Password</label>\r\n        <input type=\"password\" maxlength=\"50\" class=\"form-control js-pass\" id=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("    </div>\r\n    <div class=\"form-group \">\r\n        <span class=\"must\">*</span><label for=\"password\">Confirm password</label>\r\n        <input type=\"password\" maxlength=\"50\" class=\"form-control js-confirm-pass\" id=\"confirmPassword\"  name=\"confirmPassword\"\r\n               placeholder=\"Repeat your password\">\r\n    </div>\r\n\r\n    <div class=\"form-group \">\r\n        <label for=\"phoneNumber\">Phone</label>\r\n        <input type=\"text\" maxlength=\"29\" class=\"form-control js-phone\" id=\"phoneNumber\" name=\"phoneNumber\" placeholder=\"Enter your phone\">\r\n    </div>\r\n    <div class=\"form-group \">\r\n        <label for=\"birthday\">Birthday</label>\r\n        <input type=\"date\" name=\"birthday\" id=\"birthday\" name=\"birthday\" class=\"form-control js-birthday\">\r\n    </div>\r\n    <p class=\"err-msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n    <input type=\"submit\" value=\"Register\" class=\"btn btn-primary\">\r\n\r\n</form>\r\n<script src=\"/resources/js/sign-in.js\"></script>\r\n\r\n</body>\r\n</html>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/js/bootstrap.min.js");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("http://code.jquery.com/jquery-1.11.3.min.js");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
