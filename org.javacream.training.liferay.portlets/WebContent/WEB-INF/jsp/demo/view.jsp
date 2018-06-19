<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<portlet:defineObjects/>
<h1>A SIMPLE JSP PAGE</h1>
<div align="center">
	Hello World from View Mode!!!
	<hr />
	<p />
	<a href="<portlet:renderURL portletMode="edit"></portlet:renderURL>">edit</a> 
	<p />
	<a href="<portlet:renderURL portletMode="help"></portlet:renderURL>">help</a> 

	<p />
	<a href="<portlet:actionURL ></portlet:actionURL>">ACTION!</a>

	<p />
	
	<form action="<portlet:actionURL />" method="post">
		<input type="text" name="message" value="change me"/>	
		<input type="submit" value="Click me!" />	
	</form>	 
	Result from Java Call: ${javaResult}
	Result from Java Call with result: ${result}
	<p />
	Data: ${data[0]}, ${data[1]} 
</div>
