<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Aleksander
  Date: 10.07.2015
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" href="css/bootstrap-image-gallery.min.css">
<title>Design</title>

<jsp:include page="source.jsp"></jsp:include>
</head>
<body>
  <jsp:include page="myNavbar.jsp"></jsp:include>
  <div id="wrapper">
    <jsp:include page="sidebar.jsp"></jsp:include>

      <div id="page-content-wrapper">
        <div class="container-fluid">
          <div class="row">
              <p>Photo name</p>
              <input id ='photoName' type='text' value='${picture.name}' name="photoName"/>
              <select size='1' id='albumId'>
                <option selected value="${picture.album.id}">${picture.album.name}</option>
                <c:forEach items="${albums}" var="album">
                  <option value="${album.id}">${album.name}</option>
                </c:forEach>
              </select>
            <p><input type='button' value='Save edits' onclick='saveUpdate();'/></p>
          </div>
        </div>
      </div>
    <script>
        $("#menu-toggle").click(function(e) {
          e.preventDefault();
          $("#wrapper").toggleClass("toggled");
        });

        function saveUpdate() {
          $.ajax({
            url:"/admin/saveUpdatePhoto",
            type:"post",
            data:{photoName:$('#photoName').val(),photoId:${picture.id},albumId:$('#albumId').val()},
            success : function(data) {
              window.location = data;
            }
          });

        }
    </script>
  </div>
</body>
</html>
