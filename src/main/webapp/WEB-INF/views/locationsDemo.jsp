<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="com.ingecno.dmart.service.LocationService"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<script type="text/javascript">
function selectCountry(){
	var abc=document.getElementById("countries").value;
		//window.location.replace("/views/locationsDemo.jsp?abc="+abc);
		//document.getElementById("states").hidden="false";
		alert("ashbdvbasdbbs "+abc);

<%
	Map<String, Map<String,List<String>>> map=(Map)request.getAttribute("state");
	out.println(map);	
 %>
 <% 
String country="<script>window.write(abc)</script>";
String abc="india";
	out.println(country);
	Map<String,List<String>> map2=map.get(country);
	out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvv");
	out.println(map2);
%>		

return map2;

}
</script>
<html>
<body>


<h2>Hello World!</h2>
 <br>
<select id="countries" name="countries" onchange="selectCountry()">
<c:forEach var="list" items="${state}">
		<option value="${list.key}">${list.key}</option>
</c:forEach>
</select>


<select id="states" name="states">
<c:forEach var="state" items="return selectCountry()">
			<option value="${state.key}">${state.key}</option>
</c:forEach>


</select>
<br><br><br>
</body>
</html>
