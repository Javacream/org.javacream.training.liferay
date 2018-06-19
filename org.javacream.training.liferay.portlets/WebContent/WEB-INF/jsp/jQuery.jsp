<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<portlet:defineObjects />
<script type="text/javascript">
function doAjax(){
	jQuery.get("<portlet:resourceURL/>", function(result){
		alert("Result: " + result);
	});
}

</script>

<div align="center">Using JSP for portal view. Please enter your
name! <br />
<input type="button" value="doAjax" onclick="doAjax()" />
<form
	action="<portlet:actionURL><portlet:param name="page"
    value="view"/></portlet:actionURL>"
	method="POST">Name: <input type="text" name="name" /></form>
<br />
</div>
