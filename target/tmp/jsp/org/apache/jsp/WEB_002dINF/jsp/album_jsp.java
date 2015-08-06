package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class album_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_security_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_security_authorize_access.release();
    _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.release();
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

      out.write("\r\n<html>\r\n<meta charset=\"utf-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n<meta name=\"description\" content=\"\">\r\n<meta name=\"author\" content=\"\">\r\n<link rel=\"stylesheet\" href=\"css/bootstrap-image-gallery.min.css\">\r\n<title>Design</title>\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "source.jsp", out, false);
      out.write("\r\n</head>\r\n<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "myNavbar.jsp", out, false);
      out.write("\r\n<div id=\"wrapper\">\r\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      if (_jspx_meth_security_authorize_0(_jspx_page_context))
        return;
      out.write("\r\n    <p class=\"container\">\r\n        <!-- thumb navigation carousel -->\r\n\r\n    <div class=\"col-md-12 hidden-sm hidden-xs\" id=\"slider-thumbs\">\r\n\r\n        <!-- thumb navigation carousel items -->\r\n        <ul class=\"list-inline\">\r\n            <li><a id=\"carousel-selector-0\" class=\"selected\">\r\n                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pictures[0].directoryMini}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\">\r\n            </a></li>\r\n            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n        </ul>\r\n\r\n    </div>\r\n\r\n\r\n    <!-- main slider carousel -->\r\n    <div class=\"row\">\r\n        <div class=\"col-md-12\" id=\"slider\">\r\n\r\n            <div class=\"col-md-12\" id=\"carousel-bounding-box\">\r\n                <div id=\"myCarousel\" class=\"carousel slide\">\r\n                    <!-- main slider carousel items -->\r\n                    <div class=\"carousel-inner\">\r\n                        <div class=\"active item\" data-slide-number=\"0\" align=\"center\">\r\n                            ");
      if (_jspx_meth_security_authorize_1(_jspx_page_context))
        return;
      out.write("\r\n                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pictures[0].directory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\">\r\n                        </div>\r\n                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n                    </div>\r\n                    <!-- main slider carousel nav controls -->\r\n                    <a class=\"carousel-control left\" href=\"#myCarousel\" data-slide=\"prev\">‹</a>\r\n                    <a class=\"carousel-control right\" href=\"#myCarousel\" data-slide=\"next\">›</a>\r\n                </div>\r\n            </div>\r\n\r\n        </div>\r\n    </div>\r\n    <!--/main slider carousel-->\r\n\r\n</div>\r\n<script>\r\n    $(\"#menu-toggle\").click(function (e) {\r\n        e.preventDefault();\r\n        $(\"#wrapper\").toggleClass(\"toggled\");\r\n    });\r\n    $('#myCarousel').carousel({\r\n        interval: 4000\r\n    });\r\n\r\n    // handles the carousel thumbnails\r\n    $('[id^=carousel-selector-]').click(function () {\r\n        var id_selector = $(this).attr(\"id\");\r\n        var id = id_selector.substr(id_selector.length - 1);\r\n        id = parseInt(id);\r\n        $('#myCarousel').carousel(id);\r\n        $('[id^=carousel-selector-]').removeClass('selected');\r\n        $(this).addClass('selected');\r\n    });\r\n\r\n    // when the carousel slides, auto update\r\n");
      out.write("    $('#myCarousel').on('slid', function (e) {\r\n        var id = $('.item.active').data('slide-number');\r\n        id = parseInt(id);\r\n        $('[id^=carousel-selector-]').removeClass('selected');\r\n        $('[id=carousel-selector-' + id + ']').addClass('selected');\r\n    });\r\n</script>\r\n</div>\r\n</body>\r\n</html>\r\n");
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
    _jspx_th_security_authorize_0.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_authorize_0 = _jspx_th_security_authorize_0.doStartTag();
    if (_jspx_eval_security_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n        <a class=\"page-scroll\" href=\"/admin/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${albumId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/addPhoto\">Add photo</a>\r\n    ");
    }
    if (_jspx_th_security_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pictures}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("picture");
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(pictures)}", java.lang.Integer.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).intValue());
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                <li><a id=\"carousel-selector-status\">\r\n                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${picture.directoryMini}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\">\r\n                </a></li>\r\n            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.reuse(_jspx_th_c_forEach_0);
    }
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
    _jspx_th_security_authorize_1.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_authorize_1 = _jspx_th_security_authorize_1.doStartTag();
    if (_jspx_eval_security_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n                                <a href=\"/admin/updatePhoto/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pictures[0].id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-warning btn-sm\"\r\n                                   style=\"padding: 0; border: 3px\">Update</a>\r\n                                <a href=\"/admin/deletePhoto/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pictures[0].id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${albumId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-danger btn-sm\"\r\n                                   style=\"padding: 0; border: 3px\">Delete</a>\r\n                                </p>\r\n                            ");
    }
    if (_jspx_th_security_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pictures}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("picture");
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(pictures)}", java.lang.Integer.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).intValue());
    _jspx_th_c_forEach_1.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                            <div class=\"item\" data-slide-number=\"status\" align=\"center\">\r\n                                ");
          if (_jspx_meth_security_authorize_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${picture.directory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\">\r\n                            </div>\r\n                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_security_authorize_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_2.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_security_authorize_2.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_authorize_2 = _jspx_th_security_authorize_2.doStartTag();
    if (_jspx_eval_security_authorize_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n                                    <a href=\"/admin/updatePhoto/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${picture.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-warning btn-sm\"\r\n                                       style=\"padding: 0; border: 3px\">Update</a>\r\n                                    <a href=\"/admin/deletePhoto/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${picture.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${albumId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-danger btn-sm\"\r\n                                       style=\"padding: 0; border: 3px\">Delete</a>\r\n                                    </p>\r\n                                ");
    }
    if (_jspx_th_security_authorize_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_2);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_2);
    return false;
  }
}
