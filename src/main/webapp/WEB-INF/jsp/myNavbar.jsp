<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="username" value="${pageContext.request.userPrincipal.name}"/>
<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>

        </button>
        <i class="navbar-brand fa fa-bars fa-2x" id="menu-toggle"style="margin-top:-5px"></i>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <security:authorize access="hasRole('ROLE_ADMIN')">
            <a href="/admin" enabled="false"><i class="fa" style="color:blue"></i>${username}</a>
        </security:authorize>
        <security:authorize access="hasRole('ROLE_USER')">
            <a href="/user" enabled="false"><i class="fa" style="color:blue"></i>${username}</a>
        </security:authorize>

        <!-- /.dropdown -->
        <li class="dropdown">
            <security:authorize access="hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')">
                <li><a href="<c:url value="/j_spring_security_logout"/>"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
            </security:authorize>
            <security:authorize access="hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')">
                <ul class="dropdown-menu dropdown-user">
                    <li class="divider"></li>
                    <li><a href="/auth?logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a></li>
                </ul>
            </security:authorize>
            <security:authorize access="!hasRole('ROLE_ADMIN') and !hasRole('ROLE_USER')">
               <ul>
                    <li><a href="/registration"><i class="fa fa-gear fa-fw"></i>Register</a></li>
                    <li><a href="/auth"><i class="fa fa-sign-out fa-fw"></i> Login</a></li>
                </ul>
            </security:authorize>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>


    <!-- /.navbar-top-links -->

    <!-- /.navbar-static-side -->

</nav>

