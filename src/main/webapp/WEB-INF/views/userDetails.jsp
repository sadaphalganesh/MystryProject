
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>

<h3>SIGNUP</h3>

<form:form action="saveUserDetails" modelAttribute="userDetails">
First name<form:input path="firstName"/>
<br>

Last Name<form:input path="lastName"/>
<br>
Gender: Male <form:radiobutton path="gender" id="gender" value="male"/><br>
		Female   <form:radiobutton path="gender" id="gender" value="female"/><br>		
<br>

Contact<form:input path="contactNo"/>

<br>
Verification Id<select name="vId" onchange=putVal(this.value)>
	<option value="AdharCard">Adhar card</option>
	<option value="Pancard">Pan</option>
	<option value="Driving Licence"> DrivingLicence</option>
</select> 

<form:input path="verificationId"/>
<br>

Email<form:input path="emailId"/>

<input type="submit" value="Save">
</form:form>
</body>
</html>
