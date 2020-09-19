<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
<<<<<<< HEAD
	pageEncoding="ISO-8859-1" %>

<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
=======
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
>>>>>>> refs/remotes/origin/master

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title }</title>

<script>
	window.menu = '${title }';
</script>

<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- theme CSS -->
<link href="${css }/bootstrap.happen2.css" rel="stylesheet">


<!-- Add custom CSS here -->
<link href="${css }/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">

		<!-- navigation bar-->
<<<<<<< HEAD
		<%@include file="./shared/navbar.jsp" %>
=======
		<%@include file="./shared/navbar.jsp"%>
>>>>>>> refs/remotes/origin/master

		<!-- page content -->
		<div class="content">
			<!-- loading the home content -->
			<c:if test="${userClickHome == true }">
<<<<<<< HEAD
				<%@include file="home.jsp" %>
=======
				<%@include file="home.jsp"%>
>>>>>>> refs/remotes/origin/master
			</c:if>

			<!-- Load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
<<<<<<< HEAD
				<%@include file="about.jsp" %>
=======
				<%@include file="about.jsp"%>
>>>>>>> refs/remotes/origin/master
			</c:if>

			<!-- Load only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
<<<<<<< HEAD
			
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true }">
				<%@include file="listProducts.jsp"%>
			</c:if>
=======
>>>>>>> refs/remotes/origin/master
 
		</div>

		<!-- footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- self coded java script -->
		<script src="${js}/myapp.js"></script>


	</div>

</body>

</html>
