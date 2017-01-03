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
	<%
		String test_one = (String) request.getAttribute("test_one"); // you always must cast to current type
	%>
	<%=test_one%>
	<p>
	<h3>request.getParameterValues(String parameter);</h3>
	<%
		List test_all = (List) request.getAttribute("test_all");
		it = test_all.iterator();

		while (it.hasNext()) {
			out.print("<br>" + it.next());
		}
	%>

	<p>
</body>
</html>