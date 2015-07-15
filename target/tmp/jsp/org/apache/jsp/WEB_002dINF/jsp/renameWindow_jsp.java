package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class renameWindow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n<html>\r\n<head>\r\n    <title></title>\r\n  <link rel=\"stylesheet\" type=\"text/css\" href=\"modal-contact-form.css\" />\r\n</head>\r\n<body>\r\n<a class=\"show-btn\" href=\"javascript:void(0)\" onclick = \"document.getElementById('envelope').style.display='block';document.getElementById('fade').style.display='block'\">Обратная связь</a>\r\n<div id=\"envelope\" class=\"envelope\">\r\n  <a class=\"close-btn\" href=\"javascript:void(0)\" onclick = \"document.getElementById('envelope').style.display='none';document.getElementById('fade').style.display='none'\">Закрыть</a>\r\n  <h1 class=\"title\">Отправить нам сообщение</h1>\r\n  <form method=\"post\" action=\"путь до обработчика\">\r\n    <input type=\"text\" name=\"sender_name\" onclick=\"this.value='';\" onfocus=\"this.select()\" onblur=\"this.value=!this.value?'* Ваше Имя':this.value;\" value=\"* Ваше Имя\" class=\"your-name\"/>\r\n    <input type=\"text\" name=\"sender_email\" onclick=\"this.value='';\" onfocus=\"this.select()\" onblur=\"this.value=!this.value?'* Ваш Email':this.value;\" value=\"* Ваш Email\" class=\"email-address\"/>\r\n");
      out.write("    <textarea class=\"your-message\">Пожалуйста, введите своё сообщение здесь ..</textarea>\r\n    <input type=\"submit\" name=\"send\" value=\"Отправить\" class=\"send-message\">\r\n  </form>\r\n</div>\r\n</body>\r\n</html>\r\n");
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
