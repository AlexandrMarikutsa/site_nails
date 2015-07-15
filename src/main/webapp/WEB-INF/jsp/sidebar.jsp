<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Sidebar -->
<div id="sidebar-wrapper">
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <security:authorize access="hasRole('ROLE_ADMIN')">
                    <li class="text-center" style="margin-top: -15px" >
                        <h3>Admin Panel</h3>
                    </li>
                    <li>
                        <a href="#" class="text-left">Users</a>
                    </li>
                </security:authorize>
                <security:authorize access="hasRole('ROLE_USER') or hasRole('ROLE_ANONYMOUS')">
                    <li class="text-center" style="margin-top: -15px" >
                        <h3>User Panel</h3>
                    </li>
                </security:authorize>
                 <%--</security:authorize>--%>
                <security:authorize access="hasRole('ROLE_USER') or hasRole('ROLE_ANONYMOUS') or hasRole('ROLE_ADMIN')">
                    <li>
                        <a href="/design" class="text-left">Design</a>
                    </li>
                </security:authorize>
                <li>
                    <a href="#" class="text-left">Posts</a>
                </li>
                <li>
                    <a href="#" class="text-left">Price and service</a>
                </li>
                <security:authorize access="hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')">
                    <li>
                        <a href="#" class="text-left">Info about me</a>
                    </li>
                </security:authorize>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
</div>