<%@ page import="java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
		<%
			List styles = (List) request.getAttribute("styles");
			Iterator it = styles.iterator();

			while (it.hasNext()) {
				out.print("<br>try: " + it.next());
			}
		%>
	
	<p>
	<h3>request.getParameterValues(String parameter)[int index];</h3>
</body>
</html>