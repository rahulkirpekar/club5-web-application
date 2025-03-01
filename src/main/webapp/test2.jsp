<?xml version="1.0" encoding="UTF-8" ?>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
	
	<c:out value="${'Welcome to Royal'}"/>  
	
	
	<c:set var="fruits" value="${['Apple', 'Banana', 'Mango']}" />
	
	<ul>
        <c:forEach var="fruit" items="${fruits}">
            <li>${fruit}</li>
        </c:forEach>
    </ul>
	
	<c:set var="number" value="4" />
    <c:if test="${number > 5}">
        <p>The number is greater than 5.</p>
    </c:if>
	
</body>
</html>
