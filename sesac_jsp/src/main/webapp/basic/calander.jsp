<%@ page import="java.util.Calendar" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //scriptlet
	Calendar c = Calendar.getInstance();
	int year = 2024;
	int month = 10;
	c.set(year, month-1, 1);
	
	int day = c.get(Calendar.DAY_OF_WEEK);
	int endday = c.getActualMaximum(Calendar.DATE);
	%>
<tr>
<%
for (int d = 1; d < day; d++) {
	out.print("<td>1</td>");
}
%>
</tr>
</body>
</html>