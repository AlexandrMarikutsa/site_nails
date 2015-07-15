<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aleksander
  Date: 22.06.2015
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Design</title>

<jsp:include page="source.jsp"></jsp:include>
</head>
<body>
<jsp:include page="myNavbar.jsp"></jsp:include>
<div id="wrapper">
    <jsp:include page="sidebar.jsp"></jsp:include>
    <div align="center">
        <form method="POST" enctype="multipart/form-data" action="/admin/upload/${albumId}">
            File to upload: <input id="input-2" type="file" class="file" multiple="true" name="file" data-show-upload="false" data-show-caption="true"><br /> Name:
            <input type="text" name="photoName"><br /> <br /> <input type="submit"
                                                                     value="Upload"> Press here to upload the file!
        </form>
    </div>
    <script>
        $("#menu-toggle").click(function(e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });
    </script>
</div>
</body>
</html>
