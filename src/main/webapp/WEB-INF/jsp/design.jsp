<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aleksander
  Date: 13.06.2015
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Designs</title>
  <jsp:include page="source.jsp"></jsp:include>
</head>
<body>
<jsp:include page="myNavbar.jsp"></jsp:include>
<div id="wrapper">
  <jsp:include page="sidebar.jsp"></jsp:include>
  <security:authorize access="hasRole('ROLE_ADMIN')">
    <a class="page-scroll" href="#">Add album</a>
  </security:authorize>

  <div id="items">
    <div class=" item masonry-brick">
      <jsp:useBean id="random" class="java.util.Random" scope="page"/>
      <c:forEach items="${albums}" var="album">
        <div class="picture">
          <p><a href="/album/${album.id}">
            <c:choose>
              <c:when test="${not empty album.pictures}">
                <img src="${album.pictures[random.nextInt(album.pictures.size())].directory}"  id="myPicture" width="100%" , height="70%" align="top"></a></p>
              </c:when>
            </c:choose>
          <c:choose>
            <c:when test="${empty album.pictures}">
              <img src="/pictures_nails/camera.png"  id="myPicture" width="100%" , height="70%" align="top"></a></p>
            </c:when>
          </c:choose>
          <div class="item-content">
            <div class="description">
              <p align="center"><a id=${album.id+2} href="/album/${album.id}">${album.name}</a>
                <security:authorize access="hasRole('ROLE_ADMIN')">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <a id=${album.id} onclick="showInput(${album.id+2})" class="btn btn-warning btn-sm" style="padding: 0; border: 3px">Update</a>
                  <a href="#" class="btn btn-danger btn-sm" style="padding: 0; border: 3px">Delete album</a>
                </security:authorize>
              </p>
            </div>
          </div>
        </div>
      </c:forEach>
    </div>
  </div>
  <script>
      $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
      });

      function showInput(data){
          $('#'+data).html('<input type="text""/>' +
          '<a href="#" class="btn btn-warning btn-sm" style="padding: 0; border: 3px">SAVE</a>')
      }

     </script>
</div>
</body>
</html>
