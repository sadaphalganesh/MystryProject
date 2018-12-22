
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>

<h3>SIGNUP</h3>

<form:form action="saveUserData" modelAttribute="user">
UserName<form:input path="userName"/>
<br>

Password <form:input path="userPass"/>
<br>
UserType: Agent <form:radiobutton path="userType" id="userType" label="Agent" value="Agent"/><br>
		  Admin    <form:radiobutton path="userType" id="userType" label="Admin" value="Admin"/><br>
		 Client    <form:radiobutton path="userType" id="userType" label="Client" value="Client"/><br>
<br>
<input type="submit" value="Save">
</form:form>
</body>
</html>
