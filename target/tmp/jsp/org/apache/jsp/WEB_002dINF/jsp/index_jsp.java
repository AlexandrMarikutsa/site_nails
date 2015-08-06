package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_security_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_security_authorize_access.release();
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

      out.write("\r\n\r\n<head>\r\n\r\n    <meta charset=\"utf-8\">\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n    <meta name=\"description\" content=\"\">\r\n    <meta name=\"author\" content=\"\">\r\n\r\n    <title>M.N. Nails</title>\r\n\r\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "source.jsp", out, false);
      out.write("\r\n\r\n\r\n</head>\r\n\r\n<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-fixed-top\">\r\n\r\n<!-- Navigation -->\r\n<nav class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\r\n    <div class=\"container\">\r\n        <div class=\"navbar-header\">\r\n            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-main-collapse\">\r\n                <i class=\"fa fa-bars\"></i>\r\n            </button>\r\n            <a class=\"navbar-brand page-scroll\" href=\"#page-top\">\r\n                <i class=\"fa fa-play-circle\"></i> <span class=\"light\">Home</span>\r\n            </a>\r\n        </div>\r\n\r\n        <!-- Collect the nav links, forms, and other content for toggling -->\r\n        <div class=\"collapse navbar-collapse navbar-right navbar-main-collapse\">\r\n            <ul class=\"nav navbar-nav\">\r\n                <!-- Hidden li included to remove active class from about link when scrolled up past about section -->\r\n                <li class=\"hidden\">\r\n                    <a href=\"#page-top\"></a>\r\n                </li>\r\n");
      out.write("\r\n                ");
      if (_jspx_meth_security_authorize_0(_jspx_page_context))
        return;
      if (_jspx_meth_security_authorize_1(_jspx_page_context))
        return;
      out.write("\r\n\r\n            </ul>\r\n        </div>\r\n        <!-- /.navbar-collapse -->\r\n    </div>\r\n    <!-- /.container -->\r\n</nav>\r\n\r\n<!-- Intro Header -->\r\n<header class=\"intro\">\r\n    <div class=\"intro-body\">\r\n        <div class=\"container\">\r\n            <div class=\"row\">\r\n                <div class=\"col-md-8 col-md-offset-2\">\r\n                    <p class=\"intro-text\">I can make you feel happy...</p>\r\n                    ");
      out.write("\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</header>\r\n\r\n<!-- About Section -->\r\n<div class=\"content-section text-center\" id=\"about\">\r\n\r\n    <div class=\"container\">\r\n        <h2>Made by Olexandr Marikutsa</h2>\r\n        <hr>\r\n    </div>\r\n</div>\r\n\r\n</body>\r\n\r\n</html>\r\n");
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

  private boolean _jspx_meth_security_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_0.setParent(null);
    _jspx_th_security_authorize_0.setAccess("!hasRole('ROLE_ADMIN') and !hasRole('ROLE_USER')");
    int _jspx_eval_security_authorize_0 = _jspx_th_security_authorize_0.doStartTag();
    if (_jspx_eval_security_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n                    <li>\r\n                        <a class=\"page-scroll\" href=\"/about\">About</a>\r\n                    </li>\r\n                    <li>\r\n                        <a class=\"page-scroll\" href=\"/auth\">Login</a>\r\n                    </li>\r\n                    <li>\r\n                        <a class=\"page-scroll\" href=\"/registration\">Register</a>\r\n                    </li>\r\n                ");
    }
    if (_jspx_th_security_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
    return false;
  }

  private boolean _jspx_meth_security_authorize_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_1.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_1.setParent(null);
    _jspx_th_security_authorize_1.setAccess("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')");
    int _jspx_eval_security_authorize_1 = _jspx_th_security_authorize_1.doStartTag();
    if (_jspx_eval_security_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n                    <li>\r\n                        <a class=\"page-scroll\" href=\"/about\">About</a>\r\n                    </li>\r\n                    ");
      if (_jspx_meth_security_authorize_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_1, _jspx_page_context))
        return true;
      if (_jspx_meth_security_authorize_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_1, _jspx_page_context))
        return true;
      out.write("\r\n                    <li>\r\n                        <a class=\"page-scroll\" href=\"");
      if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_1, _jspx_page_context))
        return true;
      out.write("\">Logout</a>\r\n                    </li>\r\n                ");
    }
    if (_jspx_th_security_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
    return false;
  }

  private boolean _jspx_meth_security_authorize_2(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_2.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_1);
    _jspx_th_security_authorize_2.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_authorize_2 = _jspx_th_security_authorize_2.doStartTag();
    if (_jspx_eval_security_authorize_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n                        <li>\r\n                            <a class=\"page-scroll\" href=\"/admin\">My account</a>\r\n                        </li>\r\n                    ");
    }
    if (_jspx_th_security_authorize_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_2);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_2);
    return false;
  }

  private boolean _jspx_meth_security_authorize_3(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_3.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_1);
    _jspx_th_security_authorize_3.setAccess("hasRole('ROLE_USER')");
    int _jspx_eval_security_authorize_3 = _jspx_th_security_authorize_3.doStartTag();
    if (_jspx_eval_security_authorize_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n                        <li>\r\n                            <a class=\"page-scroll\" href=\"/user\">My account</a>\r\n                        </li>\r\n                    ");
    }
    if (_jspx_th_security_authorize_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_3);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_3);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_1);
    _jspx_th_c_url_0.setValue("/j_spring_security_logout");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
