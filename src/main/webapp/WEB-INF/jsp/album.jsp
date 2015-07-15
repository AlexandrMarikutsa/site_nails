<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
  <link rel="stylesheet" href="css/bootstrap-image-gallery.min.css">
  <title>Design</title>

  <jsp:include page="source.jsp"></jsp:include>
</head>
<body>
<jsp:include page="myNavbar.jsp"></jsp:include>
<div id="wrapper">
  <jsp:include page="sidebar.jsp"></jsp:include>
  <security:authorize access="hasRole('ROLE_ADMIN')">
    <a class="page-scroll" href="/admin/${albumId}/addPhoto">Add photo</a>
  </security:authorize>
  <p class="container">
    <!-- thumb navigation carousel -->
    <div class="col-md-12 hidden-sm hidden-xs" id="slider-thumbs">

      <!-- thumb navigation carousel items -->
      <ul class="list-inline">
        <li> <a id="carousel-selector-0" class="selected">
          <img src="${pictures[0].directoryMini}" class="img-responsive">
        </a></li>
        <c:forEach items="${pictures}" var="picture" begin="1" end="${fn:length(pictures)}" varStatus="status">
          <li> <a id="carousel-selector-status">
            <img src="${picture.directoryMini}" class="img-responsive">
          </a></li>
        </c:forEach>
      </ul>

    </div>


    <!-- main slider carousel -->
    <div class="row">
      <div class="col-md-12" id="slider">

        <div class="col-md-12" id="carousel-bounding-box">
          <div id="myCarousel" class="carousel slide">
            <!-- main slider carousel items -->
            <div class="carousel-inner">
              <div class="active item" data-slide-number="0" align="center">
                <security:authorize access="hasRole('ROLE_ADMIN')">
                  <a href="/admin/updatePhoto/${pictures[0].id}" class="btn btn-warning btn-sm" style="padding: 0; border: 3px">Update</a>
                  <a href="/admin/deletePhoto/${pictures[0].id}/${albumId}" class="btn btn-danger btn-sm" style="padding: 0; border: 3px">Delete</a>
                  </p>
                </security:authorize>
                <img src="${pictures[0].directory}" class="img-responsive">
              </div>
              <c:forEach items="${pictures}" var="picture" begin="1" end="${fn:length(pictures)}" varStatus="status">
                  <div class="item" data-slide-number="status" align="center">
                    <security:authorize access="hasRole('ROLE_ADMIN')">
                      <a href="/admin/updatePhoto/${picture.id}" class="btn btn-warning btn-sm" style="padding: 0; border: 3px">Update</a>
                      <a href="/admin/deletePhoto/${picture.id}/${albumId}" class="btn btn-danger btn-sm" style="padding: 0; border: 3px">Delete</a>
                      </p>
                    </security:authorize>
                    <img src="${picture.directory}" class="img-responsive">
                  </div>
              </c:forEach>
            </div>
            <!-- main slider carousel nav controls -->
            <a class="carousel-control left" href="#myCarousel" data-slide="prev">‹</a>
            <a class="carousel-control right" href="#myCarousel" data-slide="next">›</a>
          </div>
        </div>

      </div>
    </div>
    <!--/main slider carousel-->

  </div>
<script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
    $('#myCarousel').carousel({
      interval: 4000
    });

    // handles the carousel thumbnails
    $('[id^=carousel-selector-]').click( function(){
      var id_selector = $(this).attr("id");
      var id = id_selector.substr(id_selector.length -1);
      id = parseInt(id);
      $('#myCarousel').carousel(id);
      $('[id^=carousel-selector-]').removeClass('selected');
      $(this).addClass('selected');
    });

    // when the carousel slides, auto update
    $('#myCarousel').on('slid', function (e) {
      var id = $('.item.active').data('slide-number');
      id = parseInt(id);
      $('[id^=carousel-selector-]').removeClass('selected');
      $('[id=carousel-selector-'+id+']').addClass('selected');
    });
</script>
</div>
</body>
</html>
