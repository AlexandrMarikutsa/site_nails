<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>M.N. Nails</title>

    <jsp:include page="source.jsp"></jsp:include>


</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

<!-- Navigation -->
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href="#page-top">
                <i class="fa fa-play-circle"></i> <span class="light">Home</span>
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
                <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                <li class="hidden">
                    <a href="#page-top"></a>
                </li>

                <security:authorize access="!hasRole('ROLE_ADMIN') and !hasRole('ROLE_USER')">
                    <li>
                        <a class="page-scroll" href="/about">About</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="/auth">Login</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="/registration">Register</a>
                    </li>
                </security:authorize>
                <security:authorize access="hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')">
                    <li>
                        <a class="page-scroll" href="/about">About</a>
                    </li>
                    <security:authorize access="hasRole('ROLE_ADMIN')">
                        <li>
                            <a class="page-scroll" href="/admin">My account</a>
                        </li>
                    </security:authorize>
                    <security:authorize access="hasRole('ROLE_USER')">
                        <li>
                            <a class="page-scroll" href="/user">My account</a>
                        </li>
                    </security:authorize>
                    <li>
                        <a class="page-scroll" href="<c:url value="/j_spring_security_logout"/>">Logout</a>
                    </li>
                </security:authorize>

            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Intro Header -->
<header class="intro">
    <div class="intro-body">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <p class="intro-text">I can make you feel happy...</p>
                    <%--<a href="#about" class="btn btn-circle page-scroll">--%>
                    <%--<i class="fa fa-angle-double-down animated"></i>--%>
                    <%--</a>--%>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- About Section -->
<div class="content-section text-center" id="about">

    <div class="container">
        <h2>Made by Olexandr Marikutsa</h2>
        <hr>
    </div>
</div>

</body>

</html>
