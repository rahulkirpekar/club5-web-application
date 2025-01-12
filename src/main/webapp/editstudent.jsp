<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="com.royal.bean.StudentBean"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Edit Student Record</title>
</head>
<body>
	<h3>Edit Student Record</h3>

<%
		StudentBean sbean = (StudentBean)request.getAttribute("sbean");
%>

	<form action="updateStudentServlet" method="post">
			<table>
				<tr>
					<td>Rno </td>
					<td><input type="text" name="rno" value="<%=sbean.getRno()%>" readonly> </td>
				</tr>
				<tr>
					<td>Name </td>
					<td><input type="text" name="name" value="<%=sbean.getName()%>"> </td>
				</tr>
				<tr>
					<td>Std</td>
					<td><input type="text" name="std" value="<%=sbean.getStd()%>"> </td>
				</tr>
				<tr>
					<td>Marks</td>
					<td><input type="text" name="marks" value="<%=sbean.getMarks()%>"> </td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"> </td>
				</tr>
			</table>
		</form>


</body>
</html>
