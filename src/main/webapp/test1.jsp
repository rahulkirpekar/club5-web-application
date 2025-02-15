
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>Royal Techno</h2>
	
	<%
		for(int i = 1 ; i <= 10 ; i++)
		{
			out.print(5+" * " + i + " = " + (5*i)+"<br>");
		}
	%>
	
	<%="Royal Technosoft Private Limited "%>
	<br>
	
	<%!
		int getCube(int no)
		{
			return (no*no*no);	
		}
	%>
	
		<br>Ans is <%=getCube(10) %>	
	
</body>
</html>
